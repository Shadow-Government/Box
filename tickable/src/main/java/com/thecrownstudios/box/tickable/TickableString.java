package com.thecrownstudios.box.tickable;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public class TickableString implements Tickable<String> {

    private final String[] frames;
    private final int interval;

    private int index = 0;
    private int tick = 0;

    public TickableString(String[] frames, int interval) {
        this.frames = frames;
        this.interval = interval;
    }

    @Override
    @Contract(pure = true)
    public @NotNull Tickable<String> withFrames(final @NotNull String @NotNull[] frames) {
        return new TickableString(frames.clone(), this.interval);
    }

    @Override
    @Contract(pure = true)
    public @NotNull Tickable<String> withInterval(final @Range(from = 1, to = 120) int interval) {
        return new TickableString(this.frames.clone(), interval);
    }

    @Override
    public @NotNull String prev() {
        return "work in progress";
    }

    @Override
    public @NotNull String curr() {
        return this.frames[index == -1 ? 0 : index];
    }

    @Override
    public @NotNull String next() {
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