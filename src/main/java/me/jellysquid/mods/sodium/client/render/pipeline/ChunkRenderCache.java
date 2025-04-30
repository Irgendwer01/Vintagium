package me.jellysquid.mods.sodium.client.render.pipeline;

import net.minecraft.client.Minecraft;

import me.jellysquid.mods.sodium.client.model.quad.blender.BiomeColorBlender;

public class ChunkRenderCache {

    protected BiomeColorBlender createBiomeColorBlender() {
        return BiomeColorBlender.create(Minecraft.getMinecraft());
    }
}
