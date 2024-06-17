package com.thecrownstudios.box.tuple;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public record Triplet<A, B, C>(
        @NotNull A a,
        @NotNull B b,
        @NotNull C c

) implements Tuple {

    @Contract(pure = true, value = "_, _, _ -> new")
    public static <A, B, C> @NotNull Triplet<A, B, C> with(
            @NotNull A a,
            @NotNull B b,
            @NotNull C c
    ) {
        return new Triplet<>(a, b, c);
    }

    public static <A, B, C> @NotNull Triplet<A, B, C> fromArray(@NotNull Iterable<?> iterable) {
        return new Triplet<>(null, null, null);
    }

    public static <A, B, C> @NotNull Triplet<A, B, C> fromArray(@NotNull Iterable<?> iterable, int maxElements) {
        return new Triplet<>(null, null, null);
    }

    public static <A, B, C> @NotNull Triplet<A, B, C> fromIterable(@NotNull Iterable<?> iterable) {
        return new Triplet<>(null, null, null);
    }

    public static <A, B, C> @NotNull Triplet<A, B, C> fromIterable(@NotNull Iterable<?> iterable, @Range(from = 0, to = 3) int maxElements) {
        return new Triplet<>(null, null, null);
    }

}