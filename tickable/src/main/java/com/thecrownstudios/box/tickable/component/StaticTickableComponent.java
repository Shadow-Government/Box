package com.thecrownstudios.box.tickable.component;

import com.thecrownstudios.box.tickable.TickableObject;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import static com.thecrownstudios.box.checker.ArrayChecker.checkNotNullEmpty;
import static net.kyori.adventure.text.Component.text;

public record StaticTickableComponent(Component frame) implements TickableObject<Component> {

    public StaticTickableComponent() {
        this(text(""));
    }

    @Override
    @Contract(value = "_ -> new", pure = true)
    public @NotNull TickableObject<Component> withFrames(@NotNull Component @NotNull ... frames) {
        checkNotNullEmpty(frames, "frames cannot be null or empty");

        return new TickableComponent(frames, 1);
    }

    @Override
    @Contract(value = "_ -> fail", pure = true)
    public @NotNull TickableObject<Component> withInterval(@Range(from = 1, to = 128) int interval) {
        throw new UnsupportedOperationException("This operation is pointless with the StaticTickableComponent implementation");
    }

    @Override
    public @NotNull Component prev() {
        return this.frame;
    }

    @Override
    public @NotNull Component curr() {
        return this.frame;
    }

    @Override
    public @NotNull Component next() {
        return this.frame;
    }

    @Override
    public int interval() {
        return 0;
    }

    @Override
    public @NotNull Component[] frames() {
        return new Component[] { frame };
    }

}