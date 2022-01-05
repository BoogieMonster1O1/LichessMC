package io.github.boogiemonster1o1.lichessmc.wrapper.json.account;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Theme3d {
	BLACK_WHITE_ALUMINUM("Black-White-Aluminium"),
	BRUSHED_ALUMINUM("Brushed-Aluminium"),
	CHINA_BLUE("China-Blue"),
	CHINA_GREEN("China-Green"),
	CHINA_GREY("China-Grey"),
	CHINA_SCARLET("China-Scarlet"),
	CLASSIC_BLUE("Classic-Blue"),
	GOLD_SILVER("Gold-Silver"),
	LIGHT_WOOD("Light-Wood"),
	POWER_COATED("Power-Coated"),
	ROSEWOOD("Rosewood"),
	MARBLE("Marble"),
	WAX("Wax"),
	JADE("Jade"),
	WOODI("woodi");

	private final String shortName;

	Theme3d(String shortName) {
		this.shortName = shortName;
	}

	@JsonValue
	public String getShortName() {
		return shortName;
	}
}
