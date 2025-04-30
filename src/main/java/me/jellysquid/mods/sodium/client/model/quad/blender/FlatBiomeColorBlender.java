package me.jellysquid.mods.sodium.client.model.quad.blender;

import java.util.Arrays;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import me.jellysquid.mods.sodium.client.model.quad.ModelQuadView;
import me.jellysquid.mods.sodium.client.util.color.ColorARGB;

/**
 * A simple colorizer which performs no blending between adjacent blocks.
 */
public class FlatBiomeColorBlender implements BiomeColorBlender {

    private final int[] cachedRet = new int[4];

    @Override
    public int[] getColors(IBlockColor colorizer, IBlockAccess world, IBlockState state, BlockPos origin,
                           ModelQuadView quad) {
        Arrays.fill(this.cachedRet,
                ColorARGB.toABGR(colorizer.colorMultiplier(state, world, origin, quad.getColorIndex())));

        return this.cachedRet;
    }
}
