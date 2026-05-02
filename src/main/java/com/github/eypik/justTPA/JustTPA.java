package com.github.eypik.justTPA;

import com.github.eypik.justTPA.command.TpaCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class JustTPA extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }

    @Override
    public void onDisable() {
        System.out.println("bye bye!");
    }

    /**
     * Registers plugin commands.
     */
    private void registerCommands() {
        TpaCommand tpaCommand = new TpaCommand();
        if (getCommand("tpa") != null) {
            Objects.requireNonNull(getCommand("tpa")).setExecutor(tpaCommand);
            Objects.requireNonNull(getCommand("tpa")).setTabCompleter(tpaCommand);
        }
    }
}
