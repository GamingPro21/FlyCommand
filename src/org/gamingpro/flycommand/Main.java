package org.gamingpro.flycommand;

import org.gamingpro.flycommand.Files.DataManager;
import org.gamingpro.flycommand.commands.FlyCommand;

public class Main extends JavaPlugin {
	
	public static DataManager data;

	@Override
	public void onEnable() {
		
		this.saveDefaultConfig();
		data = new DataManager(this);
		new FlyCommand(this);
		
	}
	
}
