package com.thecrownstudios.box.tickable.component;

import com.thecrownstudios.box.tickable.TickableObject;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import static com.thecrownstudios.box.checker.Checker.checkBetween;
import static com.thecrownstudios.box.checker.Checker.checkNotNullEmpty;
import static net.kyori.adventure.text.Component.text;

public class TickableComponent implements TickableObject<Component> {

    private final Component[] frames;
    private final int interval;

    private int index = 0;
    private int tick = 0;

    public TickableComponent(Component[] frames, int interval) {
        this.frames = frames;
        this.interval = interval;
    }

    @Override
    @Contract(pure = true)
    public @NotNull TickableObject<Component> withFrames(final @NotNull Component @NotNull... frames) {
        checkNotNullEmpty(frames, "frames cannot be null or empty");

        return new TickableComponent(frames.clone(), this.interval);
    }

    @Override
    @Contract(pure = true)
    public @NotNull TickableObject<Component> withInterval(final @Range(from = 1, to = 120) int interval) {
        checkBetween(interval, 1, 120, "interval must be between 1 and 120");

        return new TickableComponent(this.frames.clone(), interval);
    }

    @Override
    public @NotNull Component prev() {
        return text("work in progress");
    }

    @Override
    public @NotNull Component curr() {
        return this.frames[index == -1 ? 0 : index];
    }

    @Override
    public @NotNull Component next() {
        tick += tick == interval ? (-tick + 1) : 1;

        return this.frames[tick != interval
                ? index
                : (index = ++index == this.frames.length ? 0 : index)];
    }

    @Override
    public int interval() {
        return this.interval;
    }

    @Override
    public Component[] frames() {
        return this.frames;
    }

}