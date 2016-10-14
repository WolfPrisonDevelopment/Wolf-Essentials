package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.conversations.StringPrompt;
import org.bukkit.entity.Player;

public class promote implements CommandExecutor {

    public WEssentials plugin;

    public promote(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("promote")) {
            if (sender.hasPermission("wolfessentials.promote")) {
                if (args.length == 3) {
                    String IGN = args[0];
                    String StaffRank = args[1];
                    String Rankup = args[2];
                    Player selectedplayer = Bukkit.getServer().getPlayer(IGN);
                    if (selectedplayer == null) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', playernotfound()));
                    } else {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + selectedplayer + "group set " + StaffRank);
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + selectedplayer + "group add " + Rankup);
                    }
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', syntaxerror()));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cTo view valid staffranks use /promote ranks"));
                }
            }
        }
        return false;
    }

    private String syntaxerror() {
        return "&4&lERROR&8: &cPlease use the correct syntax (/promote {user} {Desired Staff Rank} {Rankup}";
    }

    private String playernotfound() {
        return "&4&lERROR&8: &cPlayer not found!";
    }
}
