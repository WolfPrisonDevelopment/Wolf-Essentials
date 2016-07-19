package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class report implements CommandExecutor {

    public static WEssentials plugin;
    public report(WEssentials instance) {
        instance = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("report")) {
            if (!(sender instanceof Player)) {
                System.out.println("You are not a player.");
                return true;
            }
            Player player = (Player) sender;
            if (args.length < 2) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lUsage:&4&l /report <player> <reason>"));
                return true;
            }
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target == null) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lThat player is not online."));
                return true;
            }

            String reason = "";
            for (int i = 1; i < args.length; i++) {
                String arg = args[i] + " ";
                reason = reason + arg;
            }

            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lCommand successfully executed!"));
            for (Player listPlayer : Bukkit.getOnlinePlayers()) {
                if (listPlayer.hasPermission("wolfessentials.staff")) {
                    listPlayer.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWolf&9&lReport &8> " + target.getName() + "&7 reported by &f" + player.getName() + "&7 - \"&e" + reason + "&7\""));
                }
            }
            return true;
        }
        return false;
    }
}
