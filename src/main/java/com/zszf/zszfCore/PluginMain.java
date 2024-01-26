package com.zszf.zszfCore;

import com.zszf.zszfCore.listener.Listeners;
import org.bukkit.ChatColor;
import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

public class PluginMain extends JavaPlugin {
    public static JavaPlugin instance;
    public static Logger logger;
    public static Configuration config;
    public static Map<UUID, ItemStack> dupeWitherList;
    public static Map<UUID, ItemStack> dupeChickenList;

    @Override
    public void onEnable() {
        instance = this;
        logger = getLogger();
        config = getConfig();
        logger.info(ChatColor.RED + "===================================================================================================================================================");
        logger.info(ChatColor.RED + "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                   ||||||                                                                                \n" +
                "                                                                  |||||||                                                                                \n" +
                "                                                                 ||||||||                                                                                \n" +
                "                                                                |||||||||                                                                                \n" +
                "                                                                |||||                                                                                    \n" +
                "                                                                |||||                                                                                    \n" +
                "                                                                |||||                                                                                    \n" +
                "                |||||||||||||       |||||||   |||||||||||||  |||||||||||       ||||||          |||||||        |||||  |||       ||||||                    \n" +
                "                |||||||||||||     ||||||||||  |||||||||||||  |||||||||||     |||||||||       |||||||||||      ||||| ||||     |||||||||                   \n" +
                "                |||||||||||||    |||||||||||  |||||||||||||  |||||||||||   |||||||||||     ||||||||||||||     ||||||||||    |||||||||||                  \n" +
                "                |||||||||||||   ||||||     |  |||||||||||||  |||||||||||  ||||||||||||    ||||||||||||||||    ||||||||||   ||||||   ||||                 \n" +
                "                       |||||    |||||                |||||      |||||     ||||||     |    ||||||    ||||||    |||||||  |   |||||     |||                 \n" +
                "                      |||||     |||||               |||||       |||||    ||||||          ||||||      ||||||   ||||||      |||||      ||||                \n" +
                "                     |||||      ||||||             |||||        |||||    |||||           |||||        |||||   |||||       |||||      ||||                \n" +
                "                    ||||||       ||||||||         ||||||        |||||    |||||           |||||        |||||   |||||       |||||||||||||||                \n" +
                "                    |||||         |||||||||       |||||         |||||    |||||           |||||        |||||   |||||       |||||||||||||||                \n" +
                "                   |||||           |||||||||     |||||          |||||    |||||           |||||        |||||   |||||       |||||||||||||||                \n" +
                "                  |||||               |||||||   |||||           |||||    |||||           |||||        |||||   |||||       |||||                          \n" +
                "                  |||||                 |||||   |||||           |||||    ||||||          ||||||      ||||||   |||||       |||||                          \n" +
                "                 |||||                  |||||  |||||            |||||     ||||||     |    ||||||    ||||||    |||||        |||||                         \n" +
                "                |||||||||||||   ||     |||||| |||||||||||||     |||||     ||||||||||||    ||||||||||||||||    |||||        ||||||      |                 \n" +
                "               ||||||||||||||   |||||||||||| ||||||||||||||     |||||      |||||||||||     ||||||||||||||     |||||         ||||||||||||                 \n" +
                "               ||||||||||||||   |||||||||||  ||||||||||||||     |||||       ||||||||||      |||||||||||       |||||          |||||||||||                 \n" +
                "               ||||||||||||||    ||||||||    ||||||||||||||     |||||         |||||||         |||||||         |||||            |||||||                   \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n" +
                "                                                                                                                                                         \n");
        logger.info(ChatColor.RED + "===================================================================================================================================================");
        Listeners listeners = new Listeners();
        listeners.reg(this);
    }

    @Override
    public void onLoad() {
        saveDefaultConfig();
    }
}
