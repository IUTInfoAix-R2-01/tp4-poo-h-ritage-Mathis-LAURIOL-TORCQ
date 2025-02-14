package tp3exosYaip5;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {

	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI*(radius*radius);
	}
	
	public String toString() {
		return "Circle[radius=" + radius + ",color=" + color + "]";
	}
	
	
	public static void main (String[] args) {
	      Circle c1 = new Circle();
	      System.out.println("Circle:"
	            + " radius=" + c1.getRadius()
	            + " area=" + c1.getArea());
	   
	      Circle c2 = new Circle(10.0);
	      System.out.println("Circle:"
	            + " radius=" + c2.getRadius()
	            + " area=" + c2.getArea());
	   
	      Circle c3 = new Circle(2.0, "blue");
	      System.out.println("Circle:"
	            + " radius=" + c3.getRadius()
	            + " area=" + c3.getArea());
	}
	
}
