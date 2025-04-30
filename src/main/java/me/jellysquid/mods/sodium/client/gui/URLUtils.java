package me.jellysquid.mods.sodium.client.gui;

import java.io.IOException;

import net.minecraft.util.Util;

import me.jellysquid.mods.sodium.client.SodiumClientMod;

public class URLUtils {

    private static String[] getURLOpenCommand(String url) {
        switch (Util.getOSType()) {
            case WINDOWS:
                return new String[] { "rundll32", "url.dll,FileProtocolHandler", url };
            case OSX:
                return new String[] { "open", url };
            case UNKNOWN:
            case LINUX:
            case SOLARIS:
                return new String[] { "xdg-open", url };
            default:
                throw new IllegalArgumentException("Unexpected OS Type");
        }
    }

    public static void open(String url) {
        try {
            Runtime.getRuntime().exec(getURLOpenCommand(url));
        } catch (IOException exception) {
            SodiumClientMod.logger().error("Couldn't open url '{}'", url, exception);
        }
    }
}
