package me.jellysquid.mods.sodium.mixin.features.render_layer.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import me.jellysquid.mods.sodium.client.SodiumClientMod;

@Mixin(BlockLeaves.class)
public class MixinLeavesBlock extends Block {

    public MixinLeavesBlock(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
    }

    @ModifyVariable(method = "setGraphicsLevel", at = @At("HEAD"), argsOnly = true, index = 1)
    private boolean getSodiumLeavesQuality(boolean fancy) {
        return SodiumClientMod.options().quality.leavesQuality.isFancy(fancy);
    }
}
