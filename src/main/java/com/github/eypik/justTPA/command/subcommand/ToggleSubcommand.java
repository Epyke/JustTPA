package com.github.eypik.justTPA.command.subcommand;

import com.github.eypik.justTPA.command.TpaSubcommand;
import org.bukkit.command.CommandSender;

/**
 * Handles /tpa toggle.
 */
public final class ToggleSubcommand implements TpaSubcommand {

    @Override
    public boolean execute(CommandSender sender, String[] args) {
        sender.sendMessage("Command /tpa toggle works.");
        return true;
    }
}
