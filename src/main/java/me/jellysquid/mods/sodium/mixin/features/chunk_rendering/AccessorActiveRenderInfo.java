package me.jellysquid.mods.sodium.mixin.features.chunk_rendering;

import java.nio.FloatBuffer;

import net.minecraft.client.renderer.ActiveRenderInfo;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ActiveRenderInfo.class)
public interface AccessorActiveRenderInfo {

    @Accessor("PROJECTION")
    static FloatBuffer getProjectionMatrix() {
        throw new AssertionError();
    }

    @Accessor("MODELVIEW")
    static FloatBuffer getModelViewMatrix() {
        throw new AssertionError();
    }
}
