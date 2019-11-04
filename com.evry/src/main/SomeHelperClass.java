package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SomeHelperClass {

	/*
	 * Context for exceptions from helper
	 */
	public static final String CONTEXT = SomeHelperClass.class.getName();


	/**
	 * Retrieves a ArrayList of figures 
	 * @return ArrayList of Figures 
	 * @throws Exception
	 */
	public ArrayList<Figure> getFigures() throws SystemException {

		ArrayList<Figure> list = new ArrayList<Figure>();
		list.add(new Square(3));
		list.add(new Triangle(2, 3));
		list.add(new Square(2));
		list.add(new Triangle(2, 2));
		list.add(new Triangle(2, 6));

		if (list.isEmpty()) {
			throw new SystemException("Empty list", CONTEXT);
		}
		return list;
	}

	/**
	 * Sorts the list depending on incoming sort choice parameter
	 * @param list
	 * @param sortChoice: 1, 2 , or any digit
	 */
	public static void sort(ArrayList<Figure> list, int choice) {
		System.out.println("\n----------Figures sorted by Area---------");

		switch(choice) {
		case 1 : 
			Collections.sort(list);
			break; 
		case 2: 
			Collections.sort(list);
			Collections.reverse(list);
			break;
		default:
			System.out.println("\nOBS!!! Random sort by Area... only 1 or 2 for sorted list");
		}
		//Print compared Figures by Area 
		list.forEach((figure) -> figure.print());

		//Compare by Types and print
		TypeCompare TypeCompare= new TypeCompare();
		Collections.sort(list,TypeCompare);

		System.out.println("\n----------Figures sorted by Type----------");
		list.forEach((figure) -> figure.print());
	}

	/**
	 * Validate input using system in, returning the input when it is a valid 
	 * number "digit" that to prevent the user entering other data type format
	 * @param none  
	 */
	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);

		int number;
		do {
			while (!scanner.hasNextInt()) {
				String input = scanner.next();
				System.out.printf("\"%s\" is not a valid number.\n", input);
			}
			number = scanner.nextInt();
		} while (number < 0);

		System.out.printf("You have entered %d.\n", number);
		return number;
	}

}
