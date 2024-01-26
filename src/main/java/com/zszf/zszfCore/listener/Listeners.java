package com.zszf.zszfCore.listener;

import org.bukkit.plugin.java.JavaPlugin;

public class Listeners {
    public void reg(JavaPlugin instance) {
        if (instance.getConfig().getBoolean("wither.enable")) {
            instance.getServer().getPluginManager().registerEvents(new Wither(), instance);
        }
    }
}
