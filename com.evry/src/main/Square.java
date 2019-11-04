package main;
public class Square extends Figure {
	/*==========================================================
	 *  						Properties 
	 *=========================================================*/
	private double base;
	
	/**
	 * Constructor 
	 * @Constructor 
	 * @throws Exception if base or height has negative value 
	 */
	public Square(double base) {
		setBase(base);
	}
	/*==========================================================
	 *  						Getters 
	 *=========================================================*/
	public double getArea() {
		return base * base;
	}

	public String getType() {
		return "Square";
	}
	
	public double getBase() {
		return base; 
	}
	/*==========================================================
	 *  						Setters 
	 *=========================================================*/
	public void setBase(double base) {
		throwExceptionUnlessLargerThanZero(base);
		
		this.base = base;
	}
}
