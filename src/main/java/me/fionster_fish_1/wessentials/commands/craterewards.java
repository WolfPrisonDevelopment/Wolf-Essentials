package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class craterewards implements CommandExecutor {

    public static WEssentials plugin;
    public craterewards(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("craterewards")) {
            if (sender.hasPermission("wolfessentials.craterewards")) {
                if (args.length <= 0) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', NotEnoughArgsError()));
                } else {
                    if (args[0].equalsIgnoreCase("Vote")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: Vote"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&750k In Game Currency &8-- &960% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Vote Sword &8-- &950% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Vote Armour &8-- &950% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&740k In Game Currency &8-- &970% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Vote Kit &8-- &910% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&710Mil In Game Currency &8-- &920% Chance"));
                    } else if (args[0].equalsIgnoreCase("Rankup")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: Rankup"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&750k In Game Currency &8-- &980% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&764 Golden Apples &8-- &950% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7100k In Game Currency &8-- &9100% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7PvP Bow &8-- &91% Chance"));
                    } else if (args[0].equalsIgnoreCase("Special")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: Special"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Redstone Kit &8-- &9100% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Kit Obsidian &8-- &950% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Kit Emerald &8-- &950% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Kit Diamond &8-- &925% Chance"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Kit VIP &8-- &910% Chance"));
                    } else if (args[0].equalsIgnoreCase("WolfOP")) {
                        if (args.length < 2) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', wolfoperror()));
                        } else {
                            if (args[1].equalsIgnoreCase("1")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: WolfOP, Package 1"));
                                sender.sendMessage(ChatColor.GRAY + "25 Million In Game Money");
                                sender.sendMessage(ChatColor.GRAY + "1 Extra Vote Key");
                                sender.sendMessage(ChatColor.GRAY + "Kit Redstone");
                            } else if (args[1].equalsIgnoreCase("2")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: WolfOP, Package 2"));
                                sender.sendMessage(ChatColor.GRAY + "50 Million In Game Money");
                                sender.sendMessage(ChatColor.GRAY + "2 Extra Vote Keys");
                                sender.sendMessage(ChatColor.GRAY + "Kit Obsidian");
                                sender.sendMessage(ChatColor.GRAY + "64 Gapples");
                            } else if (args[1].equalsIgnoreCase("3")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: WolfOP, Package 3"));
                                sender.sendMessage(ChatColor.GRAY + "75 Million In Game Money");
                                sender.sendMessage(ChatColor.GRAY + "3 Extra Vote Keys");
                                sender.sendMessage(ChatColor.GRAY + "Kit Emerald");
                                sender.sendMessage(ChatColor.GRAY + "Kit LuckyAxe");
                            } else if (args[1].equalsIgnoreCase("4")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: WolfOP, Package 4"));
                                sender.sendMessage(ChatColor.GRAY + "100 Million In Game Money");
                                sender.sendMessage(ChatColor.GRAY + "4 Extra Vote Keys");
                                sender.sendMessage(ChatColor.GRAY + "Kit Diamond");
                                sender.sendMessage(ChatColor.GRAY + "Kit LuckyAxe");
                                sender.sendMessage(ChatColor.GRAY + "Kit GodPick");
                            } else if (args[1].equalsIgnoreCase("5")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: WolfOP, Package 5"));
                                sender.sendMessage(ChatColor.GRAY + "300 Million In Game Money");
                                sender.sendMessage(ChatColor.GRAY + "5 Extra Vote Keys");
                                sender.sendMessage(ChatColor.GRAY + "Kit VIP");
                                sender.sendMessage(ChatColor.GRAY + "Kit LuckyAxe");
                                sender.sendMessage(ChatColor.GRAY + "Kit Godpick");
                                sender.sendMessage(ChatColor.GRAY + "/fly Permissions");
                                sender.sendMessage(ChatColor.GRAY + "Lucky Tab Prefix");
                                sender.sendMessage(ChatColor.GRAY + "Lucky Chat Suffix");
                            } else if (args[1].equalsIgnoreCase("6")) {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lCrate&9&lRewards &8> &7Displaying all rewards for crate: WolfOP, Package 6"));
                                sender.sendMessage(ChatColor.GRAY + "500 Million In Game Money");
                                sender.sendMessage(ChatColor.GRAY + "8 Extra Vote Keys");
                                sender.sendMessage(ChatColor.GRAY + "2 Kit VIP's");
                                sender.sendMessage(ChatColor.GRAY + "2 Kit Luckyaxe's");
                                sender.sendMessage(ChatColor.GRAY + "Kit Godpick");
                                sender.sendMessage(ChatColor.GRAY + "1 Extra WolfOP Key!");
                                sender.sendMessage(ChatColor.GRAY + "/fly Permissions");
                                sender.sendMessage(ChatColor.GRAY + "/sellall Permissions");
                                sender.sendMessage(ChatColor.GRAY + "Join server when full permissions");
                                sender.sendMessage(ChatColor.GRAY + "Legendary prefix in tab");
                                sender.sendMessage(ChatColor.GRAY + "Legendary suffix in chat");
                            } else {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', wolfoperror()));
                            }
                        }
                    } else {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', NotEnoughArgsError()));
                    }
                }
            }
        }
        return false;
    }

    private String wolfoperror() {
       return "&4&lCrate&9&lRewards &8> &4&lERROR&8: &cPlease enter a valid package for WolfOP (1, 2, 3, 4, 5, 6)";
    }

    private String NotEnoughArgsError() {
        return "&4&lCrate&9&lRewards &8> &4&lERROR&8: &cPlease enter a valid crate (Vote, Rankup, Special, WolfOP)";
    }
}
