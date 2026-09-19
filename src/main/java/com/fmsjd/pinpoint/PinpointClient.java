package com.fmsjd.pinpoint;

import net.fabricmc.api.ClientModInitializer;

public class PinpointClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Pinpoint.LOGGER.info("Initialising client components.");

        Keybinds.register();

        Pinpoint.LOGGER.info("Client initialisation complete.");
    }
}