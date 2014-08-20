package com.thejoyofabc

enum Gender {
	MALE("Male"),
	FEMALE("Female"),
	OTHER("Other")

	final String value

	Gender(String value) {
		this.value = value
	}

	String toString() {
		value
	}
	String getKey() {
		name()
	}
}
