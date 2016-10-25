// Code by Corey
package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class updates implements CommandExecutor {

    public static WEssentials plugin;

    public updates(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("updates")) {
            if (sender instanceof Player) {
                if (sender.hasPermission("wolfessentials.updates")) {

                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&l====================================="));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lhttps://wolfprison.net/news.php/"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&l====================================="));
                }
            }
        }
        return false;
    }
}
