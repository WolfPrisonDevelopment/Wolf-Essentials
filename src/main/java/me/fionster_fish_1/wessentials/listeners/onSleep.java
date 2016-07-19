package me.fionster_fish_1.wessentials.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class onSleep implements Listener {

    int min;
    int max;
    static String upper;
    public static WEssentials plugin;
    public onSleep(WEssentials instance) {
        plugin = instance;
    }

    @EventHandler
    public void onSleep(PlayerBedEnterEvent e) {
        Player player = e.getPlayer();
        String sleep = plugin.getConfig().getString("onsleepmessage");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', sleep));
    }
}
