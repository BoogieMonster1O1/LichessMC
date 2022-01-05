package io.github.boogiemonster1o1.lichessmc.wrapper.json.value;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Theme {
	BLUE("blue"),
	BLUE2("blue2"),
	BLUE3("blue3"),
	BLUE_MARBLE("blue_marble"),
	CANVAS("canvas"),
	WOOD("wood"),
	WOOD2("wood2"),
	WOOD3("wood3"),
	WOOD4("wood4"),
	MAPLE("maple"),
	MAPLE2("maple2"),
	BROWN("brown"),
	LEATHER("leather"),
	GREEN("green"),
	MARBLE("marble"),
	GREEN_PLASTIC("green-plastic"),
	GREY("grey"),
	METAL("metal"),
	OLIVE("olive"),
	NEWSPAPER("newspaper"),
	PURPLE("purple"),
	PURPLE_DIAG("purple-diag"),
	PINK("pink"),
	IC("ic");

	private final String shortName;

	Theme(String shortName) {
		this.shortName = shortName;
	}

	@JsonValue
	public String getShortName() {
		return shortName;
	}
}
