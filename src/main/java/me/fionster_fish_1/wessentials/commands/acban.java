package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class acban implements CommandExecutor {

    public static WEssentials plugin;

    public acban (WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("acban")) {
            if (sender.hasPermission("wolfessentials.acban")) {
                if (args.length == 1) {
                    String player = args[0];
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tempban " + player + " 7d Your ban is being reviewed. This ban was issued automatically by the anti-cheat.");
                    return true;
                } else {
                    sender.sendMessage(ChatColor.RED + "Incorrect syntax. /acban (player)");
                    return true;
                }
            } else {
                String noperms = WEssentials.plugin.nopermission();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', noperms));
            }
        }
        return false;
    }

}
