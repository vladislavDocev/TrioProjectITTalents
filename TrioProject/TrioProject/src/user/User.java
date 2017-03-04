package user;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import champions.Champion;

public class User {
	
	Scanner sc = new Scanner(System.in);
	private static final  String PATTERN_PASSWORD = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	
	private String name;
	private String userName;
	private final String password;
	private static int UNIQUE_ID = 1;
	private int id ;
	private String eMail;
	private Champion champ;
	private ArrayList history;
	private File users;
	
	private User(String pass) throws Exception{
		if(!pass.matches(PATTERN_PASSWORD)){
			throw new Exception("Your password is not strong!");
		}
		else{
			this.password = pass;
		}
	}
	
	// vijdam konstruktora kato samata registraciq
	public User(String name, String userName, String pass, String eMail) throws Exception {
		this(pass);
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		this.users = new File("users.txt");
		this.eMail = eMail;
		this.userName = userName;
		this.id = UNIQUE_ID++;
	}
	
	boolean isValidPassword(){
		System.out.println("Please enter your password: ");
		String pass = sc.nextLine();
		if(pass.equals(this.password)){
			System.out.println("Correct password.");
			System.out.println("--------------------");
			return true;
		}
		System.out.println("Uncorrect password! Try again!");
		return isValidPassword();
	}
	
	public boolean isValidUserName(){
		System.out.println("Please enter your username: ");
		String uName = sc.nextLine();
		if(uName.equals(this.userName)){
			System.out.println("Correct username.");
			System.out.println("--------------------");
			return true;
		}
		System.out.println("Uncorrect username! Try again!");
		return isValidUserName();
	}
	
	public boolean log(){
		if(isValidUserName() && isValidPassword()){
			return true;
		}
		return log();
	}


	public Champion getChamp() {
		return champ;
	}


	public void setChamp(Champion champ) {
		if(log()){
			this.champ = champ;
		}
	}
	
	
	
	
}
