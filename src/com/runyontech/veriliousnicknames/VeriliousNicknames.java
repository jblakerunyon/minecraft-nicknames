package com.runyontech.veriliousnicknames;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VeriliousNicknames extends JavaPlugin {

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {
        System.out.println("Verilious' Nicknames Plugin Enabled!");
        this.getCommand("nick").setExecutor(new CommandNick());
    }
}
