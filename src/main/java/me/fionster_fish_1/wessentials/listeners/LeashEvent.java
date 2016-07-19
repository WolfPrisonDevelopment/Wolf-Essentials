package me.fionster_fish_1.wessentials.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.event.entity.PlayerLeashEntityEvent;

public class LeashEvent implements Listener {

    int min;
    int max;
    static String upper;
    public static WEssentials plugin;
    public LeashEvent(WEssentials instance) {
        plugin = instance;
    }

    @EventHandler
    public void LeashEvent(PlayerLeashEntityEvent e) {
        Player player = e.getPlayer();
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Your Mine Now!"));
    }
}
