package tp3exosYaip6;

import tp3exosYaip4.Staff;

public class BigDog extends Dog {
	public BigDog(String name) {
		super(name);
	}
	
	@Override
	public void greets() {
		System.out.println("Woow");
	}
	
	@Override
	public void greets(Dog dog) {
		System.out.println("Woooow");
	}
	
	public void greets(BigDog bigDog) {
		System.out.println("Woooooooow");
	}
	
	public static void main (String[] args) {
		  BigDog s1 = new BigDog("MechantChien");
		  BigDog s2 = new BigDog("MechantChien2");
	      System.out.println(s1.toString());
	      s1.greets(s2);
	      }
}
