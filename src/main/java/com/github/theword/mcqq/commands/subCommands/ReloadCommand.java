package com.github.theword.mcqq.commands.subCommands;

import com.github.theword.mcqq.commands.FabricSubCommand;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.ServerCommandSource;

import static com.github.theword.mcqq.utils.Tool.websocketManager;


public class ReloadCommand extends ReloadCommandAbstract implements FabricSubCommand {


    /**
     * @param context ServerCommandSource
     * @return int
     */
    @Override
    public int onCommand(CommandContext<ServerCommandSource> context) {
        websocketManager.reloadWebsocket(true, context);
        return Command.SINGLE_SUCCESS;
    }
}
