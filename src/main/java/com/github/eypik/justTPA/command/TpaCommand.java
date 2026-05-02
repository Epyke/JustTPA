package com.github.eypik.justTPA.command;

import com.github.eypik.justTPA.command.subcommand.AcceptSubcommand;
import com.github.eypik.justTPA.command.subcommand.RejectSubcommand;
import com.github.eypik.justTPA.command.subcommand.ToggleSubcommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Handles the /tpa command and its subcommands.
 */
public final class TpaCommand implements CommandExecutor, TabCompleter {

    private static final String ACCEPT = "accept";
    private static final String REJECT = "reject";
    private static final String TOGGLE = "toggle";

    private final Map<String, TpaSubcommand> subcommands = new HashMap<>();

    /**
     * Creates a command executor for /tpa.
     */
    public TpaCommand() {
        subcommands.put(ACCEPT, new AcceptSubcommand());
        subcommands.put(REJECT, new RejectSubcommand());
        subcommands.put(TOGGLE, new ToggleSubcommand());
    }

    @Override
    public boolean onCommand(
            @NotNull CommandSender sender,
            @NotNull Command command,
            @NotNull String label,
            @NotNull String[] args
    ) {
        if (args.length == 0) {
            sender.sendMessage("Command /tpa <player> works.");
            return true;
        }

        String key = args[0].toLowerCase(Locale.ROOT);
        TpaSubcommand subcommand = subcommands.get(key);
        if (subcommand != null) {
            return subcommand.execute(sender, args);
        }

        sender.sendMessage("Command /tpa <player> works.");
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(
            @NotNull CommandSender sender,
            @NotNull Command command,
            @NotNull String alias,
            @NotNull String[] args
    ) {
        if (args.length != 1) {
            return List.of();
        }

        String partial = args[0].toLowerCase(Locale.ROOT);
        List<String> matches = new ArrayList<>();
        for (String option : subcommands.keySet()) {
            if (option.startsWith(partial)) {
                matches.add(option);
            }
        }
        return matches;
    }
}
