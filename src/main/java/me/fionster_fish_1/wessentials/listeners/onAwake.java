package me.fionster_fish_1.wessentials.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.Plugin;

public class onAwake implements Listener {

    int min;
    int max;
    static String upper;
    public static WEssentials plugin;
    public onAwake(WEssentials instance) {
        plugin = instance;
    }

    @EventHandler
    public void onAwake(PlayerBedLeaveEvent e) {
        Player player = e.getPlayer();
        String awake = plugin.getConfig().getString("onawakemessage");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', awake));
    }
}
