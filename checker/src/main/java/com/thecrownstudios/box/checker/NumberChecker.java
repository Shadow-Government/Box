package com.thecrownstudios.box.checker;

import org.jspecify.annotations.NonNull;

import java.text.MessageFormat;

public interface NumberChecker {

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param from					lorem ipsum dolor sit amet
     * @param to					lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkBetween(int reference, int from, int to) {
        if (reference < from || reference > to) {
            throw new IllegalStateException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param from					lorem ipsum dolor sit amet
     * @param to					lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkBetween(int reference, int from, int to, @NonNull String errorMessage) {
        if (reference < from || reference > to) {
            throw new IllegalStateException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param from					lorem ipsum dolor sit amet
     * @param to					lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkBetween(int reference, int from, int to, @NonNull String errorMessage, Object... arguments) {
        if (reference < from || reference > to) {
            throw new IllegalStateException(MessageFormat.format(errorMessage, arguments));
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param minimum				lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkBiggerThan(int reference, int minimum) {
        if (reference < minimum) {
            throw new IllegalStateException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param minimum				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkBiggerThan(int reference, int minimum, @NonNull String errorMessage) {
        if (reference < minimum) {
            throw new IllegalStateException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param minimum				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkBiggerThan(int reference, int minimum, @NonNull String errorMessage, Object... arguments) {
        if (reference < minimum) {
            throw new IllegalStateException(MessageFormat.format(errorMessage, arguments));
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param maximum				lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkSmallerThan(int reference, int maximum) {
        if (reference > maximum) {
            throw new IllegalStateException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param maximum				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkSmallerThan(int reference, int maximum, @NonNull String errorMessage) {
        if (reference > maximum) {
            throw new IllegalStateException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param reference				lorem ipsum dolor sit amet
     * @param maximum				lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    static void checkSmallerThan(int reference, int maximum, @NonNull String errorMessage, Object... arguments) {
        if (reference > maximum) {
            throw new IllegalStateException(MessageFormat.format(errorMessage, arguments));
        }
    }

}