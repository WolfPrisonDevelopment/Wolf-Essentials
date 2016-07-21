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
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Iron:"));
                        sender.sendMessage(ChatColor.GRAY + "/kit iron");
                        sender.sendMessage(ChatColor.GRAY + "2 Plots");
                        sender.sendMessage(ChatColor.GRAY + "1 PlayerVault (/pv)");
                        sender.sendMessage(ChatColor.GRAY + "/sellall iron");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/back");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                    }
                } else if (args[0].equalsIgnoreCase("gold")) {
                    if (sender.hasPermission("wolfessentials.rank.gold")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Gold:"));
                        sender.sendMessage(ChatColor.GRAY + "/kit iron w/ color");
                        sender.sendMessage(ChatColor.GRAY + "3 Plots");
                        sender.sendMessage(ChatColor.GRAY + "2 PlayerVault (/pv)");
                        sender.sendMessage(ChatColor.GRAY + "/sellall gold");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/back");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                        sender.sendMessage(ChatColor.GRAY + "/kit gold");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/ci");
                    }
                } else if (args[0].equalsIgnoreCase("redstone")) {
                    if (sender.hasPermission("wolfessentials.rank.redstone")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Redstone:"));
                        sender.sendMessage(ChatColor.GRAY + "/kit iron w/ color and format");
                        sender.sendMessage(ChatColor.GRAY + "4 Plots");
                        sender.sendMessage(ChatColor.GRAY + "3 PlayerVault (/pv)");
                        sender.sendMessage(ChatColor.GRAY + "/sellall redstone");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/back");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                        sender.sendMessage(ChatColor.GRAY + "/kit gold");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/ci");
                        sender.sendMessage(ChatColor.GRAY + "/kit redstone");
                        sender.sendMessage(ChatColor.GRAY + "/hat");
                    }
                } else if (args[0].equalsIgnoreCase("obsidian")) {
                    if (sender.hasPermission("wolfessentials.rank.obsidian")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Obsidian:"));
                        sender.sendMessage(ChatColor.GRAY + "/kit iron w/ color and format");
                        sender.sendMessage(ChatColor.GRAY + "5 Plots");
                        sender.sendMessage(ChatColor.GRAY + "4 PlayerVault (/pv)");
                        sender.sendMessage(ChatColor.GRAY + "/sellall obsidian");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/back");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                        sender.sendMessage(ChatColor.GRAY + "/kit gold");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/ci");
                        sender.sendMessage(ChatColor.GRAY + "/kit redstone");
                        sender.sendMessage(ChatColor.GRAY + "/hat");
                        sender.sendMessage(ChatColor.GRAY + "/kit obsidian");
                    }
                } else if (args[0].equalsIgnoreCase("emerald")) {
                    if (sender.hasPermission("wolfessentials.rank.emerald")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Emerald:"));
                        sender.sendMessage(ChatColor.GRAY + "/kit iron w/ color and format");
                        sender.sendMessage(ChatColor.GRAY + "6 Plots");
                        sender.sendMessage(ChatColor.GRAY + "5 PlayerVault (/pv)");
                        sender.sendMessage(ChatColor.GRAY + "/sellall emerald");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/back");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                        sender.sendMessage(ChatColor.GRAY + "/kit gold");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/ci");
                        sender.sendMessage(ChatColor.GRAY + "/kit redstone");
                        sender.sendMessage(ChatColor.GRAY + "/hat");
                        sender.sendMessage(ChatColor.GRAY + "/kit obsidian");
                        sender.sendMessage(ChatColor.GRAY + "/kit emerald");
                        sender.sendMessage(ChatColor.GRAY + "/heal");
                    }
                } else if (args[0].equalsIgnoreCase("diamond")) {
                    if (sender.hasPermission("wolfessentials.rank.diamond")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For Diamond:"));
                        sender.sendMessage(ChatColor.GRAY + "/kit iron w/ color and format");
                        sender.sendMessage(ChatColor.GRAY + "7 Plots");
                        sender.sendMessage(ChatColor.GRAY + "6 PlayerVault (/pv)");
                        sender.sendMessage(ChatColor.GRAY + "/sellall diamond");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/back");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                        sender.sendMessage(ChatColor.GRAY + "/kit gold");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/ci");
                        sender.sendMessage(ChatColor.GRAY + "/kit redstone");
                        sender.sendMessage(ChatColor.GRAY + "/hat");
                        sender.sendMessage(ChatColor.GRAY + "/kit obsidian");
                        sender.sendMessage(ChatColor.GRAY + "/kit emerald");
                        sender.sendMessage(ChatColor.GRAY + "/heal");
                        sender.sendMessage(ChatColor.GRAY + "/kit diamond");
                        sender.sendMessage(ChatColor.GRAY + "/kit decor");
                    }
                } else if (args[0].equalsIgnoreCase("vip")) {
                    if (sender.hasPermission("wolfessentials.rank.vip")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For VIP:"));
                        sender.sendMessage(ChatColor.GRAY + "/kit iron w/ color and format");
                        sender.sendMessage(ChatColor.GRAY + "7 Plots");
                        sender.sendMessage(ChatColor.GRAY + "6 PlayerVault (/pv)");
                        sender.sendMessage(ChatColor.GRAY + "/sellall vip");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/back");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                        sender.sendMessage(ChatColor.GRAY + "/kit gold");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/ci");
                        sender.sendMessage(ChatColor.GRAY + "/kit redstone");
                        sender.sendMessage(ChatColor.GRAY + "/hat");
                        sender.sendMessage(ChatColor.GRAY + "/kit obsidian");
                        sender.sendMessage(ChatColor.GRAY + "/kit emerald");
                        sender.sendMessage(ChatColor.GRAY + "/heal");
                        sender.sendMessage(ChatColor.GRAY + "/kit diamond");
                        sender.sendMessage(ChatColor.GRAY + "/kit decor");
                        sender.sendMessage(ChatColor.GRAY + "/kit vip");
                        sender.sendMessage(ChatColor.GRAY + "/kit vipbow");
                    }
                } else if (args[0].equalsIgnoreCase("trainee")) {
                    if (sender.hasPermission("wolfessentials.rank.trainee")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cTrainee&9:"));
                        sender.sendMessage(ChatColor.GRAY + "/tp");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/warn");
                        sender.sendMessage(ChatColor.GRAY + "/kick");
                        sender.sendMessage(ChatColor.GRAY + "/v");
                    }
                } else if (args[0].equalsIgnoreCase("helper")) {
                    if (sender.hasPermission("wolfessentials.rank.helper")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cHelper&9:"));
                        sender.sendMessage(ChatColor.GRAY + "/tp");
                        sender.sendMessage(ChatColor.GRAY + "/tphere");
                        sender.sendMessage(ChatColor.GRAY + "/ci");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/dupeip");
                        sender.sendMessage(ChatColor.GRAY + "/warn and /warnings");
                        sender.sendMessage(ChatColor.GRAY + "/kick");
                        sender.sendMessage(ChatColor.GRAY + "/tempmute");
                        sender.sendMessage(ChatColor.GRAY + "/mute");
                        sender.sendMessage(ChatColor.GRAY + "/god");
                    }
                } else if (args[0].equalsIgnoreCase("moderator")) {
                    if (sender.hasPermission("wolfessentials.rank.mod")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cModerator&9:"));
                        sender.sendMessage(ChatColor.GRAY + "/tp and /tphere");
                        sender.sendMessage(ChatColor.GRAY + "/tphere");
                        sender.sendMessage(ChatColor.GRAY + "/ci");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/dupeip");
                        sender.sendMessage(ChatColor.GRAY + "/warn and /warnings");
                        sender.sendMessage(ChatColor.GRAY + "/kick");
                        sender.sendMessage(ChatColor.GRAY + "/tempmute");
                        sender.sendMessage(ChatColor.GRAY + "/mute");
                        sender.sendMessage(ChatColor.GRAY + "/god");
                        sender.sendMessage(ChatColor.GRAY + "/heal");
                        sender.sendMessage(ChatColor.GRAY + "/tpo and /tpohere");
                        sender.sendMessage(ChatColor.GRAY + "/ban and /tempban");
                    }
                } else if (args[0].equalsIgnoreCase("admin")) {
                    if (sender.hasPermission("wolfessentials.rank.admin")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cAdmin&9:"));
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/heal");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/ban");
                        sender.sendMessage(ChatColor.GRAY + "/tempban");
                        sender.sendMessage(ChatColor.GRAY + "/tempmute");
                        sender.sendMessage(ChatColor.GRAY + "/mute");
                        sender.sendMessage(ChatColor.GRAY + "/kick");
                        sender.sendMessage(ChatColor.GRAY + "/ipban");
                        sender.sendMessage(ChatColor.GRAY + "/dupeip");
                        sender.sendMessage(ChatColor.GRAY + "/warn and /warnings");
                        sender.sendMessage(ChatColor.GRAY + "/tp /tpo /tpohere /tphere");
                        sender.sendMessage(ChatColor.GRAY + "/seen");
                        sender.sendMessage(ChatColor.GRAY + "/nick (colour and format)");
                        sender.sendMessage(ChatColor.GRAY + "/broadcast (/bc)");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                        sender.sendMessage(ChatColor.GRAY + "/god");
                    }
                } else if (args[0].equalsIgnoreCase("jrdev")) {
                    if (sender.hasPermission("wolfessentials.rank.jrdev")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cJrDev&9:"));
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/back");
                        sender.sendMessage(ChatColor.GRAY + "/heal and /feed");
                        sender.sendMessage(ChatColor.GRAY + "/tp and /tpo");
                        sender.sendMessage(ChatColor.GRAY + "/nick");
                        sender.sendMessage(ChatColor.GRAY + "/broadcast");
                        sender.sendMessage(ChatColor.GRAY + "/kick and /warn");
                    }
                } else if (args[0].equalsIgnoreCase("developer")) {
                    if (sender.hasPermission("wolfessentials.rank.dev")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cDeveloper&9:"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lOP!"));
                    }
                } else if (args[0].equalsIgnoreCase("co-owner")) {
                    if (sender.hasPermission("wolfessentials.rank.co")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Permissions For &cCo-Owner&9:"));
                        sender.sendMessage(ChatColor.GRAY + "/fly");
                        sender.sendMessage(ChatColor.GRAY + "/heal");
                        sender.sendMessage(ChatColor.GRAY + "/feed");
                        sender.sendMessage(ChatColor.GRAY + "/ban");
                        sender.sendMessage(ChatColor.GRAY + "/tempban");
                        sender.sendMessage(ChatColor.GRAY + "/tempmute");
                        sender.sendMessage(ChatColor.GRAY + "/mute");
                        sender.sendMessage(ChatColor.GRAY + "/kick");
                        sender.sendMessage(ChatColor.GRAY + "/ipban");
                        sender.sendMessage(ChatColor.GRAY + "/dupeip");
                        sender.sendMessage(ChatColor.GRAY + "/warn and /warnings");
                        sender.sendMessage(ChatColor.GRAY + "/tp /tpo /tpohere /tphere");
                        sender.sendMessage(ChatColor.GRAY + "/seen");
                        sender.sendMessage(ChatColor.GRAY + "/nick (colour and format)");
                        sender.sendMessage(ChatColor.GRAY + "/broadcast (/bc)");
                        sender.sendMessage(ChatColor.GRAY + "/afk");
                        sender.sendMessage(ChatColor.GRAY + "/god");
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
            }
        }
        return false;
    }
}
