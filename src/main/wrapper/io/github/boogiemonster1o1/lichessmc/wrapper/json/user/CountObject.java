package io.github.boogiemonster1o1.lichessmc.wrapper.json.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CountObject(
	int all,
	int rated,
	int ai,
	int draw,
	int drawH,
	int loss,
	int lossH,
	int win,
	int winH,
	int bookmark,
	int playing,
	@JsonProperty("import") int imported,
	int me
) {}
