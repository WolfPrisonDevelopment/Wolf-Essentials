package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class wolfessentials implements CommandExecutor {

    public static WEssentials plugin;
    public wolfessentials(WEssentials instance) {
        instance = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("wolfessentials")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Please Enter A Valid Sub Command"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Valid Sub Commands:"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Info"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Help"));
                if (sender.hasPermission("wolfesssentials.reload")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Reload"));
                }
            } else if (args[0].equalsIgnoreCase("info")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9WolfEssentials Info Page:"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7WolfEssentials Developed By fionster_fish_1"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7WolfEssentials Was Made Entirely By fionster_fish_1 and is maintained by whom"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7WolfEssentials Was Made Custom For WolfPrison And Cannot Be Found Anywhere Else!"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9WolfEssentials &7-fionster_fish_1"));
            } else if (args[0].equalsIgnoreCase("help")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9WolfEssentials Help Page:"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/wolfessentials &9-- &7WolfEssentials Command"));
                if (sender.hasPermission("wolfessentials.gm")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/wgm &9-- &7WolfEssentials Gamemode Command"));
                }
                if (sender.hasPermission("wolfessentials.ytrec")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/ytrec &9-- &7Youtube Recording Command"));
                }
                if (sender.hasPermission("wolfessentials.twitchstream")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/twitchstream &9-- &7Twitch Streaming Command"));
                }
                if (sender.hasPermission("wolfessentials.rankperms")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/rankperms &9-- &7Rank Perms Command"));
                }
                if (sender.hasPermission("wolfessentials.purchasehistory")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/purchasehistory &9-- &7Purchase History Command"));
                }
                if (sender.hasPermission("wolfessentials.setrank")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/setrank &9-- &7Setrank Command"));
                }
                if (sender.hasPermission("wolfessentials.purchaseanounce")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/purchaseanouncent &9-- &7Purchase Anouncment Command"));
                }
                if (sender.hasPermission("wolfessentials.forcecommandspyoff")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/forcecommandspyoff &9-- &Force Commandspy Off Command"));
                }
            } else if (args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission("wolfessentials.reload")) {
                    plugin.reloadConfig();
                    String rmessage = plugin.getConfig().getString("reloadmessage");
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', rmessage));
                }
            }
        }
        return false;
    }
}
