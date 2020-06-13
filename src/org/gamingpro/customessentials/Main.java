package org.gamingpro.customessentials;

import org.bukkit.plugin.java.JavaPlugin;
import org.gamingpro.customessentials.commands.FlyCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		new FlyCommand(this);
	}

}
