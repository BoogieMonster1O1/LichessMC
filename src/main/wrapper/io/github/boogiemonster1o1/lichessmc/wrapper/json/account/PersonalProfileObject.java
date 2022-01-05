package io.github.boogiemonster1o1.lichessmc.wrapper.json.account;

public record PersonalProfileObject(
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
