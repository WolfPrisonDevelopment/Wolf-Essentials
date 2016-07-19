package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ytrec implements CommandExecutor {

    public static WEssentials plugin;
    public ytrec(WEssentials instance) {
        instance = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("ytrec")) {
            if (sender.hasPermission("wolfessentials.ytrec")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "WARNING: Using This Command Will Anounce That You Are Recording To The Whole Server");
                    sender.sendMessage(ChatColor.RED + "type </ytrec confirm> to execute this action");
                } else if (args[0].equalsIgnoreCase("confirm")) {
                    String name = sender.getName();
                    Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&l" + name + " &9&lIs Now Recording For Youtube"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lType &4&l/ytrec end &9&lTo Anounce You Have Finished"));
                } else if (args[0].equalsIgnoreCase("end")) {
                    String name = sender.getName();
                    Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&l" + name + " &9&lIs No Long Recording For Youtube :("));
                    sender.sendMessage(ChatColor.RED + "Successfully Ended");
                    return true;
                }
            }
        }
        return false;
    }
}
