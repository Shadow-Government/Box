package com.thecrownstudios.box.tickable;

import com.thecrownstudios.box.checker.StringChecker;
import com.thecrownstudios.box.tickable.component.StaticTickableComponent;
import com.thecrownstudios.box.tickable.component.TickableComponent;
import com.thecrownstudios.box.tickable.string.StaticTickableString;
import com.thecrownstudios.box.tickable.string.TickableString;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import static com.thecrownstudios.box.checker.ArrayChecker.checkNotNullEmpty;
import static com.thecrownstudios.box.checker.Checker.checkNotNull;
import static com.thecrownstudios.box.checker.NumberChecker.checkBetween;

public interface TickableObject<E> extends Cloneable {

    @Contract(value = "_, _ -> new", pure = true)
    static @NotNull TickableObject<String> String(
            final @Range(from = 1, to = 128) int interval,
            final @NotNull String @NotNull... frames
    ) {
        checkBetween(interval, 1, 128, "interval must be between 1 and 128");
        checkNotNullEmpty(frames, "frames cannot be null or empty");

        return new TickableString(frames, interval);
    }

    @Contract(value = "_ -> new", pure = true)
    static @NotNull TickableObject<String> String(final @NotNull String frame)
    {
        StringChecker.checkNotNullEmpty(frame, "frame cannot be null or empty");

        return new StaticTickableString(frame);
    }

    @Contract(value = "-> new", pure = true)
    static @NotNull TickableObject<String> String()
    {
        return new StaticTickableString();
    }

    @Contract(value = "_, _ -> new", pure = true)
    static @NotNull TickableObject<Component> Component(
            final @Range(from = 1, to = 128) int interval,
            final @NotNull Component @NotNull[] frames
    ) {
        checkBetween(interval, 1, 128, "interval must be between 1 and 128");
        checkNotNullEmpty(frames, "frames cannot be null or empty");

        return new TickableComponent(frames, interval);
    }

    @Contract(value = "_ -> new", pure = true)
    static @NotNull TickableObject<Component> Component(final @NotNull Component frame)
    {
        checkNotNull(frame, "frame cannot be null or empty");

        return new StaticTickableComponent(frame);
    }

    @Contract(value = "-> new", pure = true)
    static @NotNull TickableObject<Component> Component()
    {
        return new StaticTickableComponent();
    }

    @Contract(value = "_ -> new", pure = true)
    @NotNull TickableObject<E> withFrames(final @NotNull E @NotNull... frames);

    @Contract(value = "_ -> new", pure = true)
    @NotNull TickableObject<E> withInterval(final @Range(from = 1, to = 128) int interval);

    @NotNull E prev();

    @NotNull E curr();

    @NotNull E next();

    int interval();

    @NotNull E[] frames();

}