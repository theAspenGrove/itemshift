package net.mov51.ItemShift.util;

import net.mov51.ItemShift.ItemShift;
import org.bukkit.configuration.file.FileConfiguration;

public class configHelper {
    public static FileConfiguration c;
    public static String pluginPrefix;
    public static int levelCost;
    public static int mendingMultiplier;
    public static int nuggetCost;

    public static void loadConfig(){
        c = ItemShift.plugin.getConfig();
        levelCost = (c.getInt("level-cost") != 0 ? c.getInt("level-cost") : 1);
        pluginPrefix = c.getString("chat-prefix") != null ? c.getString("chat-prefix") : "§8[§6ItemShift§8]§r ";
        nuggetCost = (c.getInt("nugget-cost") != 0 ? c.getInt("nugget-cost") : 1);
        mendingMultiplier = (c.getInt("mending-multiplier") != 0 ? c.getInt("mending-multiplier") : 5);
    }
}
