package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
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
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lERROR&8: &cNo Permission!"));
            }
        }
        return false;
    }
}
