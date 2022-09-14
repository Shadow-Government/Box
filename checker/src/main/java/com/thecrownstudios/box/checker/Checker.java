package com.thecrownstudios.box.checker;

import org.jetbrains.annotations.NotNull;

public final class Checker {

    private Checker() {}

    public static <T> void checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
    }

    public static <T> void checkNotNull(T reference, @NotNull String errorMessage) {
        if (reference == null) {
            throw new NullPointerException(errorMessage);
        }
    }

    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean expression, @NotNull String errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public static <T> void checkNotNullEmpty(@NotNull T @NotNull[] reference) {
        if (reference == null) {
            throw new NullPointerException();
        }

        if (reference.length == 0) {
            throw new IllegalStateException();
        }
    }

    public static <T> void checkNotNullEmpty(@NotNull T @NotNull[] reference, @NotNull String errorMessage) {
        if (reference == null) {
            throw new NullPointerException();
        }

        if (reference.length == 0) {
            throw new IllegalStateException(errorMessage);
        }
    }

    public static <T> void checkNotEmpty(@NotNull T @NotNull[] reference) {
        if (reference.length == 0) {
            throw new IllegalStateException();
        }
    }

    public static <T> void checkNotEmpty(@NotNull T @NotNull[] reference, @NotNull String errorMessage) {
        if (reference.length == 0) {
            throw new IllegalStateException(errorMessage);
        }
    }

    public static <T> void checkBetween(int reference, int from, int to) {
        if (reference < from || reference > to) {
            throw new IllegalStateException();
        }
    }

    public static <T> void checkBetween(int reference, int from, int to, @NotNull String errorMessage) {
        if (reference < from || reference > to) {
            throw new IllegalStateException(errorMessage);
        }
    }

}