package io.github.boogiemonster1o1.lichessmc.wrapper.json.user;

public record PerformanceObject(
	RatingsObject chess960,
	RatingsObject atomic,
	RatingsObject racingKings,
	RatingsObject ultraBullet,
	RatingsObject blitz,
	RatingsObject kingOfTheHill,
	RatingsObject bullet,
	RatingsObject correspondence,
	RatingsObject horde,
	RatingsObject puzzle,
	RatingsObject classical,
	RatingsObject rapid,
	StormRatingsObject storm
) {}
