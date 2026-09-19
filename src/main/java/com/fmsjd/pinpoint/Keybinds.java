package com.fmsjd.pinpoint;

import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;

public final class Keybinds {

    private static final KeyMapping.Category CATEGORY =
            KeyMapping.Category.register(
                    Pinpoint.id("main")
            );

    private static final KeyMapping COPY_PLAYER_COORDINATES =
            KeyMappingHelper.registerKeyMapping(
                    new KeyMapping(
                            "key.pinpoint.copy_player_coordinates",
                            InputConstants.Type.KEYSYM,
                            InputConstants.KEY_K,
                            CATEGORY
                    )
            );

    private Keybinds() {
        // Utility class; do not instantiate.
    }

    public static void register() {
        Pinpoint.LOGGER.info("Registering key bindings.");

        ClientTickEvents.END_CLIENT_TICK.register(Keybinds::handleClientTick);

        Pinpoint.LOGGER.info("Key binding registered: K → Copy Player Coordinates.");
    }

    private static void handleClientTick(Minecraft client) {
        while (COPY_PLAYER_COORDINATES.consumeClick()) {
            copyPlayerCoordinates(client);
        }
    }

    private static void copyPlayerCoordinates(Minecraft client) {
        if (client.player == null) {
            Pinpoint.LOGGER.warn(
                    "Copy Player Coordinates pressed, but no player is currently available."
            );
            return;
        }

        Pinpoint.LOGGER.debug("Copy Player Coordinates key pressed.");

        String coordinates = CoordinateUtil.getPlayerCoordinates(client.player);

        ClipboardUtil.copy(coordinates);

        client.player.sendSystemMessage(
                Component.translatable("message.pinpoint.player_coordinates_copied")
        );

        Pinpoint.LOGGER.debug("Confirmation message displayed.");
    }
}