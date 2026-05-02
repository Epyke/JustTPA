package com.github.eypik.justTPA.command.subcommand;

import com.github.eypik.justTPA.command.TpaSubcommand;
import org.bukkit.command.CommandSender;

/**
 * Handles /tpa accept.
 */
public final class AcceptSubcommand implements TpaSubcommand {

    @Override
    public boolean execute(CommandSender sender, String[] args) {
        sender.sendMessage("Command /tpa accept works.");
        return true;
    }
}
