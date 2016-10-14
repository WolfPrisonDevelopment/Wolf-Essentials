package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.conversations.StringPrompt;

public class promote implements CommandExecutor {

    public WEssentials plugin;

    public promote(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("promote")) {
            if (sender.hasPermission("wolfessentials.promote")) {
                if (args.length <= 1) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', syntaxerror()));
                } else if (args[2].equalsIgnoreCase("")) {

                }
            }
        }
        return false;
    }

    private String syntaxerror() {
        return "&4&lERROR&8: &cPlease use the correct syntax (/promote {user} {Desired Staff Rank} {Rankup}";
    }
}
