package tp3exosYaip6;

public class MovablePoint implements Movable {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public void moveUp() {
		y -= ySpeed;
	}
	
	public void moveDown() {
		y += ySpeed;
	}
	
	public void moveLeft() {
		x -= xSpeed;
	}
	
	public void moveRight() {
		x += xSpeed;
	}
	
	
	public String toString() {
		return "(" + x + "," + y + ")" + " speed=(" + xSpeed + "," + ySpeed + ")";
	}
	
	public static void main (String[] args) {
		  MovablePoint s1 = new MovablePoint(10, 10, 1, 1);
	      System.out.println(s1.toString());
	      s1.moveUp();
	      System.out.println(s1.toString());
	      }
}
