import java.util.Scanner;

public class UserValidation {
	
	static Scanner scnr = new Scanner(System.in);
	static int userInput = 0;
	
	public static void validateInput () {

		while (!scnr.hasNextDouble()) {
			System.out.print("Please enter numbers only!");
			scnr.next();
		}
	
	}
	
	public static int getInput() {
		
		userInput = scnr.nextInt();
		return userInput;
	}
	
	public static boolean restartApp() {
		
		String yesNo;
		boolean continueApp = true;
		System.out.println("Continue? y/n");
		yesNo = scnr.next().toLowerCase();
		if (yesNo.equals("n")) {
			System.out.println("Program stopped.");
			continueApp = false;
			scnr.close();
			
			
		
			
		}
		return continueApp;
		
	}
	
}
