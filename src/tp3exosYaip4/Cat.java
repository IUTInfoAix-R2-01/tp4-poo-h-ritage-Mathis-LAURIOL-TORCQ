package tp3exosYaip4;

public class Cat extends Mammal {
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}
	
	
	@Override
	public String toString() {
		return "Cat[" + super.toString() + "]";
	}
	
	
	public static void main (String[] args) {
	      Cat c1 = new Cat("Moorea");
	      System.out.println(c1.toString());
	      c1.greets();
	      }
}
