package io.github.boogiemonster1o1.lichessmc.wrapper.json.account;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PieceSet {
	CBURNETT("cburnett"),
	MERIDA("merida"),
	ALPHA("alpha"),
	PIROUETTI("pirouetti"),
	CHESSNUT("chessnut"),
	CHESS7("chess7"),
	REILLYCRAIG("reillycraig"),
	COMPANION("companion"),
	RIOHACHA("riohacha"),
	KOSAL("kosal"),
	LEIPZIG("leipzig"),
	FANTASY("fantasy"),
	SPATIAL("spatial"),
	CALIFORNIA("california"),
	PIXEL("pixel"),
	MAESTRO("maestro"),
	FRESCA("fresca"),
	CARDINAL("cardinal"),
	GIOCO("gioco"),
	TATIANA("tatiana"),
	STAUNTY("staunty"),
	GOVERNOR("governor"),
	DUBROVNY("dubrovny"),
	ICPIECES("icpieces"),
	SHAPES("shapes"),
	LETTER("letter");

	private final String shortName;

	PieceSet(String shortName) {
		this.shortName = shortName;
	}

	@JsonValue
	public String getShortName() {
		return shortName;
	}
}
