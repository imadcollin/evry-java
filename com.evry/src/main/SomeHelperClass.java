package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SomeHelperClass {

	/*
	 * Context for exceptions from helper
	 */
	public static final String CONTEXT = SomeHelperClass.class.getName();
	private static Scanner scanner;

  
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
	public static ArrayList<Figure> sort(ArrayList<Figure> list, int choice) {
 
		switch(choice) {
		case 1 : 
			System.out.println("\n----------Figures Sorted By Area Ascending---------");

			Collections.sort(list);
			break; 
		case 2:  
			System.out.println("\n----------Figures Sorted By Area Descending---------");

			Collections.sort(list);
			Collections.reverse(list);
			break;
		case 3 :
			System.out.println("\n----------Figures Sorted By Type---------");

			TypeCompare TypeCompare= new TypeCompare();
			Collections.sort(list,TypeCompare);
			break;
		default:
			System.out.println("\nOBS!!! Random sort by Area...");
		}
		//Print compared Figures by Area 
		return list ;
		}

	/**
	 * Validate input using system in, returning the input when it is a valid 
	 * number "digit" that to prevent the user entering other data type format
	 * @param none  
	 */
	public static int validateInput() {
		scanner = new Scanner(System.in);

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
