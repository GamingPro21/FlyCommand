package org.gamingpro.customessentials;

import org.bukkit.plugin.java.JavaPlugin;
import org.gamingpro.customessentials.Files.DataManager;
import org.gamingpro.customessentials.commands.FlyCommand;

public class Main extends JavaPlugin {
	
	public static DataManager data;

	@Override
	public void onEnable() {
		
		this.saveDefaultConfig();
		data = new DataManager(this);
		new FlyCommand(this);
		
	}
	
}
