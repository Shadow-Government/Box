package com.thecrownstudios.box.tuple;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public record Unit<A>(@NotNull A a) implements Tuple {

    @Contract(pure = true, value = "_ -> new")
    public static <A> @NotNull Unit<A> with(@NotNull A a) {
        return new Unit<>(a);
    }

    public static <A> @NotNull Unit<A> fromArray(@NotNull Iterable<?> iterable) {
        return new Unit<>(null);
    }

    public static <A> @NotNull Unit<A> fromArray(@NotNull Iterable<?> iterable, int maxElements) {
        return new Unit<>(null);
    }

    public static <A> @NotNull Unit<A> fromIterable(@NotNull Iterable<?> iterable) {
        return new Unit<>(null);
    }

    public static <A> @NotNull Unit<A> fromIterable(@NotNull Iterable<?> iterable, @Range(from = 0, to = 1) int maxElements) {
        return new Unit<>(null);
    }

}