package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class setrank implements CommandExecutor {

    public static WEssentials plugin;
    public setrank(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("setrank")) {
            if (sender.hasPermission("wolfessentials.setrank")) {
                if (args.length < 2) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR: &cPlease Use The Valid Syntax (/setrank {player} {rank})"));
                } else {
                    if (args[1].equalsIgnoreCase("Iron")) {
                        String playerName = args[0];
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&f&lIron&8&l]");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add plotme.limit.2");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.amount.1");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.commands.use");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.feed");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.back");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.afk");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Iron");

                    } else if (args[1].equalsIgnoreCase("Gold")) {
                        String playerName = args[0];
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&6&lGold&8&l]");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add plotme.limit.3");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.amount.2");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.commands.use");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.feed");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.back");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.afk");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.fly");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.clearinventory");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Gold");

                    } else if (args[1].equalsIgnoreCase("redstone")) {
                        String playerName = args[0];
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&4&lRedstone&8&l]");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add plotme.limit.4");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.amount.3");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.commands.use");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.feed");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.back");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.afk");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.hat");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add esssentials.warps.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.fly");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.clearinventory");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Redstone");

                    } else if (args[1].equalsIgnoreCase("obsidian")) {
                        String playerName = args[0];
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&5&lObsidian&8&l]");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add plotme.limit.5");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.amount.4");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.commands.use");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.feed");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.back");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.afk");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.hat");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add esssentials.warps.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.toggle");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.fly");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.clearinventory");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Obsidian");

                    } else if (args[1].equalsIgnoreCase("emerald")) {
                        String playerName = args[0];
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&a&lEmerald&8&l]");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add plotme.limit.6");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.amount.5");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.commands.use");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.feed");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.back");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.afk");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.hat");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add esssentials.warps.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.heal");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.toggle");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.fly");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.clearinventory");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Emerald");

                    } else if (args[1].equalsIgnoreCase("diamond")) {
                        String playerName = args[0];
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&b&lDiamond&8&l]");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add plotme.limit.7");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.amount.6");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.commands.use");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.feed");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.back");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.afk");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.hat");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.diamond");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.diamond");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.diamond");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add esssentials.warps.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.heal");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.decor");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.toggle");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.fly");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.clearinventory");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Diamond");

                    } else if (args[1].equalsIgnoreCase("VIP")) {
                        String playerName = args[0];
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&e&l+&d&lV&6&lI&b&lP&e&l+&8&l]");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add plotme.limit.8");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.amount.7");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add playervaults.commands.use");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.feed");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.back");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.afk");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.hat");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.diamond");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.VIP");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.VIP");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.vipbow");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.vip");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.diamond");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.diamond");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.emerald");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.obsidian");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add esssentials.warps.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.heal");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.decor");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.toggle");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.fly");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.clearinventory");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " VIP");
                    }
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cNo Permission!"));
            }
            return true;
        }
        return false;
    }
}
