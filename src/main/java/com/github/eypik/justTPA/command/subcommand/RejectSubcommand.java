package com.github.eypik.justTPA.command.subcommand;

import com.github.eypik.justTPA.command.TpaSubcommand;
import org.bukkit.command.CommandSender;

/**
 * Handles /tpa reject.
 */
public final class RejectSubcommand implements TpaSubcommand {

    @Override
    public boolean execute(CommandSender sender, String[] args) {
        sender.sendMessage("Command /tpa reject works.");
        return true;
    }
}
