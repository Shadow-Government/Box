package com.thecrownstudios.box.tickable;

import com.thecrownstudios.box.checker.Checker;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import static com.thecrownstudios.box.checker.Checker.checkBetween;
import static com.thecrownstudios.box.checker.Checker.checkNotNullEmpty;

public interface Tickable<E> {

    @Contract(pure = true)
    static @NotNull Tickable<String> String(final @NotNull String @NotNull[] frames,
                                            final @Range(from = 1, to = 120) int interval)
    {
        checkNotNullEmpty(frames, "frames cannot be null or empty");
        checkBetween(interval, 1, 120, "interval must be between 1 and 120");

        return new TickableString(frames, interval);
    }

    @Contract(pure = true)
    static @NotNull Tickable<Component> Component(final @NotNull Component @NotNull[] frames,
                                                  final @Range(from = 1, to = 120) int interval)
    {
        checkNotNullEmpty(frames, "frames cannot be null or empty");
        checkBetween(interval, 1, 120, "interval must be between 1 and 120");

        return new TickableComponent(frames, interval);
    }

    @Contract(pure = true)
    @NotNull Tickable<E> withFrames(final @NotNull E @NotNull[] frames);

    @Contract(pure = true)
    @NotNull Tickable<E> withInterval(final @Range(from = 1, to = 120) int interval);

    @NotNull E prev();

    @NotNull E curr();

    @NotNull E next();

    int interval();

}