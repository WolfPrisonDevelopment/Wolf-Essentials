package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.org.ibex.nestedvm.Runtime;
import org.bukkit.entity.Player;

public class wgm implements CommandExecutor {

    public static WEssentials plugin;
    public wgm(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("wgm")) {
            if (sender.hasPermission("wolfessentials.gm")) {
                if (args.length <= 0) {
                    sender.sendMessage(ChatColor.RED + "Please Enter A Valid Arguement");
                    sender.sendMessage(ChatColor.RED + "Valid Arguements");
                    sender.sendMessage(ChatColor.RED + "0 1 2 3");
                    sender.sendMessage(ChatColor.RED + "Survival Creative Adventure Spectator");
                    sender.sendMessage(ChatColor.RED + "To set someone elses gamemode please use:");
                    sender.sendMessage(ChatColor.RED + "/wgm (mode) (player)");
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
                } else if (args.length >= 3) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cPlease use the correct syntax (/wgm {player) {mode})"));
                } else if (args.length == 2) {
                    String player = args[1];
                    Player selectedPlayer = Bukkit.getServer().getPlayer(player);
                    if (selectedPlayer == null) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cThat player is not online!"));
                    } else {
                        if (args[1].equalsIgnoreCase("0")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to survival"));
                            selectedPlayer.setGameMode(GameMode.SURVIVAL);
                        } else if (args[1].equalsIgnoreCase("1")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to creative"));
                            selectedPlayer.setGameMode(GameMode.CREATIVE);
                        } else if (args[1].equalsIgnoreCase("2")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to adventure"));
                            selectedPlayer.setGameMode(GameMode.ADVENTURE);
                        } else if (args[1].equalsIgnoreCase("3")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to survival"));
                            selectedPlayer.setGameMode(GameMode.SPECTATOR);
                        } else if (args[1].equalsIgnoreCase("survival")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to survival"));
                            selectedPlayer.setGameMode(GameMode.SURVIVAL);
                        } else if (args[1].equalsIgnoreCase("creative")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to creative"));
                            selectedPlayer.setGameMode(GameMode.CREATIVE);
                        } else if (args[1].equalsIgnoreCase("adventure")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to adventure"));
                            selectedPlayer.setGameMode(GameMode.ADVENTURE);
                        } else if (args[1].equalsIgnoreCase("spectator")) {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to spectator"));
                            selectedPlayer.setGameMode(GameMode.SPECTATOR);
                        }
                    }
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cNo Permission!"));
            }
        }

        if (cmd.getName().equalsIgnoreCase("wgms")) {
            if (sender.hasPermission("wolfessentials.gm")) {
                if (args.length == 0) {
                    Player p = (Player) sender;
                    p.setGameMode(GameMode.SURVIVAL);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Self-set gamemode to survival!"));
                } else if (args.length == 1) {
                    String player = args[0];
                    Player selectedPlayer = Bukkit.getServer().getPlayer(player);
                    selectedPlayer.setGameMode(GameMode.SURVIVAL);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to survival!"));
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Please use the correct syntax (/wgms {player})"));
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cNo Permission!"));
            }
        }

        if (cmd.getName().equalsIgnoreCase("wgmc")) {
            if (sender.hasPermission("wolfessentials.gm")) {
                if (args.length == 0) {
                    Player p = (Player) sender;
                    p.setGameMode(GameMode.CREATIVE);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Self-set gamemode to creative!"));
                } else if (args.length == 1) {
                    String player = args[0];
                    Player selectedPlayer = Bukkit.getServer().getPlayer(player);
                    selectedPlayer.setGameMode(GameMode.CREATIVE);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to creative!"));
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Please use the correct syntax (/wgmc {player})"));
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cNo Permission!"));
            }
        }

        if (cmd.getName().equalsIgnoreCase("wgma")) {
            if (sender.hasPermission("wolfessentials.gm")) {
                if (args.length == 0) {
                    Player p = (Player) sender;
                    p.setGameMode(GameMode.ADVENTURE);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Self-set gamemode to adventure!"));
                } else if (args.length == 1) {
                    String player = args[0];
                    Player selectedPlayer = Bukkit.getServer().getPlayer(player);
                    selectedPlayer.setGameMode(GameMode.ADVENTURE);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to adventure!"));
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Please use the correct syntax (/wgma {player})"));
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cNo Permission!"));
            }
        }

        if (cmd.getName().equalsIgnoreCase("wgmsp")) {
            if (sender.hasPermission("wolfessentials.gm")) {
                if (args.length == 0) {
                    Player p = (Player) sender;
                    p.setGameMode(GameMode.SPECTATOR);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Self-set gamemode to spectator!e"));
                } else if (args.length == 1) {
                    String player = args[0];
                    Player selectedPlayer = Bukkit.getServer().getPlayer(player);
                    selectedPlayer.setGameMode(GameMode.SPECTATOR);
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Set &c" + player + "&7\'s gamemode to spectator!"));
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lWGM &8> &7Please use the correct syntax (/wgmsp {player})"));
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cNo Permission!"));
            }
        }
        return false;
    }
}
