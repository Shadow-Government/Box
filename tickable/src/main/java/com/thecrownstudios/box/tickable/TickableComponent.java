package com.thecrownstudios.box.tickable;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import static net.kyori.adventure.text.Component.text;

public class TickableComponent implements Tickable<Component> {

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
    public @NotNull Tickable<Component> withFrames(final @NotNull Component @NotNull[] frames) {
        return new TickableComponent(frames.clone(), this.interval);
    }

    @Override
    @Contract(pure = true)
    public @NotNull Tickable<Component> withInterval(final @Range(from = 1, to = 120) int interval) {
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

}