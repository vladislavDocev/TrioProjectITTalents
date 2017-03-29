package Notepad;

import java.util.Scanner;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	
	private boolean isOn;
	private Page[] pages = new Page[100];
	ElectronicSecuredNotepad(String password) {
		super(password);
	}	
	
	@Override
	public void start() {
		this.isOn=true;
	}

	@Override
	public void stop() {
		this.isOn=false;
	}

	@Override
	public void addText(int pageNumber, String text) {
		if(this.isOn) {
			super.addText(pageNumber, text);
		}
		else {
			deviceOff();
		}
		
	}

	@Override
	public void overwriteText(int pageNumber, String text) {
		if(this.isOn) {
			super.overwriteText(pageNumber, text);
		}
		else {
			deviceOff();
		}
		
	}

	@Override
	public void deleteText(int pageNumber) {
		if(this.isOn) {
			super.deleteText(pageNumber);
		}
		else {
			deviceOff();
		}
		
	}

	@Override
	public void viewPages() {
		if(this.isOn) {
			super.viewPages();
		}
		else {
			deviceOff();
		}
		
	}

	@Override
	public void validatePass() {
		if(this.isOn) {
			super.validatePass();
		}
		else {
			deviceOff();
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(this.isOn) {
			return super.searchWord(word);
			}
			else {
				deviceOff();
			}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if(this.isOn) {
		super.printAllPagesWithDigits();
		}
		else {
			deviceOff();
		}
	}

	@Override
	public boolean passIsStrong(String pass) {
		// TODO Auto-generated method stub
		return super.passIsStrong(pass);
	}

	@Override
	public boolean isStarted() {
		return isOn;
	}
	
	public void deviceOff() {
		System.out.println("Device is switched off! Do you want to turn it on(yes/no)?");
		Scanner sc = new Scanner(System.in);
		String answer=sc.next();
		if(answer.contains("yes")){
			this.isOn=true;
		}
	}

}
