package com.thejoyofabc

enum Languages {
	ENGLISH("English")

	final String value

	Languages(String value) {
		this.value = value
	}

	String toString() {
		value
	}
	String getKey() {
		name()
	}
}
