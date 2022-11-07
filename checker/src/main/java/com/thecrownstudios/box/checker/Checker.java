package com.thecrownstudios.box.checker;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public final class Checker {

	private Checker() {}

	/**
	 * Lorem ipsum dolor sit amet, consectetur adipisci elit,
	 * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
	 *
	 * @param reference				lorem ipsum dolor sit amet
	 * @param <T>					lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	public static <T> void checkNotNull(T reference) {
		if (reference == null) {
			throw new NullPointerException();
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
	public static <T> void checkNotNull(T reference, @NotNull String errorMessage) {
		if (reference == null) {
			throw new NullPointerException(errorMessage);
		}
	}

	/**
	 * Lorem ipsum dolor sit amet, consectetur adipisci elit,
	 * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
	 *
	 * @param expression			lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	public static void checkArgument(boolean expression) {
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
	public static void checkArgument(boolean expression, @NotNull String errorMessage) {
		if (!expression) {
			throw new IllegalArgumentException(errorMessage);
		}
	}

	/**
	 * Lorem ipsum dolor sit amet, consectetur adipisci elit,
	 * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
	 *
	 * @param reference				lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	public static void checkNotEmpty(String reference) {
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
	public static void checkNotEmpty(String reference, @NotNull String errorMessage) {
		if (reference.isEmpty()) {
			throw new NullPointerException(errorMessage);
		}
	}

	/**
	 * Lorem ipsum dolor sit amet, consectetur adipisci elit,
	 * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
	 *
	 * @param reference				lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	public static void checkNotNullEmpty(@NotNull String reference) {
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
	public static void checkNotNullEmpty(@NotNull String reference, @NotNull String errorMessage) {
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
	 * @param <T>					lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	public static <T> void checkNotNullEmpty(@NotNull T @NotNull[] reference) {
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
	public static <T> void checkNotNullEmpty(@NotNull T @NotNull[] reference, @NotNull String errorMessage) {
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
	 * @param <T>					lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	public static <T> void checkNotEmpty(@NotNull T @NotNull[] reference) {
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
	public static <T> void checkNotEmpty(@NotNull T @NotNull[] reference, @NotNull String errorMessage) {
		if (reference.length == 0) {
			throw new IllegalStateException(errorMessage);
		}
	}

	/**
	 * Lorem ipsum dolor sit amet, consectetur adipisci elit,
	 * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
	 *
	 * @param reference				lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	public static void checkNotNullEmpty(@NotNull Collection<?> reference) {
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
	public static void checkNotNullEmpty(@NotNull Collection<?> reference, @NotNull String errorMessage) {
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
	 * @since						0.1
	 */
	public static void checkNotEmpty(@NotNull Collection<?> reference) {
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
	public static void checkNotEmpty(@NotNull Collection<?> reference, @NotNull String errorMessage) {
		if (reference.isEmpty()) {
			throw new IllegalStateException(errorMessage);
		}
	}

	/**
	 * Lorem ipsum dolor sit amet, consectetur adipisci elit,
	 * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
	 *
	 * @param reference				lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	public static void checkNotNullEmpty(@NotNull List<?> reference) {
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
	public static void checkNotNullEmpty(@NotNull List<?> reference, @NotNull String errorMessage) {
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
	 * @since						0.1
	 */
	public static void checkNotEmpty(@NotNull List<?> reference) {
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
	public static void checkNotEmpty(@NotNull List<?> reference, @NotNull String errorMessage) {
		if (reference.isEmpty()) {
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
	 * @since						0.1
	 */
	public static void checkBetween(int reference, int from, int to) {
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
	public static void checkBetween(int reference, int from, int to, @NotNull String errorMessage) {
		if (reference < from || reference > to) {
			throw new IllegalStateException(errorMessage);
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
	public static void checkBiggerThan(int reference, int minimum) {
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
	public static void checkBiggerThan(int reference, int minimum, @NotNull String errorMessage) {
		if (reference < minimum) {
			throw new IllegalStateException(errorMessage);
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
	public static void checkSmallerThan(int reference, int maximum) {
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
	public static void checkSmallerThan(int reference, int maximum, @NotNull String errorMessage) {
		if (reference > maximum) {
			throw new IllegalStateException(errorMessage);
		}
	}

}