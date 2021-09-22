package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle="Ring Book";
		String wordChoice="RING";
		if(bookTitle.toUpperCase().contains(wordChoice.toUpperCase())) {
			System.out.println("the book contains 'RING'");
		}
		
		String browser ="Chrome";
		
		if(browser.equalsIgnoreCase("ChRoMe")) {
			System.out.println("yes");
		}

		
		String firstName = "Tim";
		String lastName= "Short";
		String SSH = "84747393";
		
		System.out.println(SSH.length());
		
		firstName.substring(0,1);
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,3));
		System.out.println(SSH.substring(5));
	}

}
