package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class acbanconfirm implements CommandExecutor {

    public static WEssentials plugin;

    public acbanconfirm (WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("acbanconfirm")) {
            if (sender.hasPermission("wolfessentials.acbanconfirm")) {
                String player = args[0];
                String reason = args[1];
                if (args.length == 2) {
                    if (args[1].equalsIgnoreCase("false")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "unban " + player);
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lAnti&9&lCheat &8> &7" + player + " 's temp ban has been removed."));
                        return true;
                    } else {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban " + player + "After review you are permanently banned for " + reason + " hacking. Video appeal ONLY.");
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lAntiCheat &8> &7" + player + "has been permanently banned."));
                        return true;
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "Incorrect Syntax. /acbanconfirm (player) (reason 1 word OR false)");
                    sender.sendMessage(ChatColor.RED + "Example reason: Movement(Speed)");
                    return true;
                }
            } else {
                String noperms = WEssentials.plugin.nopermission();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', noperms));
                return true;
            }
        }
        return false;
    }
}
