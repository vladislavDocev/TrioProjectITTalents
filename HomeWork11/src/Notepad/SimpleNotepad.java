package Notepad;

public class SimpleNotepad implements INotepad {
	
	private Page[] pages;
	
	SimpleNotepad() {
		this.pages=new Page[100];
	}
	@Override
	public void addText(int pageNumber, String text) {
		this.pages[pageNumber].addText("Header", text);
	}

	@Override
	public void overwriteText(int pageNumber, String text) {
		this.pages[pageNumber].deleteText();
		this.pages[pageNumber].addText("Header", text);
	}

	@Override
	public void deleteText(int pageNumber) {
		this.pages[pageNumber].deleteText();
	}

	@Override
	public void viewPages() {
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i].viewPage();
		}
	}
	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < this.pages.length; i++) {
			if(this.pages[i].containsWord(word)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < this.pages.length; i++) {
			if(this.pages[i].containsDigits()) {
			this.pages[i].viewPage();
			}
		}
	}

}
