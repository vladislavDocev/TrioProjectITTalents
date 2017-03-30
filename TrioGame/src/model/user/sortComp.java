package model.user;

import java.util.Comparator;

public class sortComp implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {
		return u2.getWins()-u1.getWins();
	}

	
	
}