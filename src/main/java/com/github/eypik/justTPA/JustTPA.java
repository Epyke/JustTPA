package com.github.eypik.justTPA;

import com.github.eypik.justTPA.command.TpaCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class JustTPA extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }

    @Override
    public void onDisable() {
    }

    /**
     * Registers plugin commands.
     */
    private void registerCommands() {
        TpaCommand tpaCommand = new TpaCommand();
        if (getCommand("tpa") != null) {
            getCommand("tpa").setExecutor(tpaCommand);
            getCommand("tpa").setTabCompleter(tpaCommand);
        }
    }
}
