package io.github.rickyc0626.skilltree;

import io.github.rickyc0626.skilltree.command.CommandHandler;
import io.github.rickyc0626.skilltree.command.skilltree.SkillTreeCmd;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkillTree extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        registerCommands();
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }

    private void registerCommands()
    {
        CommandHandler cmdhandler = new CommandHandler();
        cmdhandler.register("skilltree", new SkillTreeCmd());
        getCommand("skilltree").setExecutor(cmdhandler);
    }
}
