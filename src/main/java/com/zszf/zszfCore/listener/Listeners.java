package com.zszf.zszfCore.listener;

import com.zszf.zszfCore.PluginMain;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

public class Listeners {
    private final List<Listener> listenerList = new ArrayList<>();
    public void reg(){
        if(PluginMain.config.getBoolean("wither.enable")){
            listenerList.add(new Wither());
        }
        for (Listener i : listenerList) {
            PluginMain.instance.getServer().getPluginManager().registerEvents(i, PluginMain.instance);
        }
    }
}
