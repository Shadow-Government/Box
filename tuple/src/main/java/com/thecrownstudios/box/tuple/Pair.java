package com.thecrownstudios.box.tuple;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Range;
import org.jspecify.annotations.NonNull;

public record Pair<A, B>(
        @NonNull A a,
        @NonNull B b

) implements Tuple {

    @Contract(pure = true, value = "_, _ -> new")
    public static <A, B> @NonNull Pair<A, B> with(
            @NonNull A a,
            @NonNull B b
    ) {
        return new Pair<>(a, b);
    }

    public static <A, B> @NonNull Pair<A, B> fromArray(@NonNull Iterable<?> iterable) {
        return new Pair<>(null, null);
    }

    public static <A, B> @NonNull Pair<A, B> fromArray(@NonNull Iterable<?> iterable, int maxElements) {
        return new Pair<>(null, null);
    }

    public static <A, B> @NonNull Pair<A, B> fromIterable(@NonNull Iterable<?> iterable) {
        return new Pair<>(null, null);
    }

    public static <A, B> @NonNull Pair<A, B> fromIterable(@NonNull Iterable<?> iterable, @Range(from = 0, to = 2) int maxElements) {
        return new Pair<>(null, null);
    }

}