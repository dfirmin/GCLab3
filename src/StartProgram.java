

public class StartProgram {
	public static void startApp() {
		boolean continueApp = true;
		
		System.out.println("Learn your squares and cubes!");
		while (continueApp) {
			System.out.println("Enter an Integer:");
			UserValidation.validateInput();
			Table.printTable();
			Table.printCalculations(UserValidation.getInput());
			continueApp = UserValidation.restartApp();
			
			
		}

	}
}
