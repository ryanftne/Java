package test;

public class Principale11 {

	public static void main(String[] args) {
		
		//Constructeur par d�faut (sans param�tres)
		Corpulence jean = new Corpulence();
		
		//Constructeur d'initialisation (avec param�tres)
		Corpulence pierre = new Corpulence(180,85);
		System.out.println(pierre.getPoids());
		jean.setTaille(190);
		System.out.println(jean.getTaille());

	}

}
