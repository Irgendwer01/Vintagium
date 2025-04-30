package me.jellysquid.mods.sodium.client;

import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import com.google.common.collect.ImmutableList;

import me.jellysquid.mods.sodium.Tags;
import zone.rong.mixinbooter.IEarlyMixinLoader;

@IFMLLoadingPlugin.Name("Sodium")
@IFMLLoadingPlugin.MCVersion("1.12.2")
public class SodiumMixinTweaker implements IFMLLoadingPlugin, IEarlyMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return ImmutableList.of(Tags.MODID + ".mixins.json");
    }

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {}

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
