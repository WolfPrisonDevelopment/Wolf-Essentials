package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class donorrankreset implements CommandExecutor {

    public static WEssentials plugin;
    public donorrankreset(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("donorrankreset")) {
            if (sender.hasPermission("wolfessentials.donorrankreset")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cPlease use the correct Syntax (/donorrankreset {player})"));
                } else if (args.length > 1) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cPlease use the correct Syntax (/donorrankreset {player})"));
                } else if (args.length == 1) {
                    String playerName = args[0];
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix \"\"");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.iron");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove plotme.limit.8");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove playervaults.amount.7");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove playervaults.commands.use");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.warps.iron");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.feed");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.back");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.nick");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.afk");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.hat");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.nick.format");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove autosell.sellall.iron");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove autosell.sellall.gold");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove autosell.sellall.redstone");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove autosell.sellall.obsidian");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove autosell.sellall.emerald");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove autosell.sellall.diamond");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove autosell.sellall.VIP");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.VIP");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.vipbow");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.warps.vip");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.diamond");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.warps.diamond");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.emerald");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.warps.emerald");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.obsidian");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.warps.obsidian");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.redstone");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove esssentials.warps.redstone");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.heal");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.gold");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.warps.gold");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.kits.decor");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove autosell.toggle");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.nick");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.nick.color");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.fly");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " remove essentials.clearinventory");
                    return true;
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cNo Permission!"));
            }
        }
        return false;
    }
}
