package io.github.rickyc0626.skilltree.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface CommandInterface
{
    boolean onCommand(CommandSender sender, Command command, String label, String[] args);
}
