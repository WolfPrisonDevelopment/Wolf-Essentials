package me.fionster_fish_1.wessentials.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.lang.reflect.Array;

public class onChat implements Listener {

    int min;
    int max;
    static String upper;
    public static WEssentials plugin;

    String[] badwords = {"Shit", "Fuck", "Cunt", "Nigga", "Negro", "pussy", "bitch", "cock", "dick", "dildo", "penis"};

    public onChat(WEssentials instance) {
        plugin = instance;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        String message = e.getMessage();

        if (player.hasPermission("wolfessentials.chatfilter.check")) {
            for (String badword : badwords) {
                if (message.toLowerCase().contains(badword.toLowerCase())) {
                    e.setCancelled(true);
                    player.sendMessage(ChatColor.RED + badlanguage());
                }
            }
            if (message.equalsIgnoreCase("lag")) {
                e.setMessage("I LOVE WOLFPRISON!!!");
            }
        }

        if (player.hasPermission("wolfessentials.staffchat")) {
            if (!(message.startsWith("@")))
                return;
            if (message.equalsIgnoreCase("@")) {
                player.sendMessage(ChatColor.RED + "Invalid syntax, you have to send a message after the '@'");
                return;
            } else {
                e.setCancelled(true);
                String send = message.substring(1);
                for (Player target : Bukkit.getOnlinePlayers()) {
                    if (target.hasPermission("wolfessentials.staffchat")) {
                        target.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                "&4&lStaff&9&lChat &8> " + getRank(player) + "&5&o" + player.getName() + "&8: &7" + send));
                    }
                }
            }
        }
    }

    private String getRank(Player p) {
        String wolfEssentials = "wolfessentials.rank.";
        if (p.hasPermission(wolfEssentials + "trainee"))
            return "&8&l[&3&lTrainee&8&l]&r ";
        if (p.hasPermission(wolfEssentials + "helper"))
            return "&8&l[&5&lHelper&8&l] ";
        if (p.hasPermission(wolfEssentials + "mod"))
            return "&8&l[&1&lModerator&8&l] ";
        if (p.hasPermission(wolfEssentials + "admin"))
            return "&8&l[&6&lAdmin&8&l] ";
        if (p.hasPermission(wolfEssentials + "builder"))
            return "&8&l[&3&lBuilder&8&l] ";
        if (p.hasPermission(wolfEssentials + "co"))
            return "&8&l[&4&lCo-Owner&8&l] ";
        if (p.hasPermission(wolfEssentials + "jrdev"))
            return "&8&l[&9&lJr.Dev&8&l] ";
        if (p.hasPermission(wolfEssentials + "dev"))
            return "&8&l[&4&lDev&8&l] ";
        if (p.hasPermission(wolfEssentials + "manager"))
            return "&8&l[&c&lManager&8&l] ";
        if (p.hasPermission(wolfEssentials + "owner"))
            return "&8&l[&c&lOwner&8&l] ";
        return "";
    }

    private String badlanguage() {
        return "Please Refrain From Using Bad Language";
    }
}