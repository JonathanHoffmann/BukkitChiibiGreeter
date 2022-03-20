package me.Jonnyfant.ChiibiGreeter;

import org.bukkit.plugin.java.JavaPlugin;

public class ChiibiGreeter extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChiibiJoinListener(),this);
    }
}
