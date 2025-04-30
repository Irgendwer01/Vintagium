package me.jellysquid.mods.sodium.mixin.core;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraftforge.fluids.IFluidBlock;

import org.spongepowered.asm.mixin.Mixin;

import me.jellysquid.mods.sodium.client.world.VanillaFluidBlock;

@Mixin(BlockLiquid.class)
public abstract class MixinBlockLiquid implements VanillaFluidBlock {

    private final IFluidBlock sodium$fluidBlock = new VanillaFluidBlock.Implementation((Block) (Object) this);

    @Override
    public IFluidBlock getFakeFluidBlock() {
        return sodium$fluidBlock;
    }
}
