package io.github.boogiemonster1o1.lichessmc.wrapper.json.user;

import java.util.Optional;

import io.github.boogiemonster1o1.lichessmc.wrapper.json.value.Title;

public record UserStatusObject(
	String id,
	String name,
	Optional<Title> title,
	Optional<Boolean> online,
	Optional<Boolean> playing,
	Optional<Boolean> streaming,
	Optional<Boolean> engine
) {
}
