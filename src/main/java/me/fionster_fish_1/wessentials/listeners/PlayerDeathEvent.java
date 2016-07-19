package me.fionster_fish_1.wessentials.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.fionster_fish_1.wessentials.WEssentials;

public class PlayerDeathEvent implements Listener {

    int min;
    int max;
    static String upper;
    public static WEssentials plugin;

    public PlayerDeathEvent(WEssentials instance) {
        plugin = instance;
    }

    @EventHandler
    public void PDM(org.bukkit.event.entity.PlayerDeathEvent e) {
        Player player = e.getEntity();
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9*Queue Sad Violin*"));
    }
}
