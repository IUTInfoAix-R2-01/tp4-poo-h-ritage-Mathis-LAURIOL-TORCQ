package cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	
	public Velo(double braquet, double diamRoue) {
		this.setBraquet(braquet);
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		this.setBraquet(braquet);
	}
	
	public Velo() {
		this.setBraquet(DEFAUT_BRAQUET);
	}
	
	
	
	public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	
	
	@Override
	public String toString() { 
		return "Velo[braquet=" + braquet + ",diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Random rnb = new Random();
		
		Velo v1 = new Velo(15.0, 30.0);
		v1.setGenAlea(rnb);
		System.out.println(v1.toString());
		System.out.println(v1.getPuissance(11.0));
	}
	
	
}



