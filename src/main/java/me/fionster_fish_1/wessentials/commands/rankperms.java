package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class rankperms implements CommandExecutor {

    public static WEssentials plugin;
    public rankperms(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("rankperms")) {
            if (sender.hasPermission("wolfessentials.rankperms")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Ranks You Belong To:"));
                    if (sender.hasPermission("wolfessentials.rank.iron")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Iron"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.gold")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gold"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.redstone")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Redstone"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.obsidian")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Obsidian"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.emerald")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Emerald"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.diamond")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Diamond"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.vip")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7VIP"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.halloween")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Halloween"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.trainee")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cTrainee"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.helper")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cHelper"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.mod")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cModerator"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.admin")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAdmin"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.builder")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBuilder"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.co")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cCo-Owner"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.jrdev")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cJr. Dev"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.dev")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cDeveloper"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.manager")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cManager"));
                    }
                    if (sender.hasPermission("wolfessentials.rank.owner")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cOwner"));
                    }
                } else if (args[0].equalsIgnoreCase("iron")) {
                    if (sender.hasPermission("wolfessentials.rank.iron")) {
                        String[] iron = {"/kit iron", "2 Plots", "1 Playervault (/pv)", "/sellall iron", "/feed", "/back", "/afk"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Iron:"));
                        for (String ironperms : iron) {
                            sender.sendMessage(ChatColor.GRAY + ironperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("gold")) {
                    if (sender.hasPermission("wolfessentials.rank.gold")) {
                        String[] gold = {"/kit iron", "3 Plots", "2 Playervaults (/pv)", "/sellall gold", "/feed", "/back", "/afk", "/kit gold", "/fly", "/ci"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Gold:"));
                        for (String goldperms : gold) {
                            sender.sendMessage(ChatColor.GRAY + goldperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("redstone")) {
                    if (sender.hasPermission("wolfessentials.rank.redstone")) {
                        String[] redstone = {"/kit iron", "4 Plots", "3 Playervaults (/pv)", "/sellall redstone", "/feed", "/back", "/afk", "/kit gold", "/fly", "/ci", "/kit redstone", "/hat"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Redstone:"));
                        for (String redstoneperms : redstone) {
                            sender.sendMessage(ChatColor.GRAY + redstoneperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("obsidian")) {
                    if (sender.hasPermission("wolfessentials.rank.obsidian")) {
                        String[] obsidian = {"/kit iron", "5 Plots", "4 Playervaults (/pv)", "/sellall obsidian", "/feed", "/back", "/afk", "/kit gold", "/fly", "/ci", "/kit redstone", "/hat", "/kit obsidian"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Obsidian:"));
                        for (String obsidianperms : obsidian) {
                            sender.sendMessage(ChatColor.GRAY + obsidianperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("emerald")) {
                    if (sender.hasPermission("wolfessentials.rank.emerald")) {
                        String[] emerald = {"/kit iron", "6 Plots", "5 Playervaults (/pv)", "/sellall emerald", "/feed and /heal", "/back", "/afk", "/kit gold", "/fly", "/ci", "/kit redstone", "/hat", "/kit obsidian", "/kit emerald"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Emerald:"));
                        for (String emeraldperms : emerald) {
                            sender.sendMessage(ChatColor.GRAY + emeraldperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("diamond")) {
                    if (sender.hasPermission("wolfessentials.rank.diamond")) {
                        String[] diamond = {"/kit iron", "7 Plots", "6 Playervaults (/pv)", "/sellall diamond", "/feed", "/back", "/afk", "/kit gold", "/fly and /heal", "/ci", "/kit redstone", "/hat", "/kit obsidian", "/kit emerald", "/kit diamond", "/kit decor"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Diamond:"));
                        for (String diamondperms : diamond) {
                            sender.sendMessage(ChatColor.GRAY + diamondperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("vip")) {
                    if (sender.hasPermission("wolfessentials.rank.vip")) {
                        String[] vip = {"/kit iron", "7 Plots", "6 Playervaults (/pv)", "/sellall VIP", "/feed and /heal", "/back", "/afk", "/kit gold", "/fly", "/ci", "/kit redstone", "/hat", "/kit obsidian", "/kit emerald", "/kit diamond", "/kit decor", "/kit vip", "/kit vipbow"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For VIP:"));
                        for (String vipperms : vip) {
                            sender.sendMessage(ChatColor.GRAY + vipperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("spooky")) {
                    if (sender.hasPermission("wolfessentials.rank.halloween")) {
                        String[] halloween = {"/fly", "/autosell", "/afk", "/feed and /heal", "Halloween tag (/tags)"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions for &cHalloween&9:"));
                        for (String halloweenperms : halloween) {
                            sender.sendMessage(ChatColor.GRAY + halloweenperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("trainee")) {
                    if (sender.hasPermission("wolfessentials.rank.trainee")) {
                        String[] trainee = {"/tp", "/feed", "/fly", "/warn", "/kick", "/v"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cTrainee&9:"));
                        for (String traineeperms : trainee) {
                            sender.sendMessage(ChatColor.GRAY + traineeperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("helper")) {
                    if (sender.hasPermission("wolfessentials.rank.helper")) {
                        String[] helper = {"/tp", "/tphere", "/ci", "/fly", "/feed", "/dupeip", "/warn and /warnings", "/kick", "/tempmute", "/mute", "/god"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cHelper&9:"));
                        for (String helperperms : helper) {
                            sender.sendMessage(ChatColor.GRAY + helperperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("moderator")) {
                    if (sender.hasPermission("wolfessentials.rank.mod")) {
                        String[] moderator = {"/tp and /tphere", "/ci", "/fly", "/feed", "/dupeip", "/warn and /warnings", "/kick", "/tempmute and /mute", "/god", "/heal", "/tpo and /tpohere", "/ban and /tempban"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cModerator&9:"));
                        for (String moderatorperms : moderator) {
                            sender.sendMessage(ChatColor.GRAY + moderatorperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("admin")) {
                    if (sender.hasPermission("wolfessentials.rank.admin")) {
                        String[] admin = {"/fly", "/heal", "/feed", "/ban and /tempban", "/mute and /tempmute", "/kick", "/ipban", "/dupeip", "/warn and /warnings", "/tp /tpo /tpohere /tphere", "/seen", "/broadcast (/bc)", "/afk", "/god"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cAdmin&9:"));
                        for (String adminperms : admin) {
                            sender.sendMessage(ChatColor.GRAY + adminperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("jrdev")) {
                    if (sender.hasPermission("wolfessentials.rank.jrdev")) {
                        String[] jrdev = {"/fly", "/back", "/heal and /feed", "/tp and /tpo", "/nick", "/broadcast", "/kick and /warn"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cJrDev&9:"));
                        for (String jrdevperms : jrdev) {
                            sender.sendMessage(ChatColor.GRAY + jrdevperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("developer")) {
                    if (sender.hasPermission("wolfessentials.rank.dev")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cDeveloper&9:"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lOP!"));
                    }
                } else if (args[0].equalsIgnoreCase("co-owner")) {
                    if (sender.hasPermission("wolfessentials.rank.co")) {
                        String[] co = {"/fly", "/heal and /feed", "/ban, /ipban and /tempban", "/mute and /tempmute", "/kick", "/dupeip", "/warn and /warnings", "/tp /tpo /tpohere /tphere", "/seen", "/broadcast (/bc)", "/afk", "/god"};
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cCo-Owner&9:"));
                        for (String coperms : co) {
                            sender.sendMessage(ChatColor.GRAY + coperms);
                        }
                    }
                } else if (args[0].equalsIgnoreCase("manager")) {
                    if (sender.hasPermission("wolfessentials.rank.manager")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cManager&9:"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lOP!"));
                    }
                } else if (args[0].equalsIgnoreCase("owner")) {
                    if (sender.hasPermission("wolfessentials.rank.owner")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cOwner&9:"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lOP!"));
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
