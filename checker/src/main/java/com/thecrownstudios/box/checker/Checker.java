package com.thecrownstudios.box.checker;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.text.MessageFormat;

public interface Checker extends ArrayChecker, CollectionChecker, ExpressionChecker, NumberChecker, StringChecker {

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param <T>					lorem ipsum dolor sit amet
     * @since						0.1
     */
    @Contract("null -> fail")
    static <T> void checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference             lorem ipsum dolor sit amet
     * @param errorMessage          lorem ipsum dolor sit amet
     * @param <T>                   lorem ipsum dolor sit amet
     * @since                       0.1
     */
    @Contract("null, _ -> fail")
    static <T> void checkNotNull(T reference, @NotNull String errorMessage) {
        if (reference == null) {
            throw new NullPointerException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference             lorem ipsum dolor sit amet
     * @param errorMessage          lorem ipsum dolor sit amet
     * @param <T>                   lorem ipsum dolor sit amet
     * @since                       0.1
     */
    @Contract("null, _, _ -> fail")
    static <T> void checkNotNull(T reference, @NotNull String errorMessage, Object... arguments) {
        if (reference == null) {
            throw new NullPointerException(MessageFormat.format(errorMessage, arguments));
        }
    }

}