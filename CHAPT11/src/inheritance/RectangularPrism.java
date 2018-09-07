package inheritance;

public class RectangularPrism extends Rectangle {
	private double length;
	
	public RectangularPrism() {
	}
	
	public RectangularPrism(double width, double height, double length, String color, boolean filled) {
		setWidth(width);
		setHeight(height);
		setColor(color);
		setFilled(filled);
		this.length = length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getSurfaceArea() {
		return 2 * ((length * getWidth()) + (length * getHeight()) + (getHeight() * getWidth()));
	}
	
	@Override
	public double getArea() {
		return -9999;
	}
	
	
}
