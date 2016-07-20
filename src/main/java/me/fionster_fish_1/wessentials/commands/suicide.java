package me.fionster_fish_1.wessentials.commands;

import me.fionster_fish_1.wessentials.WEssentials;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class suicide implements CommandExecutor {

    public static WEssentials plugin;

    public suicide(WEssentials instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("wsuicide")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                p.setHealth(0);
            }
        }
        return false;
    }
}
