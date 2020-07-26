package io.github.rickyc0626.skilltree.command.skilltree;

import io.github.rickyc0626.skilltree.command.CommandInterface;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SkillTreeCmd implements CommandInterface
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(sender.hasPermission("skilltree.menu") || sender.isOp())
        {
            if(sender instanceof Player)
            {
                Player player = (Player) sender;
                player.sendMessage("Skill Tree root command: menu should pop up");
                return true;
            }
            else sender.sendMessage("You must be a player to run that command");
        }
        return false;
    }
}
