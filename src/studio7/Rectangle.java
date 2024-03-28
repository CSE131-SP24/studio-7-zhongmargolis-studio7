package studio7;

public class Rectangle {

	private double width;
	private double length;
	
	public Rectangle(double mywidth, double mylength) {
	      width = mywidth;
	      length = mylength;
	   }
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getPerimiter() {
		return (this.width * 2) + (this.length * 2);
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	
	public boolean smallerArea(Rectangle other) {
		if (this.getArea() < other.getArea()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Square() {
		if (this.width == this.length) {
			return true;
		} else {
			return false;
		}
	}
}