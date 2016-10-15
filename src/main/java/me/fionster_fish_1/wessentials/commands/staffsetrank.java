package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class staffsetrank implements CommandExecutor {

    public WEssentials plugin;

    public staffsetrank(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("staffsetrank")) {
            if (sender.hasPermission("wolfessentials.staffsetrank")) {
                if (args.length == 3) {
                    String IGN = args[0];
                    String StaffRank = args[1];
                    String Rankup = args[2];
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + IGN + " group set " + StaffRank);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + IGN + " group add " + Rankup);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lSet&9&lRank &8> &7Successfully set " + IGN + " to " + StaffRank));
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', syntaxerror()));
                }
            } else {
                String noperms = WEssentials.plugin.nopermission();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', noperms));
            }
        }
        return false;
    }

    private String syntaxerror() {
        return "&4&lERROR&8: &cPlease use the correct syntax (/staffsetrank {user} {Desired Staff Rank} {Rankup}";
    }
}
