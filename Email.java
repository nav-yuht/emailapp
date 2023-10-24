package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companyName = "mvbank.com";
	private Scanner sc;
	private String str;
	private String str1;
	// Constructor to receive the firstName and the lastName
		public Email(String firstName, String lastName) {
			//this.firstName = firstName;
			//this.lastName = lastName;
			System.out.println("New Employee\n: ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your firstname: ");
			String str = sc.nextLine();
			Scanner in = new Scanner(str);
			System.out.println("Enter your lastname: ");
			String str1 = sc.nextLine();
			Scanner in1 = new Scanner(str1);
			this.firstName = str;	
			this.lastName = str1;

			//Call a method asking for the department - return the department

			this.department = setDepartment();
			System.out.println("Department: " + this.department); // try hiding this line. For printing out the result after entering the dev.code.
	
			//Combine the elements to generate an e-mail
			//email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companyName;
			email = str.toLowerCase()+ "." + str1.toLowerCase()+ "@" + department + "." + companyName;
			System.out.println("Your e-mail is: " + email);// try without "+email"
			
			// Call a method that will return a random password.
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is: " + this.password);			
			
			}

	// Ask for the department

		private String setDepartment(){
			System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			if (depChoice == 1) {return "sales";}
			else if (depChoice == 2) {return "dev";}
			else if (depChoice == 3) {return "acct";}
			else {return "";}
			}

	// Generate a random password
	
		private String randomPassword(int length){
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUXY0123456789@#$%";
			char [] password = new char [length];
			for (int i=0; i<length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password); // why this line?
			}
	// Set the mailbox capacity	
	
		public void setMailBoxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		
	// Set an alternate email
		
		public void setAlternateEmail(String altEmail) {
			/*Scanner sc = new Scanner(System.in);
			System.out.println("Enter your e-mail: ");
			String str = sc.nextLine();
			Scanner in = new Scanner(str);
			System.out.println("Your alternate e-mail is: " + str); */ // in case generating an alt e-mail by taking input
			
			this.alternateEmail = altEmail; //no need to use this. here, just for practice when practicing set-methods.

}
		
	// Change the password
		
		public void changePassword(String password) {
			this.password = password;
		}
	
	// Doing get-methods
		public int getMailboxCapacity() {return mailboxCapacity; }
		public String getAlternateEmail(){return alternateEmail;}
		public String getPassword() {return password; }
	
	// showInfo
		public String showInfo() {
			return "DISPLAY NAME: " + str + str1 +
					"\nCOMPANY EMAIL: " + email +
					"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
					
		}
		
	
}