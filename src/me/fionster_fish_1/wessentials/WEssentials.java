package me.fionster_fish_1.wessentials;

import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.Iterator;

public class WEssentials extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Wolf Essentials Enabled");
        getServer().getPluginManager().registerEvents(this, this);
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("Wolf Essentials Disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("wgm")) {
            if (sender.hasPermission("wolfessentials.gm")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "Please Enter A Valid Arguement");
                    sender.sendMessage(ChatColor.RED + "Valid Arguements");
                    sender.sendMessage(ChatColor.RED + "0 1 2 3");
                    sender.sendMessage(ChatColor.RED + "Survival Creative Adventure Spectator");
                } else if (args[0].equalsIgnoreCase("0")) {
                    Player player = (Player) sender;
                    player.setGameMode(GameMode.SURVIVAL);
                    String name = sender.getName();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Set Gamemode For &4" + name + " &9Survival"));
                } else if (args[0].equalsIgnoreCase("1")) {
                    Player player = (Player) sender;
                    player.setGameMode(GameMode.CREATIVE);
                    String name = sender.getName();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Set Gamemode For &4" + name + " &9Creative"));
                } else if (args[0].equalsIgnoreCase("2")) {
                    Player player = (Player) sender;
                    player.setGameMode(GameMode.ADVENTURE);
                    String name = sender.getName();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Set Gamemode For &4" + name + " &9Adventure"));
                } else if (args[0].equalsIgnoreCase("3")) {
                    Player player = (Player) sender;
                    player.setGameMode(GameMode.SPECTATOR);
                    String name = sender.getName();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Set Gamemode For &4" + name + " &9Spectator"));
                } else if (args[0].equalsIgnoreCase("survival")) {
                    Player player = (Player) sender;
                    player.setGameMode(GameMode.SURVIVAL);
                    String name = sender.getName();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Set Gamemode For &4" + name + " &9Survival"));
                } else if (args[0].equalsIgnoreCase("creative")) {
                    Player player = (Player) sender;
                    player.setGameMode(GameMode.CREATIVE);
                    String name = sender.getName();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Set Gamemode For &4" + name + " &9Creative"));
                } else if (args[0].equalsIgnoreCase("adventure")) {
                    Player player = (Player) sender;
                    player.setGameMode(GameMode.ADVENTURE);
                    String name = sender.getName();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Set Gamemode For &4" + name + " &9Adventure"));
                } else if (args[0].equalsIgnoreCase("spectator")) {
                    Player player = (Player) sender;
                    player.setGameMode(GameMode.SPECTATOR);
                    String name = sender.getName();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Set Gamemode For &4" + name + " &9Spectator"));
                    return true;
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("ytrec")) {
            if (sender.hasPermission("wolfessentials.ytrec")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "WARNING: Using This Command Will Anounce That You Are Recording To The Whole Server");
                    sender.sendMessage(ChatColor.RED + "type </ytrec confirm> to execute this action");
                } else if (args[0].equalsIgnoreCase("confirm")) {
                    String name = sender.getName();
                    Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&l" + name + " &9&lIs Now Recording For Youtube"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lType &4&l/ytrec end &9&lTo Anounce You Have Finished"));
                } else if (args[0].equalsIgnoreCase("end")) {
                    String name = sender.getName();
                    Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&l" + name + " &9&lIs No Long Recording For Youtube :("));
                    sender.sendMessage(ChatColor.RED + "Successfully Ended");
                    return true;
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("twitchstream")) {
            if (sender.hasPermission("wolfessentials.twitchstream")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "WARNING: Using This Command Will Anounce That You Have Started To Stream.");
                    sender.sendMessage(ChatColor.RED + "Type </twitchstream confirm> to execute this action!");
                } else if (args[0].equalsIgnoreCase("confirm")) {
                    String name = sender.getName();
                    Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&l" + name + " &9&lIs Now Streaming To Twitch"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lType &4&l/twitchstream end &9&lTo Anounce You Have Stopped Streaming"));
                } else if (args[0].equalsIgnoreCase("end")) {
                    String name = sender.getName();
                    Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&l" + name + " &9&lIs No Longer Streaming To Twitch"));
                    sender.sendMessage(ChatColor.RED + "Successfully Ended");
                    return true;
                }
            }
        }
        if (cmd.getName().equalsIgnoreCase("wolfessentials")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Please Enter A Valid Sub Command"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Valid Sub Commands:"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Info"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Help"));
                if (sender.hasPermission("wolfesssentials.reload")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Reload"));
                }
            } else if (args[0].equalsIgnoreCase("info")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9WolfEssentials Info Page:"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7WolfEssentials Developed By fionster_fish_1"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7WolfEssentials Was Made Entirely By fionster_fish_1 and is maintained by whom"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7WolfEssentials Was Made Custom For WolfPrison And Cannot Be Found Anywhere Else!"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9WolfEssentials &7-fionster_fish_1"));
            } else if (args[0].equalsIgnoreCase("help")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9WolfEssentials Help Page:"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/wolfessentials &9-- &7WolfEssentials Command"));
                if (sender.hasPermission("wolfessentials.gm")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/wgm &9-- &7WolfEssentials Gamemode Command"));
                }
                if (sender.hasPermission("wolfessentials.ytrec")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/ytrec &9-- &7Youtube Recording Command"));
                }
                if (sender.hasPermission("wolfessentials.twitchstream")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/twitchstream &9-- &7Twitch Streaming Command"));
                }
                if (sender.hasPermission("wolfessentials.rankperms")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/rankperms &9-- &7Rank Perms Command"));
                }
                if (sender.hasPermission("wolfessentials.purchasehistory")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/purchasehistory &9-- &7Purchase History Command"));
                }
                if (sender.hasPermission("wolfessentials.setrank")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/setrank &9-- &7Setrank Command"));
                }
                if (sender.hasPermission("wolfessentials.purchaseanounce")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/purchaseanouncent &9-- &7Purchase Anouncment Command"));
                }
                if (sender.hasPermission("wolfessentials.forcecommandspyoff")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/forcecommandspyoff &9-- &Force Commandspy Off Command"));
                }
            } else if (args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission("wolfessentials.reload")) {
                    reloadConfig();
                    String rmessage = getConfig().getString("reloadmessage");
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', rmessage));
                }
            }
        }
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
            }
        }
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
        if (cmd.getName().equalsIgnoreCase("report")) {
            if (!(sender instanceof Player)) {
                System.out.println("You are not a player.");
                return true;
            }
            Player player = (Player) sender;
            if (args.length < 2) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lUsage:&4&l /report <player> <reason>"));
                return true;
            }
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target == null) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lThat player is not online."));
                return true;
            }

            String reason = "";
            for (int i = 1; i < args.length; i++) {
                String arg = args[i] + " ";
                reason = reason + arg;
            }

            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&lCommand successfully executed!"));
            for (Player listPlayer : Bukkit.getOnlinePlayers()) {
                if (listPlayer.hasPermission("wolfessentials.staff")) {
                    listPlayer.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWolf&9&lReport &8> " + target.getName() + "&7 reported by &f" + player.getName() + "&7 - \"&e" + reason + "&7\""));
                }
            }
            return true;
        }

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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.color");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.format");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.iron");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add autosell.sellall.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add esssentials.warps.redstone");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.kits.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.warps.gold");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.color");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.format");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.color");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.format");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.color");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.format");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.color");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.format");
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
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.nick.color");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.fly");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + playerName + " add essentials.clearinventory");
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "purchaseanouncement " + playerName + " VIP");
                    }
                }
            }
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("purchaseanouncement")) {
            if (sender.hasPermission("wolfessentials.purchaseanounce")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR: &cPlease Use The Correct Syntax (/purchaseanouncement {player} {rank}"));
                } else if (args.length == 1) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR: &cPlease Use The Correct Syntax (/purchaseanouncement {player} {rank}"));
                } else if (args.length == 2) {
                    String donatorName = args[0];
                    String donatedItem = args[1];

                    Player selected = Bukkit.getServer().getPlayer(donatorName);

                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4&lDonation&9&lAnouncer &8> &9" + donatorName + " &7bought &9" + donatedItem + "&7!!!"));

                    selected.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lDonation&9&lMessager &8> &7Hey there, " + donatorName + "&7! Thank you for purchasing" + donatedItem + ". You have contributed towards the development of the server and general funding! Thank you for your generosity, -The WolfPrison Team :D"));
                    return true;
                }
            }
        }

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
            }
        }

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
            }
        }
        if (cmd.getName().equalsIgnoreCase("purchasecheck")) {
            if (sender.hasPermission("wolfessentials.purchasecheck")) {
                if (args.length < 1) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cInvalid usage (/purchasecheck {player})"));
                } else if (args.length > 1) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cInvalid usage (/purchasecheck {player})"));
                } else if (args.length == 1) {
                    String selectedPlayer = args[0];
                    Player selected = Bukkit.getServer().getPlayer(selectedPlayer);
                    if (selected == null) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cThat player is not online!"));
                    } else {
                        /* Full Ranks */
                        if (selected.hasPermission("wolfessentials.purchase.ranks.ironr")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Iron Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.ranks.goldr")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gold Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.ranks.redstoner")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Redstone Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.ranks.obsidianr")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Obsidian Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.ranks.emeraldr")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Emerald Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.ranks.diamondr")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Diamond Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.ranks.vipr")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Vip Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.ranks.gummyr")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gummy Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.ranks.wolfgodr")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7WolfGod Rank"));
                        }
                        /* Rank Upgrades */
                        if (selected.hasPermission("wolfessentials.purchase.up.iron.to.gold")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Iron - Gold Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.up.gold.to.redstone")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gold - Redstone Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.up.redstone.to.obsidian")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Redstone - Obsidian Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.up.obsidian.to.emerald")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Obsidian - Emerald Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.up.emerald.to.diamond")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Emerald - Diamond Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.up.diamond.to.vip")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Diamond - VIP Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.up.vip.to.gummy")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7VIP - Gummy Rank"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.up.gummy.to.wolfgod")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gummy - WolfGod Rank"));
                        }
                        /* Tags */
                        if (selected.hasPermission("wolfessentials.purchase.suf.yolo")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7#YOLO Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.swag")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7#SWAG Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.cookie")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7CookieMonster Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.master")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Master Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.bae")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Bae Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.wolfer")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Wolfer Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.wizard")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Wizard Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.noob")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Noob Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.sapling")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Sapling Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.god")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7God Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.alone")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Alone Tag"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.suf.stupid")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Stupid Tag"));
                        }
                        /* Perms/Commands */
                        if (selected.hasPermission("wolfessentials.purchase.perms.as")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Autosell Permissions (/as)"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.perms.fly")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/fly Permissions"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.perms.sellall")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7/sellall Permissions"));
                        }
                        /* UnBans/Mutes */
                        if (selected.hasPermission("wolfessentials.purchase.un.unban")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7UnBan!!!!"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.un.unmute.1")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7UnMute #1"));
                        }
                        if (selected.hasPermission("wolfessentials.purchase.un.unmute.2")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7UnMute #2"));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @EventHandler
    public void onSleep(PlayerBedEnterEvent e) {
        Player player = e.getPlayer();
        String sleep = getConfig().getString("onsleepmessage");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', sleep));
    }

    @EventHandler
    public void onAwake(PlayerBedLeaveEvent e) {
        Player player = e.getPlayer();
        String awake = getConfig().getString("onawakemessage");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', awake));
    }

    @EventHandler
    public void PDM(PlayerDeathEvent e) {
        Player player = e.getEntity();
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9*Queue Sad Violin*"));
    }

    @EventHandler
    public void Respawn(PlayerRespawnEvent e) {
        Player player = e.getPlayer();
        String rmessage = getConfig().getString("respawnmessage");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', rmessage));
    }

    @EventHandler
    public void LeashEvent(PlayerLeashEntityEvent e) {
        Player player = e.getPlayer();
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Your Mine Now!"));
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        String message = e.getMessage();
        String format = e.getFormat();

        if (player.hasPermission("wolfessentials.chatfilter.check")) {
            if (message.toLowerCase().contains("shit")) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.RED + "Please Refrain From Using Bad Language");
            } else if (message.toLowerCase().contains("fuck")) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.RED + "Please Refrain From Using Bad Language");
            } else if (message.toLowerCase().contains("bitch")) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.RED + "Please Refrain From Using Bad Language");
            } else if (message.toLowerCase().contains("cunt")) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.RED + "Please Refrain From Using Bad Language");
            } else if (message.toLowerCase().contains("lag")) {
                e.setMessage("I LOVE WOLFPRISON!!!");
            }
        }

        if (player.hasPermission("wolfprison.staffchat")) {
            if (!(message.startsWith("@")))
                return;
            if (message.equalsIgnoreCase("@")) {
                player.sendMessage(ChatColor.RED + "Invalid syntax, you have to send a message after the '@'");
                return;
            } else {
                e.setCancelled(true);
                String send = message.substring(1);
                for (Player target : Bukkit.getOnlinePlayers()) {
                    if (target.hasPermission("wolfprison.staffchat")) {
                        target.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                "&4&lStaff&9&lChat &8> " + getRank(player) + "&5&o" + player.getName() + "&8: &7" + send));
                    }
                }
            }
        }
    }
    private String getRank(Player p) {
        String wolfEssentials = "wolfessentials.rank.";
        if (p.hasPermission(wolfEssentials + "trainee"))
            return "&8&l[&3&lTrainee&8&l]&r ";
        if (p.hasPermission(wolfEssentials + "helper"))
            return "&8&l[&5&lHelper&8&l] ";
        if (p.hasPermission(wolfEssentials + "mod"))
            return "&8&l[&1&lModerator&8&l] ";
        if (p.hasPermission(wolfEssentials + "admin"))
            return "&8&l[&6&lAdmin&8&l] ";
        if (p.hasPermission(wolfEssentials + "builder"))
            return "&8&l[&3&lBuilder&8&l] ";
        if (p.hasPermission(wolfEssentials + "co"))
            return "&8&l[&4&lCo-Owner&8&l] ";
        if (p.hasPermission(wolfEssentials + "dev"))
            return "&8&l[&4&lDev&8&l] ";
        if (p.hasPermission(wolfEssentials + "manager"))
            return "&8&l[&c&lManager&8&l] ";
        if (p.hasPermission(wolfEssentials + "owner"))
            return "&8&l[&c&lOwner&8&l] ";
        return "";
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String mainmessage = getConfig().getString("playermainmessage");
        String submessage = getConfig().getString("playersubmessage");
        String staffmessage = getConfig().getString("staffmessage");
        String header = getConfig().getString("headermessage");
        String footer = getConfig().getString("footermessage");
        Player p = e.getPlayer();
        CraftPlayer cp = (CraftPlayer) p;
        EntityPlayer ep = cp.getHandle();

        if (p.hasPermission("wolfessentials.player")) {
            p.sendTitle(ChatColor.translateAlternateColorCodes('&', mainmessage), ChatColor.translateAlternateColorCodes('&', submessage));
        }

        if (p.hasPermission("wolfessentials.staff")) {
            p.sendTitle(ChatColor.translateAlternateColorCodes('&', mainmessage), ChatColor.translateAlternateColorCodes('&', staffmessage));
        }

        PacketPlayOutPlayerListHeaderFooter list = new PacketPlayOutPlayerListHeaderFooter(IChatBaseComponent.ChatSerializer.a(ChatColor.translateAlternateColorCodes('&', header)));

        try {
            Field fieldB = list.getClass().getDeclaredField("b");
            fieldB.setAccessible(true);
            fieldB.set(list, IChatBaseComponent.ChatSerializer.a(ChatColor.translateAlternateColorCodes('&', footer)));
        } catch (NoSuchFieldException | IllegalAccessException x) {
            x.printStackTrace();
        }
        ep.playerConnection.sendPacket(list);
    }
}
