package org.gamingpro.flycommand.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.gamingpro.flycommand.Main;

public class FlyCommand implements CommandExecutor {

	private Main plugin;

	public FlyCommand(Main plugin) {
		this.plugin = plugin;
		this.plugin.getCommand("fly").setExecutor(this);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		String noPermission = this.plugin.getConfig().getString("no-perm-message");
		String flyEnabled = this.plugin.getConfig().getString("flying-enabled");
		String flyDisabled = this.plugin.getConfig().getString("flying-disabled");
		String consoleErrorMessage = this.plugin.getConfig().getString("console-error-message");

		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', consoleErrorMessage));
			return true;
		}
		
		Player player = (Player) sender;

		if (player.hasPermission("customessentials.fly")) {
			if (player.isFlying() || player.getAllowFlight()) {
				player.setFlying(false);
				player.setAllowFlight(true);
				player.setFallDistance(-500);
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', flyDisabled));	
				return true;
			} else {
				player.setAllowFlight(true);
				player.setFlying(true);
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', flyEnabled));
				return true;
			}
		}
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', noPermission));
		return false;
	}
}