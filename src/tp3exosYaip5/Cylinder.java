package tp3exosYaip5;

public class Cylinder {
	private Circle base;
	private double height = 1.0;
	
	public Cylinder() {
		base = new Circle();
	}
	
	public Cylinder(double radius) {
		base = new Circle(radius);
	}
	
	public Cylinder(double radius, double height) {
		base = new Circle(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		base = new Circle(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}
	
	
	
	
	public double getVolume() {
		return base.getArea()*height;
	}
	
	
	
	
	
	
	public static void main (String[] args) {
	      Cylinder c1 = new Cylinder();
	      System.out.println("Cylinder:"
	            + " radius=" + c1.getBase().getRadius()
	            + " height=" + c1.getHeight()
	            + " base area=" + c1.getBase().getArea()
	            + " volume=" + c1.getVolume());
	   
	      Cylinder c2 = new Cylinder(10.0);
	      System.out.println("Cylinder:"
	            + " radius=" + c2.getBase().getRadius()
	            + " height=" + c2.getHeight()
	            + " base area=" + c2.getBase().getArea()
	            + " volume=" + c2.getVolume());
	   
	      Cylinder c3 = new Cylinder(2.0, 10.0);
	      System.out.println("Cylinder:"
	            + " radius=" + c3.getBase().getRadius()
	            + " height=" + c3.getHeight()
	            + " base area=" + c3.getBase().getArea()
	            + " volume=" + c3.getVolume());
	   }
}
