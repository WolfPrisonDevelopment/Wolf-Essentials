package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class forcecommandspyoff implements CommandExecutor {

    public static WEssentials plugin;
    public forcecommandspyoff(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("forcecommandspyoff")) {
            if (sender.hasPermission("wolfessentials.forcecommandspyoff")) {
                if (args.length < 1) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cPlease use the correct syntax (/forcecommandpsyoff {player})"));
                } else if (args.length > 1) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cPlease use the correct syntax (/forcecommandpsyoff {player})"));
                } else if (args.length == 1) {
                    String selectedPlayer = args[0];
                    Player selected = Bukkit.getServer().getPlayer(selectedPlayer);
                    if (selected == null) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cThat player is not online!"));
                    } else {
                        boolean opped = selected.isOp();
                        selected.setOp(true);
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "sudo " + selected + " commandspy off");
                        selected.setOp(opped);
                        return true;
                    }
                }
            } else {
                String noperms = WEssentials.plugin.nopermission();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', noperms));
            }
        }
        return false;
    }
}
