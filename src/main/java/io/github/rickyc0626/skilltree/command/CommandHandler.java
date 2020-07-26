package io.github.rickyc0626.skilltree.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler implements CommandExecutor
{
    private static Map<String, CommandInterface> commands = new HashMap<>();

    public void register(String name, CommandInterface command) { commands.put(name, command); }
    public boolean exists(String name) { return commands.containsKey(name); }
    public CommandInterface getExecutor(String name) { return commands.get(name); }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(label.matches("(?i)skilltree|st"))
        {
            if(args.length == 0)
            {
                return getExecutor("skilltree").onCommand(sender, command, label, args);
            }
            else if(args.length > 0)
            {
                if(exists(args[0]))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
