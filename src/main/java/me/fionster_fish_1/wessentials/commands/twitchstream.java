package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class twitchstream implements CommandExecutor {

    public static WEssentials plugin;
    public twitchstream(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("twitchstream")) {
            if (sender.hasPermission("wolfessentials.twitchstream")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "WARNING: Using This Command Will Anounce That You Have Started To Stream.");
                    sender.sendMessage(ChatColor.RED + "Type </twitchstream confirm> to execute this action!");
                } else if (args[0].equalsIgnoreCase("confirm")) {
                    String name = sender.getName();
                    Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&l" + name + " &9&lIs Now Streaming To Twitch"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lType &4&l/twitchstream end &9&lTo Anounce You Have Stopped Streaming"));
                } else if (args[0].equalsIgnoreCase("end")) {
                    String name = sender.getName();
                    Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&l" + name + " &9&lIs No Longer Streaming To Twitch"));
                    sender.sendMessage(ChatColor.RED + "Successfully Ended");
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
