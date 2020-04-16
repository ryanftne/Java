package test;

import java.util.Scanner;

public class Principale08 {

	public static void main(String[] args) {
		int n = 1;
		String motDePasse = new String(); // Création d'un objet
		motDePasse = "";
		
		Scanner clavier = new Scanner(System.in);
		
		while (motDePasse.equals("SeSaMe") == false && n <4) {
			System.out.println("Entrer le mot de passe : "); // Sasie du mot de passe 
			motDePasse = clavier.next();
			n++; // Incrémentation
		}

		if(motDePasse.equals("SeSaMe")) {
			System.out.println("Merci, vous pouvez entrer.");
		} else {
			System.out.println("Alarme déclenchée.");
		}
		clavier.close(); // libère espace mémoire
	}

}
