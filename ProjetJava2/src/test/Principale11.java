package test;

public class Principale11 {

	public static void main(String[] args) {
		
		//Constructeur par défaut (sans paramètres)
		Corpulence jean = new Corpulence();
		
		//Constructeur d'initialisation (avec paramètres)
		Corpulence pierre = new Corpulence(180,85);
		System.out.println(pierre.getPoids());
		jean.setTaille(190);
		System.out.println(jean.getTaille());

	}

}
