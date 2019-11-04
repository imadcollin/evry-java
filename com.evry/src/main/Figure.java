package main;
import java.util.Comparator;

public abstract class Figure implements Comparable<Object> {

	/*==========================================================
	 *  						Methods 
	 *=========================================================*/
	public void print() {
		System.out.println(getType() + " area = " + getArea());
	}

	protected void throwExceptionUnlessLargerThanZero(double val) {
		if (val <= 0) throw new IllegalArgumentException(); 
	}

	/*==========================================================
	 *  				Comparable Override Method 
	 *=========================================================*/
	public int compareTo(Object otherObject) throws NullPointerException {
		if (otherObject == null) throw new NullPointerException();

		Figure otherFigure = (Figure)otherObject;

		if (getArea() > otherFigure.getArea()) return 1;
		if (getArea() < otherFigure.getArea()) return -1;
		return 0;

		//Or:
		//return (int) (getArea()-otherFigure.getArea());
	}
	/*==========================================================
	 *  				Abstract Methods 
	 *=========================================================*/
	public abstract double getArea();

	public abstract String getType();
}


	/*==========================================================
	 *  				Comparator 
	 *=========================================================*/
class TypeCompare implements Comparator<Figure> 
{

	@Override
	public int compare(Figure f1, Figure f2) {
		return f1.getType().compareTo(f2.getType());

	}  

}
