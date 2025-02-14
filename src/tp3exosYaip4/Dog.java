package tp3exosYaip4;

public class Dog extends Mammal {
	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog dog) {
		System.out.println("Woooof");
	}
	
	
	@Override
	public String toString() {
		return "Dog[" + super.toString() + "]";
	}
	
	
	
	public static void main (String[] args) {
	      Dog d1 = new Dog("Riwenn");
	      System.out.println(d1.toString());
	      d1.greets();
	      }
}
