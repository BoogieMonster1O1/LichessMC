package io.github.boogiemonster1o1.lichessmc.wrapper.json.user;

public record ProfileObject(
	String country,
	String location,
	String bio,
	String firstName,
	String lastName,
	int fideRating,
	int uscfRating,
	int ecfRating, 
	String links
){}
