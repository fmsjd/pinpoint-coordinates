package com.fmsjd.pinpoint;

import net.minecraft.client.Minecraft;

public final class ClipboardUtil {

    private ClipboardUtil() {
        // Utility class; do not instantiate.
    }

    public static void copy(String text) {
        Minecraft.getInstance().keyboardHandler.setClipboard(text);

        Pinpoint.LOGGER.debug(
                "Copied player coordinates to clipboard: {}",
                text
        );
    }
}