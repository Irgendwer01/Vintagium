package me.jellysquid.mods.sodium.client;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.jellysquid.mods.sodium.Tags;
import me.jellysquid.mods.sodium.client.gui.SodiumGameOptions;

@Mod(modid = Tags.MODID, useMetadata = true)
public class SodiumClientMod {

    private static SodiumGameOptions CONFIG;
    public static Logger LOGGER = LogManager.getLogger(Tags.MODNAME);

    public static SodiumGameOptions options() {
        if (CONFIG == null) {
            CONFIG = loadConfig();
        }

        return CONFIG;
    }

    public static Logger logger() {
        if (LOGGER == null) {
            LOGGER = LogManager.getLogger(Tags.MODNAME);
        }

        return LOGGER;
    }

    private static SodiumGameOptions loadConfig() {
        return SodiumGameOptions.load(
                Minecraft.getMinecraft().gameDir.toPath().resolve("config").resolve(Tags.MODID + "-options.json"));
    }

    public static String getVersion() {
        return Tags.VERSION;
    }

    public static boolean isDirectMemoryAccessEnabled() {
        return options().advanced.allowDirectMemoryAccess;
    }
}
