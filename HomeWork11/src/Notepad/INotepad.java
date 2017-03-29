package Notepad;

public interface INotepad {
	
	public void addText(int pageNumber, String text);
	public void overwriteText(int pageNumber,String text);
	public void deleteText(int pageNumber);
	public void viewPages();
	public boolean searchWord(String word);
	public void printAllPagesWithDigits();
}
