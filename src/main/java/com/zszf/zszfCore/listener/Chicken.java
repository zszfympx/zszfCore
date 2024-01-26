package com.zszf.zszfCore.listener;

import com.zszf.zszfCore.PluginMain;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Chicken implements Listener {

    @EventHandler
    public void interactAtChicken(PlayerInteractEntityEvent event) {
        if (event.getRightClicked().getType().equals(EntityType.CHICKEN)) {
            if (event.getPlayer().getActiveItem().getType().equals(Material.AIR)) {
                if (event.getPlayer().hasPermission("zszfcore.chickenDupe")) {
                    PluginMain.dupeChickenList.put(event.getRightClicked().getUniqueId(), event.getPlayer().getActiveItem());

                }
            }
        }
    }
}
