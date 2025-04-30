// TODO
/*
 * package me.jellysquid.mods.sodium.mixin.features.fast_biome_colors;
 * 
 * 
 * @Mixin(BackgroundRenderer.class)
 * public class MixinBackgroundRenderer {
 * 
 * @Redirect(method = "render", at = @At(value = "INVOKE", target =
 * "Lnet/minecraft/util/CubicSampler;sampleColor(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/CubicSampler$RgbFetcher;)Lnet/minecraft/util/math/Vec3d;"
 * ))
 * private static Vec3d redirectSampleColor(Vec3d pos, CubicSampler.RgbFetcher rgbFetcher, Camera camera, float
 * tickDelta, ClientWorld world, int i, float f) {
 * float u = MathHelper.clamp(MathHelper.cos(world.getSkyAngle(tickDelta) * 6.2831855F) * 2.0F + 0.5F, 0.0F, 1.0F);
 * 
 * return FastCubicSampler.sampleColor(pos,
 * (x, y, z) -> world.getBiomeAccess().getBiomeForNoiseGen(x, y, z).getFogColor(),
 * (v) -> world.getSkyProperties().adjustFogColor(v, u));
 * }
 * }
 */
