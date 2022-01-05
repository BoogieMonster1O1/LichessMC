package io.github.boogiemonster1o1.lichessmc.wrapper.json.account;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SoundSet {
	SILENT("silent"),
	STANDARD("standard"),
	PIANO("piano"),
	NES("nes"),
	SFX("sfx"),
	FUTURISTIC("futuristic"),
	ROBOT("robot"),
	MUSIC("music"),
	SPEECH("speech");

	private final String shortName;

	SoundSet(String shortName) {
		this.shortName = shortName;
	}

	@JsonValue
	public String getShortName() {
		return shortName;
	}
}
