package com.thejoyofabc

import org.grails.plugins.address.Address

class User {
	String title
	String firstName
	String middleName
	String lastName
	String suffix
	String nickname
	Date dateOfBirth
	Gender gender
	Address address
	String phone

	static constraints = { phone(usPhone: true) }
}
