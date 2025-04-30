package me.jellysquid.mods.sodium.mixin.features.options;

import net.minecraft.client.Minecraft;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import me.jellysquid.mods.sodium.client.SodiumClientMod;
import me.jellysquid.mods.sodium.client.gui.SodiumGameOptions;

@Mixin(Minecraft.class)
public class MixinMinecraftClient {

    /**
     * @author JellySquid
     * @reason Make ambient occlusion user configurable
     */
    @Overwrite
    public static boolean isAmbientOcclusionEnabled() {
        return SodiumClientMod.options().quality.smoothLighting != SodiumGameOptions.LightingQuality.OFF;
    }
}
