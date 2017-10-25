
public class Table {

	public static void printTable() {
		System.out.printf("%-10s %-10s %-10s \n", "Number","Squared","Cubed");
		System.out.printf("%-10s %-10s %-10s \n", "=======","=======","=======");
	}
	public static void printCalculations(int userInput) {
		for (int i = 1; i < userInput + 1; i++) {
			System.out.printf("%-10s %-10s %-10s \n", i, Calculate.calcSquare(i), Calculate.calcCube(i));
		}
		
	}
}
