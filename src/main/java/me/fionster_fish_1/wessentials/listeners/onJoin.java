package me.fionster_fish_1.wessentials.listeners;

import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.event.player.PlayerJoinEvent;

import java.lang.reflect.Field;

public class onJoin implements Listener {

    int min;
    int max;
    static String upper;
    public static WEssentials plugin;
    public onJoin(WEssentials instance) {
        plugin = instance;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String mainmessage = plugin.getConfig().getString("playermainmessage");
        String submessage = plugin.getConfig().getString("playersubmessage");
        String staffmessage = plugin.getConfig().getString("staffmessage");
        String header = plugin.getConfig().getString("headermessage");
        String footer = plugin.getConfig().getString("footermessage");
        Player p = e.getPlayer();
        CraftPlayer cp = (CraftPlayer) p;
        EntityPlayer ep = cp.getHandle();

        if (p.hasPermission("wolfessentials.player")) {
            p.sendTitle(ChatColor.translateAlternateColorCodes('&', mainmessage), ChatColor.translateAlternateColorCodes('&', submessage));
        }

        if (p.hasPermission("wolfessentials.staff")) {
            p.sendTitle(ChatColor.translateAlternateColorCodes('&', mainmessage), ChatColor.translateAlternateColorCodes('&', staffmessage));
        }

        PacketPlayOutPlayerListHeaderFooter list = new PacketPlayOutPlayerListHeaderFooter(IChatBaseComponent.ChatSerializer.a(ChatColor.translateAlternateColorCodes('&', header)));

        try {
            Field fieldB = list.getClass().getDeclaredField("b");
            fieldB.setAccessible(true);
            fieldB.set(list, IChatBaseComponent.ChatSerializer.a(ChatColor.translateAlternateColorCodes('&', footer)));
        } catch (NoSuchFieldException | IllegalAccessException x) {
            x.printStackTrace();
        }
        ep.playerConnection.sendPacket(list);
    }
}
