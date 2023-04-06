package com.thecrownstudios.box.tickable.string;

import com.thecrownstudios.box.tickable.TickableObject;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import static com.thecrownstudios.box.checker.Checker.checkNotNullEmpty;

public record StaticTickableString(String frame) implements TickableObject<String> {

    public StaticTickableString() {
        this("");
    }

    @Override
    @Contract(value = "_ -> new", pure = true)
    public @NotNull TickableObject<String> withFrames(@NotNull String @NotNull ... frames) {
        checkNotNullEmpty(frames, "frames cannot be null or empty");

        return new TickableString(frames.clone(), 1);
    }

    @Override
    @Contract(value = "_ -> fail", pure = true)
    public @NotNull TickableObject<String> withInterval(@Range(from = 1, to = 128) int interval) {
        throw new UnsupportedOperationException("This operation is pointless with the StaticTickableString implementation");
    }

    @Override
    public @NotNull String prev() {
        return this.frame;
    }

    @Override
    public @NotNull String curr() {
        return this.frame;
    }

    @Override
    public @NotNull String next() {
        return this.frame;
    }

    @Override
    public int interval() {
        return 0;
    }

    @Override
    public @NotNull String[] frames() {
        return new String[] { frame };
    }

}