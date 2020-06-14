package me.Ulrich.customessentials;

import org.bukkit.plugin.java.JavaPlugin;
import me.Ulrich.customessentials.commands.FlyCommand;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new FlyCommand(this);
	}
	
}
