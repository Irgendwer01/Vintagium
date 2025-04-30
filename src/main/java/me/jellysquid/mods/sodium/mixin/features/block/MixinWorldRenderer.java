package me.jellysquid.mods.sodium.mixin.features.block;

import net.minecraft.client.renderer.EntityRenderer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import me.jellysquid.mods.sodium.client.render.pipeline.context.ChunkRenderCacheShared;

@Mixin(EntityRenderer.class)
public class MixinWorldRenderer {

    /**
     * Reset any global cached state before rendering a frame. This will hopefully ensure that any world state that has
     * changed is reflected in vanilla-style rendering.
     */
    @Inject(method = "renderWorld", at = @At("HEAD"))
    private void reset(float partialTicks, long finishTimeNano, CallbackInfo ci) {
        ChunkRenderCacheShared.resetCaches();
    }
}
