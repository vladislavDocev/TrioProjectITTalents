package model.user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import model.champions.Champion;
import model.exceptions.InvalidEmailException;
import model.exceptions.InvalidNameException;
import model.exceptions.InvalidPasswordException;
import model.exceptions.InvalidUsernameException;

public class User {

	private static final String PATTERN_PASSWORD = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}";
	private static final String PATTERN_EMAIL = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

	private String name;
	private String userName;
	private String password;
	private static int UNIQUE_ID = 1;
	private long id;
	private String eMail;
	private Champion champ;
	private ArrayList history;
	private HashSet<String> userNames;

	// vijdam konstruktora kato samata registraciq
	public User(String name, String userName, String pass, String eMail)
			throws InvalidNameException, InvalidUsernameException, InvalidPasswordException, InvalidEmailException {
		if (stringValidator(name)) {
			this.name = name;
		} else {
			throw new InvalidNameException();
		}
		if (stringValidator(userName)) {
			this.userName = userName;
		} else {
			throw new InvalidUsernameException();
		}
		if (stringValidator(pass) ) {
			this.password = pass;
		} else {
			throw new InvalidPasswordException();
		}
		if (stringValidator(eMail)) {
			this.eMail = eMail;
		} else {
			throw new InvalidEmailException();
		}
		this.id = UNIQUE_ID++;
	}



	public Champion getChamp() {
		return champ;
	}

	public void setChamp(Champion champ) {
			this.champ = champ;
	}

	public String getName() {
		return this.name;
	}

	public String getUsername() {
		return this.userName;
	}

	public String getPass() {
		return this.password;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.eMail;
	}

	private boolean stringValidator(String s) {
		if (s != null && !s.trim().isEmpty()) {

			return true;
		}

		return false;
	}

}
