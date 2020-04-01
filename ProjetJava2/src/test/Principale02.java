package test;

import java.util.Scanner;

public class Principale02 {

	public static void main(String[] args) {
		// Déclaration des variables
		float dividende, diviseur;
		double quotient;
		
		// Enregistrement des valeurs tapés par l'utilisateur
		Scanner clavier = new Scanner(System.in); // Scanner permet d'interagir avec la console, objet
		System.out.print("Entrez le dividende : ");
		dividende = clavier.nextFloat(); // Stock les valeurs
		System.out.print("Entrez le diviseur : ");
		diviseur = clavier.nextFloat();
		
		// Calcul du quotient 
		quotient = dividende / diviseur;
		
		// Affichage du résultat 
		
		System.out.print("Le quotient de la division est " + quotient);
        clavier.close(); // On ferme 
	}

}
