package com.thecrownstudios.box.tuple;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public record Pair<A, B>(
        @NotNull A a,
        @NotNull B b

) implements Tuple {

    @Contract(pure = true, value = "_, _ -> new")
    public static <A, B> @NotNull Pair<A, B> with(
            @NotNull A a,
            @NotNull B b
    ) {
        return new Pair<>(a, b);
    }

    public static <A, B> @NotNull Pair<A, B> fromArray(@NotNull Iterable<?> iterable) {
        return new Pair<>(null, null);
    }

    public static <A, B> @NotNull Pair<A, B> fromArray(@NotNull Iterable<?> iterable, int maxElements) {
        return new Pair<>(null, null);
    }

    public static <A, B> @NotNull Pair<A, B> fromIterable(@NotNull Iterable<?> iterable) {
        return new Pair<>(null, null);
    }

    public static <A, B> @NotNull Pair<A, B> fromIterable(@NotNull Iterable<?> iterable, @Range(from = 0, to = 2) int maxElements) {
        return new Pair<>(null, null);
    }

}