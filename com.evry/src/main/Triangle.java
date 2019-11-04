package main;
public class Triangle extends Figure {

	/*==========================================================
	 *  						Properties 
	 *=========================================================*/
	private double base;
	private double height;
	
	/**
	 * Constructor 
	 * @Constructor 
	 * @throws Exception if base or height has negative value 
	 */
	public Triangle(double base, double height) {
		setBase(base);
		setHeight(height);
	}
	
	/*==========================================================
	 *  						Getters 
	 *=========================================================*/
	public double getArea() {
		return base * height / 2;
	}
	public String getType() {
		return "Triangle";
	}
	public double getBase() {
		return base; 
	}
	public double getHeight() {
		return height;
	}
	/*==========================================================
	 *  						Setters 
	 *=========================================================*/
	public void setBase(double base) {
		throwExceptionUnlessLargerThanZero(base);

		this.base = base;
	}
	public void setHeight(double height) {
		throwExceptionUnlessLargerThanZero(height);

		this.height = height;
	} 
}
