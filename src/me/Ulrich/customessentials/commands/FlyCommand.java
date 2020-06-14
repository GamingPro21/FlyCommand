package me.Ulrich.customessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Ulrich.customessentials.Main;

public class FlyCommand implements CommandExecutor {

	private Main plugin;

	public FlyCommand(Main plugin) {
		this.plugin = plugin;
		this.plugin.getCommand("fly").setExecutor(this);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lThe console doesn't fly! ;)"));
			return true;
		}
		
		Player player = (Player) sender;

		if (player.hasPermission("customessentials.fly")) {
			if (player.isFlying()) {
				player.setFlying(false);
				player.setAllowFlight(false);
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "Flying &4disabled"));	
				return true;
			} else {
				player.setFlying(true);
				player.setAllowFlight(true);
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "Flying &aenabled"));
				return true;
			}
			
		}
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lYou can't fly."));
		return false;
	}
}
