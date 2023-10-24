package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("","");
		//em1.setAlternateEmail("jv@gmail.com");
		//System.out.printf("Your new e-mail is: " + em1.getAlternateEmail());
		System.out.println(em1.showInfo());
	}

	
}
