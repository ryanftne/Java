package test;

import java.util.Scanner;

public class Principale10 {

	static double calculePrixSolde(double prixArticle, double tauxSolde) {
		double prixSolde;
		prixSolde = (1 - tauxSolde / 100) * prixArticle;
		return prixSolde;
	}

	public static void main(String[] args) {

		double prixArticle = 0., tauxSolde = 0.;

		Scanner clavier = new Scanner(System.in);

		System.out.println("Entrer prix de l'article non soldé : ");
		prixArticle = clavier.nextDouble();
		System.out.println("Entrer le pourcentage de réduction : ");
		tauxSolde = clavier.nextDouble();
		clavier.close();

		System.out.println("Le prix de l'article soldé est : " + calculePrixSolde(prixArticle, tauxSolde) + " euros."); // appel de la fonction
	}
}