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
                        String[] iron = {"essentials.kits.iron", "plotme.limit.2", "playervaults.amount.1", "playervaults.commands.use", "essentials.warps.iron", "essentials.feed", "essentials.back", "essentials.afk", "autosell.sellall.iron", "autosell.sellall"};
                        for (String ironiterated : iron) {
                            String basecommand = "pex user " + playerName + " add ";
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), basecommand + ironiterated);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&f&lIron&8&l]");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Iron");
                        }

                    } else if (args[1].equalsIgnoreCase("Gold")) {
                        String playerName = args[0];
                        String[] gold = {"essentials.kits.iron", "plotme.limit.3", "playervaults.amount.2", "playervaults.commands.use", "essentials.warps.iron", "essentials.feed", "essentials.back", "essentials.afk", "autosell.sellall.iron", "autosell.sellall.gold", "autosell.sellall", "essentials.kits.gold", "essentials.warps.gold", "essentials.fly", "essentials.clearinventory"};
                        for (String golditerated : gold) {
                            String basecommand = "pex user " + playerName + " add ";
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), basecommand + golditerated);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&6&lGold&8&l]");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Gold");
                        }

                    } else if (args[1].equalsIgnoreCase("redstone")) {
                        String playerName = args[0];
                        String[] redstone = {"essentials.kits.iron", "plotme.limit.4", "playervaults.amount.3", "playervaults.commands.use", "essentials.warps.iron", "essentials.feed", "essentials.back", "essentials.afk", "essentials.hat", "autosell.sellall.iron", "autosell.sellall.gold", "autosell.sellall.redstone", "autosell.sellall", "essentials.kits.redstone", "esssentials.warps.redstone", "essentials.kits.gold", "essentials.warps.gold", "essentials.fly", "essentials.clearinventory"};
                        for (String redstoneiterated : redstone) {
                            String basecommand = "pex user " + playerName + " add ";
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), basecommand + redstoneiterated);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&4&lRedstone&8&l]");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Redstone");
                        }
                    } else if (args[1].equalsIgnoreCase("obsidian")) {
                        String playerName = args[0];
                        String[] obsidian = {"essentials.kits.iron", "plotme.limit.5", "playervaults.amount.4", "playervaults.commands.use", "essentials.warps.iron", "essentials.feed", "essentials.back", "essentials.back", "essentials.afk", "essentials.hat", "autosell.sellall.iron", "autosell.sellall.gold", "autosell.sellall.redstone", "autosell.sellall.obsidian", "autosell.sellall", "essentials.kits.obsidian", "essentials.warps.obsidian", "essentials.kits.redstone", "esssentials.warps.redstone", "essentials.kits.gold", "essentials.warps.gold", "autosell.toggle", "essentials.fly", "essentials.clearinventory"};
                        for (String obsidianiterated : obsidian) {
                            String basecommand = "pex user " + playerName + " add ";
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), basecommand + obsidianiterated);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&5&lObsidian&8&l]");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Obsidian");
                        }

                    } else if (args[1].equalsIgnoreCase("emerald")) {
                        String playerName = args[0];
                        String[] emerald = {"essentials.kits.iron", "plotme.limit.6", "playervaults.amount.5", "playervaults.commands.use", "essentials.warps.iron", "essentials.feed", "essentials.back", "essentials.afk", "essentials.hat", "autosell.sellall.iron", "autosell.sellall.gold", "autosell.sellall.redstone", "autosell.sellall.obsidian", "autosell.sellall.emerald", "autosell.sellall", "essentials.kits.emerald", "essentials.warps.emerald", "essentials.kits.obsidian", "essentials.warps.obsidian", "essentials.kits.redstone", "esssentials.warps.redstone", "essentials.heal", "essentials.kits.gold", "essentials.warps.gold", "autosell.toggle", "essentials.fly", "essentials.clearinventory"};
                        for (String emeralditerated : emerald) {
                            String basecommand = "pex user " + playerName + " add ";
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), basecommand + emeralditerated);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&a&lEmerald&8&l]");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Emerald");
                        }

                    } else if (args[1].equalsIgnoreCase("diamond")) {
                        String playerName = args[0];
                        String[] diamond = {"essentials.kits.iron", "plotme.limit.7", "playervaults.amount.6", "playervaults.commands.use", "essentials.warps.iron", "essentials.feed", "essentials.back", "essentials.afk", "essentials.hat", "autosell.sellall.iron", "autosell.sellall.gold", "autosell.sellall.redstone", "autosell.sellall.obsidian", "autosell.sellall.emerald", "autosell.sellall.diamond", "autosell.sellall", "essentials.kits.diamond", "essentials.warps.diamond", "essentials.kits.emerald", "essentials.warps.emerald", "essentials.kits.obsidian", "essentials.warps.obsidian", "essentials.kits.redstone", "esssentials.warps.redstone", "essentials.heal", "essentials.kits.gold", "essentials.warps.gold", "essentials.kits.decor", "autosell.toggle", "essentials.fly", "essentials.clearinventory"};
                        for (String diamonditerated : diamond) {
                            String basecommand = "pex user " + playerName + " add ";
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), basecommand + diamonditerated);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&b&lDiamond&8&l]");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " Diamond");
                        }

                    } else if (args[1].equalsIgnoreCase("VIP")) {
                        String playerName = args[0];
                        String[] VIP = {"essentials.kits.iron", "plotme.limit.8", "playervaults.amount.7", "playervaults.commands.use", "essentials.warps.iron", "essentials.feed", "essentials.back", "essentials.nick", "essentials.afk", "essentials.hat", "autosell.sellall.iron", "autosell.sellall.gold", "autosell.sellall.redstone", "autosell.sellall.obsidian", "autosell.sellall.emerald", "autosell.sellall.diamond", "autosell.sellall.VIP", "autosell.sellall", "essentials.kits.VIP", "essentials.kits.vipbow", "essentials.warps.vip", "essentials.kits.diamond", "essentials.warps.diamond", "essentials.kits.emerald", "essentials.warps.emerald", "essentials.kits.obsidian", "essentials.warps.obsidian", "essentials.kits.redstone", "esssentials.warps.redstone", "essentials.heal", "essentials.kits.gold", "essentials.warps.gold", "essentials.kits.decor", "autosell.toggle", "essentials.clearinventory"};
                        for (String VIPiterated : VIP) {
                            String basecommand = "pex user " + playerName + " add ";
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), basecommand + VIPiterated);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " suffix &8&l[&e&l+&d&lV&6&lI&b&lP&e&l+&8&l]");
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " VIP");
                        }
                    } else if (args[1].equalsIgnoreCase("Spooky")) {
                        String playerName = args[0];
                        String[] spooky = {"essentials.fly", "autosell.toggle", "essentials.afk", "essentials.feed", "essentials.heal", "deluxetags.tag.halloween", "wolfessentials.rank.halloween"};
                        for (String spookyiterated : spooky) {
                            String basecommand = "pex user " + playerName + " add ";
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), basecommand + spookyiterated);
                        }
                    }
                }
            } else {
                String noperms = WEssentials.plugin.nopermission();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', noperms));
            }
            return true;
        }
        return false;
    }
}
