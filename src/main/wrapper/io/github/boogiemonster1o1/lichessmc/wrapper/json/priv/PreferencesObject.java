package io.github.boogiemonster1o1.lichessmc.wrapper.json.priv;

import io.github.boogiemonster1o1.lichessmc.wrapper.json.user.ActualPreferencesObject;

public record PreferencesObject(
	ActualPreferencesObject prefs,
	String language
) {
}
