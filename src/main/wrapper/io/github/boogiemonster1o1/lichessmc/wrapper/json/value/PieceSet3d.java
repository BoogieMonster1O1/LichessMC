package io.github.boogiemonster1o1.lichessmc.wrapper.json.value;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PieceSet3d {
	BASIC("Basic"),
	WOOD("Wood"),
	METAL("Metal"),
	REDVBLUE("RedVBlue"),
	MODERN_JADE("ModernJade"),
	MODERN_WOOD("ModernWood"),
	GLASS("Glass"),
	TRIMMED("Trimmed"),
	EXPERIMENTAL("Experimental"),
	STAUNTON("Staunton"),
	CUBES_AND_PI("CubesAndPi");

	private final String shortName;

	PieceSet3d(String shortName) {
		this.shortName = shortName;
	}

	@JsonValue
	public String getShortName() {
		return shortName;
	}
}
