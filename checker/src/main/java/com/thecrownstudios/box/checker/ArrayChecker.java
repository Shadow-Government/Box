package com.thecrownstudios.box.checker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.text.MessageFormat;

public interface ArrayChecker {

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param <T>					lorem ipsum dolor sit amet
     * @since						0.1
     */
    static <T> void checkNotEmpty(@NotNull T @NotNull [] reference) {
        if (reference.length == 0) {
            throw new IllegalStateException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @param <T>					lorem ipsum dolor sit amet
     * @since						0.1
     */
    static <T> void checkNotEmpty(@NotNull T @NotNull [] reference, @NotNull String errorMessage) {
        if (reference.length == 0) {
            throw new IllegalStateException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @param <T>					lorem ipsum dolor sit amet
     * @since						0.1
     */
    static <T> void checkNotEmpty(@NotNull T @NotNull [] reference, @NotNull String errorMessage, Object... arguments) {
        if (reference.length == 0) {
            throw new IllegalStateException(MessageFormat.format(errorMessage, arguments));
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param <T>					lorem ipsum dolor sit amet
     * @since						0.1
     */
    static <T> void checkNotNullEmpty(@NotNull T @Nullable [] reference) {
        if (reference == null) {
            throw new NullPointerException();
        }

        if (reference.length == 0) {
            throw new IllegalStateException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @param <T>					lorem ipsum dolor sit amet
     * @since						0.1
     */
    static <T> void checkNotNullEmpty(@NotNull T @Nullable[] reference, @NotNull String errorMessage) {
        if (reference == null) {
            throw new NullPointerException(errorMessage);
        }

        if (reference.length == 0) {
            throw new IllegalStateException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @param <T>					lorem ipsum dolor sit amet
     * @since						0.1
     */
    static <T> void checkNotNullEmpty(@NotNull T @Nullable[] reference, @NotNull String errorMessage, Object... arguments) {
        if (reference == null) {
            throw new NullPointerException(MessageFormat.format(errorMessage, arguments));
        }

        if (reference.length == 0) {
            throw new IllegalStateException(MessageFormat.format(errorMessage, arguments));
        }
    }

}