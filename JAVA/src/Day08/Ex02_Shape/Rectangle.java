package Day08.Ex02_Shape;

/**
 * 
 */
public class Rectangle extends Shape {

	
	double width, height;
	
	public Rectangle() {
		this(0,0);
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}

	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	

	
		
	
}
