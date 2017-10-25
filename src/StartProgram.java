import java.util.Scanner;

public class StartProgram {
	public static void startApp() {
		Scanner scnr = new Scanner(System.in);
		int userInput = 0;
		boolean continueApp = true;
		String yesNo;
		
		System.out.println("Learn your squares and cubes!");
		while (continueApp) {
			System.out.println("Enter an Integer:");
			while (!scnr.hasNextDouble()) {
				System.out.print("Please enter numbers only!");
				scnr.next();
			}
			userInput = scnr.nextInt();
			Table.printTable();
			Table.printCalculations(userInput);
			System.out.println("Continue? y/n");
			yesNo = scnr.next().toLowerCase();
			if (yesNo.equals("n")) {
				System.out.println("Program stopped.");
				continueApp = false;
				scnr.close();
			}
			
		}

	}
}
