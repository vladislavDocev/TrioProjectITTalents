package Notepad;

public class Page {
	private String header;
	private String content;

	Page() {
		this.header="";
		this.content="";
	}
	
	public void addText(String header,String text) {
			this.header=header;
			this.content=this.content.concat(text);
	}
	
	public void deleteText(){
		this.content="";
	}
	
	public void viewPage(){
		System.out.println(this.header);
		System.out.println(this.content);
	}
	
	public boolean containsWord(String word){
		return this.content.contains(word);
	}
	
	public boolean containsDigits() {
		return this.content.matches(".*\\d+.*");
	}

}
