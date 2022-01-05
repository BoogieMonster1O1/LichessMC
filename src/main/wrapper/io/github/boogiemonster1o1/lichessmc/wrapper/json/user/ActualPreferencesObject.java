package io.github.boogiemonster1o1.lichessmc.wrapper.json.user;

import io.github.boogiemonster1o1.lichessmc.wrapper.json.value.SoundSet;
import io.github.boogiemonster1o1.lichessmc.wrapper.json.value.PieceSet;
import io.github.boogiemonster1o1.lichessmc.wrapper.json.value.PieceSet3d;
import io.github.boogiemonster1o1.lichessmc.wrapper.json.value.Theme;
import io.github.boogiemonster1o1.lichessmc.wrapper.json.value.Theme3d;

public record ActualPreferencesObject(
	boolean dark,
	boolean transp,
	String bgImg,
	boolean is3d,
	Theme theme,
	PieceSet pieceSet,
	Theme3d theme3d,
	PieceSet3d pieceSet3d,
	SoundSet soundSet,
	int blindfold,
	int autoQueen,
	int autoThreefold,
	int takeback,
	int moretime,
	int clockTenths,
	int clockBar,
	int clockSound,
	int premove,
	int animation,
	int captured,
	int follow,
	int highlight,
	int destination,
	int coords,
	int replay,
	int challenge,
	int message,
	int coordColor,
	int submitMove,
	int confirmResign,
	int insightShare,
	int keyboardMove,
	int zen,
	int moveEvent,
	int rookCastle
) {
}
