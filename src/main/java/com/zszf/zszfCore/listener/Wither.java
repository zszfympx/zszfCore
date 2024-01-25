package com.zszf.zszfCore.listener;

import com.zszf.zszfCore.PluginMain;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Wither implements Listener {
    @EventHandler
    public void interactAtWither(PlayerInteractEntityEvent event) {
        if (event.getRightClicked().getType().equals(EntityType.WITHER)) {
            if (!event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
                if (event.getPlayer().hasPermission("zszfCore.witherDupe")) {
                    PluginMain.dupeWitherList.put(event.getRightClicked().getUniqueId(), event.getPlayer().getActiveItem());
                    event.getRightClicked().setCustomName("Dupe Wither");
                    event.getRightClicked().setCustomNameVisible(true);
                }
            }
        }
    }

    @EventHandler
    public void killWither(EntityDeathEvent event) {
        if (event.getEntityType().equals(EntityType.WITHER)) {
            if (PluginMain.dupeWitherList.get(event.getEntity().getUniqueId()) != null) {
                for (int i = 0; i < PluginMain.config.getInt("wither.num"); i++) {
                    event.getEntity().getLocation().getWorld().dropItem(event.getEntity().getLocation(), PluginMain.dupeWitherList.get(event.getEntity().getUniqueId()));
                }
            }
        }
    }
}
