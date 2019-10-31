package Constructors;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width) {
		
		setWidth(width);
		setHeight(width);
	
	}
	public Rectangle(int width, int height) {
		
		setWidth(width);
		setHeight(height);
	}


	
	public int area() {
		int area = getWidth()*getHeight();
		
		return area;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

