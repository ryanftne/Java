package test;

import java.util.Scanner;

public class Principale03 {

	public static void main(String[] args) {

		// Variables
		int codeSolde;
		double prixArticle, prixSolde;

		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrez le prix de l'article non soldé : ");
		prixArticle = clavier.nextDouble(); // on récupère la valeur
		System.out.print("Entrez le code solde, 1 pour -20% ou 2 pour -50% ou 3 pour -70% : ");
		codeSolde = clavier.nextInt();

		// Calcul de prix soldé et affichage
		if (codeSolde == 1) {
			prixSolde = 0.8 * prixArticle;
			System.out.print("Le prix à -20% est " + prixSolde + " €");
		} else if (codeSolde == 2) {
			prixSolde = 0.5 * prixArticle;
			System.out.print("Le prix à -50% est " + prixSolde + " €");
		} else {
			prixSolde = 0.3 * prixArticle;
			System.out.print("Le prix à -7 0% est " + prixSolde + " €");
		}
		clavier.close();
	}

}
