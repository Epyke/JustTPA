package com.github.eypik.justTPA.command;

import org.bukkit.command.CommandSender;

/**
 * Represents a subcommand handler for /tpa.
 */
public interface TpaSubcommand {

    /**
     * Executes the subcommand.
     *
     * @param sender command sender
     * @param args subcommand arguments
     * @return true if handled
     */
    boolean execute(CommandSender sender, String[] args);
}
