package me.fionster_fish_1.wessentials;

import me.fionster_fish_1.wessentials.commands.*;
import me.fionster_fish_1.wessentials.listeners.LeashEvent;
import me.fionster_fish_1.wessentials.listeners.onAwake;
import me.fionster_fish_1.wessentials.listeners.onChat;
import me.fionster_fish_1.wessentials.listeners.onJoin;
import me.fionster_fish_1.wessentials.listeners.onSleep;
import me.fionster_fish_1.wessentials.listeners.PlayerDeathEvent;
import me.fionster_fish_1.wessentials.listeners.PlayerRespawn;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class WEssentials extends JavaPlugin {

    public static WEssentials plugin;

    @Override
    public void onEnable() {
        getProcess();
        getLogger().info("Wolf Essentials Enabled");
        WEssentials.plugin = this;
    }

    @Override
    public void onDisable() {
        getLogger().info("Wolf Essentials Disabled");
        saveConfig();
        WEssentials.plugin = null;
    }

    public void getProcess() {
        config();
        instialiseGamemodeCMDs();
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new LeashEvent(this), this);
        pm.registerEvents(new onAwake(this), this);
        pm.registerEvents(new onChat(this), this);
        pm.registerEvents(new onJoin(this), this);
        pm.registerEvents(new onSleep(this), this);
        pm.registerEvents(new PlayerDeathEvent(this), this);
        pm.registerEvents(new PlayerRespawn(this), this);
        getCommand("donorrankreset").setExecutor(new donorrankreset(this));
        getCommand("forcecommandspyoff").setExecutor(new forcecommandspyoff(this));
        getCommand("purchaseanouncement").setExecutor(new purchaseanounce(this));
        getCommand("purchasecheck").setExecutor(new purchasecheck(this));
        getCommand("purchasehistory").setExecutor(new purchasehistory(this));
        getCommand("rankperms").setExecutor(new rankperms(this));
        getCommand("report").setExecutor(new report(this));
        getCommand("setrank").setExecutor(new setrank(this));
        getCommand("twitchstream").setExecutor(new twitchstream(this));
        getCommand("wolfessentials").setExecutor(new wolfessentials(this));
        getCommand("ytrec").setExecutor(new ytrec(this));
        getCommand("wsuicide").setExecutor(new suicide(this));
        getCommand("forcecommandspyon").setExecutor(new forcecommandspyoff(this));
        getCommand("craterewards").setExecutor(new craterewards(this));
        getCommand("staffsetrank").setExecutor(new staffsetrank(this));
        getCommand("updates").setExecutor(new updates(this));
        getCommand("acban").setExecutor(new acban(this));
        getCommand("acbanconfirm").setExecutor(new acbanconfirm(this));
    }

    public void instialiseGamemodeCMDs() {
        getCommand("wgm").setExecutor(new wgm(this));
        getCommand("wgms").setExecutor(new wgm(this));
        getCommand("wgmc").setExecutor(new wgm(this));
        getCommand("wgma").setExecutor(new wgm(this));
        getCommand("wgmsp").setExecutor(new wgm(this));
    }
    
    public void config() {
        try {
            if (!getDataFolder().exists()) {
                getDataFolder().mkdirs();
            }
            File file = new File(getDataFolder(), "config.yml");
            if (!file.exists()) {
                getLogger().warning("Config.yml not found, creating!");
                saveDefaultConfig();
            } else {
                getLogger().info("Config.yml found, loading!");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public String nopermission() {
        return "&4&lERROR&8: &cNo Permission";
    }
}
