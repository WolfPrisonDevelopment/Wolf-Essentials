package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class purchaseanounce implements CommandExecutor {

    public static WEssentials plugin;
    public purchaseanounce(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("purchaseanouncement")) {
            if (sender.hasPermission("wolfessentials.purchaseanounce")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR: &cPlease Use The Correct Syntax (/purchaseanouncement {player} {rank}"));
                } else if (args.length == 1) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR: &cPlease Use The Correct Syntax (/purchaseanouncement {player} {rank}"));
                } else if (args.length == 2) {
                    String donatorName = args[0];
                    String donatedItem = args[1];

                    Player selected = Bukkit.getServer().getPlayer(donatorName);

                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&lDonation&9&lAnouncer &8> &9" + donatorName + " &7bought &9" + donatedItem + "&7!!!"));

                    selected.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lDonation&9&lMessager &8> &7Hey there, " + donatorName + "&7! Thank you for purchasing" + donatedItem + ". You have contributed towards the development of the server and general funding! Thank you for your generosity, -The WolfPrison Team :D"));
                    return true;
                }
            }
        }
        return false;
    }
}
