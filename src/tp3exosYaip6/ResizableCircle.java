package tp3exosYaip6;

public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public void resize(int percent) {
		super.radius *= percent/100.0;
	}
	
	@Override
	public String toString() {
		return "ResizableCircle[" + super.toString() + "]";
	}
	
	public static void main (String[] args) {
		  ResizableCircle s1 = new ResizableCircle(10.0);
	      System.out.println(s1.toString());
	      s1.resize(50);
	      System.out.println(s1.toString());
	      }
}
