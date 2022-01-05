package io.github.boogiemonster1o1.lichessmc.wrapper.json.account;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Title {
	GRANDMASTER("GM"),
	WOMAN_GRANDMASTER("WGM"),
	INTERNATIONAL_MASTER("IM"),
	WOMAN_INTERNATIONAL_MASTER("WIM"),
	FIDE_MASTER("FM"),
	WOMAN_FIDE_MASTER("WFM"),
	NATIONAL_MASTER("NM"),
	CANDIDATE_MASTER("CM"),
	WOMAN_CANDIDATE_MASTER("WCM"),
	WOMAN_NATIONAL_MASTER("WNM"),
	LICHESS_MASTER("LM"),
	BOT("BOT");

	private final String shortName;

	Title(String shortName) {
		this.shortName = shortName;
	}

	@JsonValue
	public String getShortName() {
		return shortName;
	}
}
