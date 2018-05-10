package demo;

public class Triangle extends Shape {

	private int base, height;
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		this.area = 0.5 * this.base * this.height;

	}

}
