package me.fionster_fish_1.wessentials.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerRespawn implements Listener {

    int min;
    int max;
    static String upper;
    public static WEssentials plugin;
    public PlayerRespawn(WEssentials instance) {
        plugin = instance;
    }

    @EventHandler
    public void Respawn(PlayerRespawnEvent e) {
        Player player = e.getPlayer();
        String rmessage = plugin.getConfig().getString("respawnmessage");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', rmessage));
    }
}
