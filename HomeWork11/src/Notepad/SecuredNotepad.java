package Notepad;

import java.util.Scanner;

public class SecuredNotepad implements INotepad {
	
	private String password;
	private Page[] pages = new Page[100];
	
	SecuredNotepad(String password) {
		while(!passIsStrong(password)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Weak pass!Enter again:");
			password=sc.nextLine();
		}
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i] = new Page();
		}
			this.password=password;
	}
	@Override
	public void addText(int pageNumber, String text) {
		this.validatePass();
		this.pages[pageNumber].addText("Header", text);
	}

	@Override
	public void overwriteText(int pageNumber, String text) {
		this.validatePass();
		this.pages[pageNumber].deleteText();
		this.pages[pageNumber].addText("Header", text);
	}

	@Override
	public void deleteText(int pageNumber) {
		this.validatePass();
		this.pages[pageNumber].deleteText();
	}

	@Override
	public void viewPages() {
		this.validatePass();
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i].viewPage();
		}
	}
	public void validatePass() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your password");
		String whatHeEntered=sc.nextLine();
		while(!this.password.equals(whatHeEntered)){
			System.out.println("Incorrect Password! Please try again:");
			whatHeEntered=sc.nextLine();
		}
	}

	@Override
	public boolean searchWord(String word) {
		validatePass();
		for (int i = 0; i < this.pages.length; i++) {
			if(this.pages[i].containsWord(word)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void printAllPagesWithDigits() {
		validatePass();
		for (int i = 0; i < this.pages.length; i++) {
			if(this.pages[i].containsDigits()) {
			this.pages[i].viewPage();
			}
		}
	}
	public boolean passIsStrong(String pass) {
		char[] password=pass.toCharArray();
		if(password.length<5) {
			return false;
		}
		boolean containsDigit = false;
		boolean containsUpperCase = false;
		boolean containsLowerCase = false;
		for (int i = 0; i < password.length; i++) {
			if(password[i]>96 && password[i]<123) {
				containsLowerCase=true;
			}
			if(password[i]>64 && password[i]<91) {
				containsUpperCase=true;
			}
			if(password[i]>47 && password[i]<58) {
				containsDigit=true;
			}
		}
		return containsDigit && containsUpperCase && containsLowerCase ? true : false ;
	}

}
