package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class purchasehistory implements CommandExecutor {

    public static WEssentials plugin;
    public purchasehistory(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("purchasehistory")) {
            if (sender.hasPermission("wolfessentials.purchasehistory")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Made Purchases:"));
                /* Full Ranks */
                if (sender.hasPermission("wolfessentials.purchase.ranks.ironr")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Iron Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.ranks.goldr")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gold Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.ranks.redstoner")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Redstone Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.ranks.obsidianr")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Obsidian Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.ranks.emeraldr")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Emerald Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.ranks.diamondr")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Diamond Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.ranks.vipr")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Vip Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.ranks.gummyr")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gummy Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.ranks.wolfgodr")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7WolfGod Rank"));
                }
                /* Rank Upgrades */
                if (sender.hasPermission("wolfessentials.purchase.up.iron.to.gold")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Iron - Gold Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.up.gold.to.redstone")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gold - Redstone Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.up.redstone.to.obsidian")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Redstone - Obsidian Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.up.obsidian.to.emerald")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Obsidian - Emerald Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.up.emerald.to.diamond")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Emerald - Diamond Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.up.diamond.to.vip")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Diamond - VIP Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.up.vip.to.gummy")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7VIP - Gummy Rank"));
                }
                if (sender.hasPermission("wolfessentials.purchase.up.gummy.to.wolfgod")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gummy - WolfGod Rank"));
                }
                /* Tags */
                if (sender.hasPermission("wolfessentials.purchase.suf.yolo")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7#YOLO Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.swag")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7#SWAG Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.cookie")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7CookieMonster Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.master")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Master Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.bae")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Bae Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.wolfer")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Wolfer Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.wizard")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Wizard Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.noob")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Noob Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.sapling")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Sapling Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.god")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7God Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.alone")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Alone Tag"));
                }
                if (sender.hasPermission("wolfessentials.purchase.suf.stupid")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Stupid Tag"));
                }
                /* Perms/Commands */
                if (sender.hasPermission("wolfessentials.purchase.perms.as")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Autosell Permissions (/as)"));
                }
                if (sender.hasPermission("wolfessentials.purchase.perms.fly")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/fly Permissions"));
                }
                if (sender.hasPermission("wolfessentials.purchase.perms.sellall")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/sellall Permissions"));
                }
                /* UnBans/Mutes */
                if (sender.hasPermission("wolfessentials.purchase.un.unban")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7UnBan!!!!"));
                }
                if (sender.hasPermission("wolfessentials.purchase.un.unmute.1")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7UnMute #1"));
                }
                if (sender.hasPermission("wolfessentials.purchase.un.unmute.2")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7UnMute #2"));
                }
            } else {
                String noperms = WEssentials.plugin.nopermission();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', noperms));
            }
        }
        return false;
    }
}
