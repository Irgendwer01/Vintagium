package me.jellysquid.mods.sodium.client.gui.options;

import java.util.Collection;

import net.minecraft.util.text.ITextComponent;

import me.jellysquid.mods.sodium.client.gui.options.control.Control;
import me.jellysquid.mods.sodium.client.gui.options.storage.OptionStorage;

public interface Option<T> {

    ITextComponent getNewName();

    String getName();

    ITextComponent getTooltip();

    OptionImpact getImpact();

    Control<T> getControl();

    T getValue();

    void setValue(T value);

    void reset();

    OptionStorage<?> getStorage();

    boolean isAvailable();

    boolean hasChanged();

    void applyChanges();

    Collection<OptionFlag> getFlags();
}
