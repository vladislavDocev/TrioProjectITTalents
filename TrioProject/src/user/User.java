package user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import champions.Champion;

public class User {
	
	Scanner sc = new Scanner(System.in);
	private static final String PATTERN_PASSWORD = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	private static final String PATTERN_EMAIL = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	
	private String name;
	private String userName;
	private final String password;
	private static int UNIQUE_ID = 1;
	private int id ;
	private String eMail;
	private Champion champ;
	private ArrayList history;
	private HashSet<String> userNames;
	
	private User(String pass, String userName, String eMail) throws Exception{
		if(!pass.matches(PATTERN_PASSWORD)){
			throw new Exception("Your password is not strong!");
		}  
		else{
			this.password = pass;
		}
		
		if(!eMail.matches(PATTERN_EMAIL)){
			throw new Exception("Invalid e-mail!");
		}
		else{
			this.eMail = eMail;		}
		
		if(userNames != null){
			this.userNames = new HashSet<>();
		}
		if(!userNames.contains(userName)){
			throw new Exception("This username is used !");
		}
		else{
			this.userName = userName;
			this.userNames.add(userName);
		}
	}
	
	// vijdam konstruktora kato samata registraciq
	public User(String name,String userName, String pass, String eMail) throws Exception {
		this(pass,userName, eMail);
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
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
