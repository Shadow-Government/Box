package com.thecrownstudios.box.tickable.string;

import com.thecrownstudios.box.tickable.TickableObject;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import static com.thecrownstudios.box.checker.Checker.checkBetween;
import static com.thecrownstudios.box.checker.Checker.checkNotNullEmpty;

public class TickableString implements TickableObject<String> {

	private final String[] frames;
	private final int interval;

	private int index = 0;
	private int tick = 0;

	public TickableString(String[] frames, int interval) {
		this.frames = frames;
		this.interval = interval;
	}

	@Override
	@Contract(pure = true)
	public @NotNull TickableObject<String> withFrames(final @NotNull String @NotNull... frames) {
		checkNotNullEmpty(frames, "frames cannot be null or empty");

		return new TickableString(frames.clone(), this.interval);
	}

	@Override
	@Contract(pure = true)
	public @NotNull TickableObject<String> withInterval(final @Range(from = 1, to = 120) int interval) {
		checkBetween(interval, 1, 120, "interval must be between 1 and 120");

		return new TickableString(this.frames.clone(), interval);
	}

	@Override
	public @NotNull String prev() {
		return "work in progress";
	}

	@Override
	public @NotNull String curr() {
		return this.frames[index == -1 ? 0 : index];
	}

	@Override
	public @NotNull String next() {
		tick += tick == interval ? (-tick + 1) : 1;

		return this.frames[tick != interval
				? index
				: (index = ++index == this.frames.length ? 0 : index)];
	}

	@Override
	public int interval() {
		return this.interval;
	}

	@Override
	public String[] frames() {
		return this.frames;
	}

}