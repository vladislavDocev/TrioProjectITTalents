package model.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	private static Pattern pattern;
	private static Matcher matcher;

	private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{5,}$";

	public PasswordValidator() {
		pattern = Pattern.compile(PASSWORD_PATTERN);
	}

	public static boolean validate(final String password) {
		System.out.println(password);
		matcher = pattern.matcher(password);
		return matcher.matches();
	}

}