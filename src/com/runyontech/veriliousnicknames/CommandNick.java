package com.runyontech.veriliousnicknames;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import com.runyontech.veriliousnicknames.VeriliousNicknames;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class CommandNick implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (s.equalsIgnoreCase("nick")) {
                if (strings.length == 0) {
                    player.sendMessage("Please Enter A Nickname. Example: /nick <nickname>");
                } else if (strings[0].equalsIgnoreCase("reset")) {
                    player.setPlayerListName(player.getName());
                    player.setDisplayName(player.getName());
                    player.sendMessage("You have reset your nickname to " + player.getName());
                } else {
                    player.setPlayerListName(strings[0]);
                    player.setDisplayName(strings[0]);
                    player.sendMessage("You have succesfully changed your nickname to " + player.getDisplayName());
                }
            }
        }
        return true;
    }
}
