package main;
import java.util.ArrayList;
public class TestCase {
	/*==========================================================
	 *  						Instances 
	 *=========================================================*/
	static SomeHelperClass someHelperClass = new SomeHelperClass();

	/*==========================================================
	 *  						Main 
	 *=========================================================*/
	public static void main(String[] args) {

		System.out.println("Please Choose an option: \n"
				+ "1: SORT_ASCENDING \n"
				+ "2: SORT_DESCENDING \n"
				+ "3: SORT_ByType \n"
				+ "4: SORT_NOTHING \n");
 
		// Check if the input is valid option*/
		int choice = SomeHelperClass.validateInput(); 

		try {
			ArrayList<Figure> list =someHelperClass.getFigures();//Figures List
			SomeHelperClass.sort(list,choice); //Sort List
			list.forEach((figure) -> figure.print());
			
		} catch (Exception e) {
		} finally {
			someHelperClass = null;
		}

	}
} 

  