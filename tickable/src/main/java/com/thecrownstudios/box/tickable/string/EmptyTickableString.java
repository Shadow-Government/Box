package com.thecrownstudios.box.tickable.string;

import com.thecrownstudios.box.tickable.TickableObject;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public record EmptyTickableString(String frame) implements TickableObject<String> {

	public EmptyTickableString() {
		this("");
	}

	@Override
	@Contract(pure = true)
	public @NotNull TickableObject<String> withFrames(final @NotNull String @NotNull [] frames) {
		throw new UnsupportedOperationException("The empty implementation does not support this method");
	}

	@Override
	@Contract(pure = true)
	public @NotNull TickableObject<String> withInterval(final @Range(from = 1, to = 120) int interval) {
		throw new UnsupportedOperationException("The empty implementation does not support this method");
	}

	@Override
	public @NotNull String prev() {
		return this.frame;
	}

	@Override
	public @NotNull String curr() {
		return this.frame;
	}

	@Override
	public @NotNull String next() {
		return this.frame;
	}

	@Override
	public int interval() {
		return 0;
	}

	@Override
	public String[] frames() {
		return new String[0];
	}

}