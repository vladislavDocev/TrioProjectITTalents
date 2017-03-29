package Notepad;

public class SecuredNotepadDemo {

	public static void main(String[] args) {
		SecuredNotepad sn = new SecuredNotepad("Petko 1");
		ElectronicSecuredNotepad esn = new ElectronicSecuredNotepad("Petko");
		esn.start();
		esn.addText(2, "text!!!");
		esn.addText(1, "text131f");
		esn.addText(1, "text131f");
		esn.viewPages();
		
	}

}
