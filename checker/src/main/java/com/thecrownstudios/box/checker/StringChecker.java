package com.thecrownstudios.box.checker;

import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.text.MessageFormat;

public interface StringChecker {

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @since						0.1
     */
    @Contract("_ -> fail")
    static void checkNotEmpty(@NonNull String reference) {
        if (reference.isEmpty()) {
            throw new NullPointerException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since 						0.1
     */
    static void checkNotEmpty(@NonNull String reference, @NonNull String errorMessage) {
        if (reference.isEmpty()) {
            throw new NullPointerException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since 						0.1
     */
    static void checkNotEmpty(@NonNull String reference, @NonNull String errorMessage, Object... arguments) {
        if (reference.isEmpty()) {
            throw new NullPointerException(MessageFormat.format(errorMessage, arguments));
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkNotNullEmpty(@Nullable String reference) {
        if (reference == null) {
            throw new NullPointerException();
        }

        if (reference.isEmpty()) {
            throw new IllegalStateException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkNotNullEmpty(@Nullable String reference, @NonNull String errorMessage) {
        if (reference == null) {
            throw new NullPointerException(errorMessage);
        }

        if (reference.isEmpty()) {
            throw new IllegalStateException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkNotNullEmpty(@Nullable String reference, @NonNull String errorMessage, Object... arguments) {
        if (reference == null) {
            throw new NullPointerException(MessageFormat.format(errorMessage, arguments));
        }

        if (reference.isEmpty()) {
            throw new IllegalStateException(MessageFormat.format(errorMessage, arguments));
        }
    }

}