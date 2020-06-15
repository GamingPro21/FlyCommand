package org.gamingpro.customessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
	
	private Main plugin;
	
	public FeedCommand(Main Plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("feed").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
 		if (!(sender instanceof Player)) {
 			sender.sendMessage("&eOnly Players May Execute This Command");
 			return true;
 			
 		}
 		
 		Player p = (Player) sender;
 		
 		if (p.hasPermission("customessentials.feed")) {

 			int maxFoodLevel = 20;
 			
 			if p.getFoodLevel() < 20; {
 				p.setFoodLevel(maxFoodLevel);
 				p.sendMessage("&6You Have Been Fully Fed");
 			} else {
 				p.sendMessage("&cYou are already full");
 			}
 			
 			return true;
 			} else {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', nopermissionmessage));
 			}
 		
		return false;
	}

}
