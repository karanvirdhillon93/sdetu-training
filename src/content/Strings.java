package content;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle="Lord of the rings";
		String wordChoice="ring";
		if (bookTitle.contains("ring")){
			System.out.print("Book contains the word ring"+wordChoice);
		}
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.print("The browser is chrome");
		}
		
		String firstName="tim";
		String lastName="short";
		String SSN="123456789";
		System.out.print(SSN.indexOf(SSN.length()));
		System.out.println(firstName+lastName+SSN.substring(SSN.length()-4, SSN.length()));

	}

}
