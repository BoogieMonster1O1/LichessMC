package io.github.boogiemonster1o1.lichessmc.wrapper.json.user;

import io.github.boogiemonster1o1.lichessmc.wrapper.json.value.Title;

public record PublicDataObject(
	String id,
	String username,
	boolean online,
	PerformanceObject perfs,
	int createdAt,
	boolean disabled,
	boolean tosViolation,
	ProfileObject profile,
	int seenAt,
	boolean patron,
	boolean verified,
	PlaytimeObject playTime,
	Title title,
	String url,
	String playing,
	int completionRate,
	CountObject count,
	boolean streaming,
	boolean followable,
	boolean following,
	boolean blocking,
	boolean followsYou
){}
