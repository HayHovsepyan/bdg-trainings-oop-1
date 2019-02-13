package com.bdg.vkaramyan.createUpdateObject;


public class AuthorCreateParameter {

	private String name;
	private String surname;
	private String gender;
	
	public AuthorCreateParameter(String name, String surname, String gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getGender() {
		return gender;
	}
	
	
	
}
