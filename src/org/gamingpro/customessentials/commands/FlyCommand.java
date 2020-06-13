package org.gamingpro.customessentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;
import org.gamingpro.customessentials.utils.Utils;

public class FlyCommand implements CommandExecutor {

	private Main plugin;

	public FlyCommand(Main Plugin) {
		this.plugin = plugin;
		
		plugin.getCommand
}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof Player))
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("console_error_message")));
		return true;

	}

	Player p = (Player) sender;

	if(p.hasPermission("customessentials.fly"))
	{
		if (p.isFlying())
			p.setFlying(false);
		p.setAllowFlight(false);
		p.sendMessage(Utils.chat(plugin.getConfig().getString("FlyCommand.flying_disabled")));
		return true;
	}else
	{
		p.setFlying(true);
		p.setAllowFlight(true);
		p.sendMessage(Utils.chat(plugin.getConfig().getString("FlyCommand.flying_enabled")));
	}
}else{p.sendMessage(Utils.chat(plugin.getConfig().getString("no_perm_message")));}return false;}

}
