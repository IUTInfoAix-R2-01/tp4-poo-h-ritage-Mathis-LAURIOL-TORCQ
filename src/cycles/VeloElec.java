package cycles;

import java.util.Random;

public class VeloElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec() {
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	
	
	
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double coupleMoteur) {
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	@Override
	public String toString() { 
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) { 
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		Random rnb = new Random();
		
		VeloElec v1 = new VeloElec(15.0, 30.0, 10.0);
		v1.setGenAlea(rnb);
		System.out.println(v1.toString());
		System.out.println(v1.getPuissance(11.0));
	}
}
