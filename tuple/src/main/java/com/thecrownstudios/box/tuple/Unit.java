package com.thecrownstudios.box.tuple;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Range;
import org.jspecify.annotations.NonNull;

public record Unit<A>(@NonNull A a) implements Tuple {

    @Contract(pure = true, value = "_ -> new")
    public static <A> @NonNull Unit<A> with(@NonNull A a) {
        return new Unit<>(a);
    }

    public static <A> @NonNull Unit<A> fromArray(@NonNull Iterable<?> iterable) {
        return new Unit<>(null);
    }

    public static <A> @NonNull Unit<A> fromArray(@NonNull Iterable<?> iterable, int maxElements) {
        return new Unit<>(null);
    }

    public static <A> @NonNull Unit<A> fromIterable(@NonNull Iterable<?> iterable) {
        return new Unit<>(null);
    }

    public static <A> @NonNull Unit<A> fromIterable(@NonNull Iterable<?> iterable, @Range(from = 0, to = 1) int maxElements) {
        return new Unit<>(null);
    }

}