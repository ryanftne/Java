package test;

public class Corpulence {

	//Variables d'instance
	private int taille;
	private int poids;
	
	//Constructeur par défaut (sans paramètres)
	public Corpulence() {
		//On initialise les variables d'instances 
		taille = 0;
		poids = 0;
	}
	
	// Constructeur d'initialisation (avec paramètres)
	public Corpulence(int pTaille, int pPoids) {
		taille = pTaille;
		poids = pPoids;
		
	}
	
	//Getters 
	public int getTaille() {
		return taille;
	}
	
	public int getPoids() {
		return poids;
	}
	
	//Setters 
	public void setTaille (int pTaille) {
		if(pTaille >= 0) {
			taille = pTaille;
		} else {
			System.out.println("Incorrect");
		}
	}
	
	public void setPoids (int pPoids) {
		if(pPoids >= 0) {
			poids = pPoids;
		} else {
			System.out.println("Incorrect");
		}
	}
	
}
