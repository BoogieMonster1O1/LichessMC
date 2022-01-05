package io.github.boogiemonster1o1.lichessmc.wrapper.json.account;

public record ProfileObject(
	String id,
	String username,
	boolean online,
	PerformanceObject perfs,
	int createdAt,
	boolean disabled,
	boolean tosViolation,
	PersonalProfileObject profile,
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
