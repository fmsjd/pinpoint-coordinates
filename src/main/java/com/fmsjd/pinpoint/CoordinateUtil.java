package com.fmsjd.pinpoint;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

import java.util.Locale;

public final class CoordinateUtil {

    private CoordinateUtil() {
        // Utility class; do not instantiate.
    }

    public static String getPlayerCoordinates(Player player) {

        Vec3 exactPosition = player.position();

        String exactPositionLog = String.format(
                Locale.ROOT,
                "X=%.6f, Y=%.6f, Z=%.6f",
                exactPosition.x,
                exactPosition.y,
                exactPosition.z
        );

        Pinpoint.LOGGER.debug(
                "Retrieved exact player position: {}.",
                exactPositionLog
        );

        BlockPos blockPosition = player.blockPosition();

        Pinpoint.LOGGER.debug(
                "Converted player position to block coordinates: X={}, Y={}, Z={}.",
                blockPosition.getX(),
                blockPosition.getY(),
                blockPosition.getZ()
        );

        String coordinates = blockPosition.getX()
                + " "
                + blockPosition.getY()
                + " "
                + blockPosition.getZ();

        Pinpoint.LOGGER.debug(
                "Formatted coordinates for clipboard: \"{}\".",
                coordinates
        );

        return coordinates;
    }
}