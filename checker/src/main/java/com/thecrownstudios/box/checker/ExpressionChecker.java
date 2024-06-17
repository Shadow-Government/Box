package com.thecrownstudios.box.checker;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.text.MessageFormat;

public interface ExpressionChecker {

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param expression			lorem ipsum dolor sit amet
     * @since						0.1
     */
    @Contract("false -> fail")
    static void checkArgument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param expression			lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    @Contract("false, _ -> fail")
    static void checkArgument(boolean expression, @NotNull String errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    /**
     * Lorem ipsum dolor sit amet, consectetur adipisci elit,
     * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
     *
     * @param expression			lorem ipsum dolor sit amet
     * @param errorMessage			lorem ipsum dolor sit amet
     * @since						0.1
     */
    @Contract("false, _, _ -> fail")
    static void checkArgument(boolean expression, @NotNull String errorMessage, Object... arguments) {
        if (!expression) {
            throw new IllegalArgumentException(MessageFormat.format(errorMessage, arguments));
        }
    }

}
