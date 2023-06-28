package Additions;

import java.util.Scanner;

// Ceci est un commentaire sur une seule ligne

/*
 * Ceci est un 
 * commentaire
 * sur plusieurs lignes
 */

/*
 VARIABLE
    Nombre1 est un entier
    Nombre2 est un entier
    Resultat est un entier
Debut programme
    Ecrire "Saisir le 1er nombre"
    Lire <-- Nombre1
    Ecrire "Saisir le 2ème nombre"
    Lire <-- Nombre2
    Resultat <-- Nombre1 + Nombre2
    Ecrire "le résultat de l'addition de ",Nombre1, " et ",Nombre2, " est égale à ", Resultat
Fin programme
 */

public class App {

	public static void main(String[] args) {
		// declaration des variables
		int nombre1;
		int nombre2;
		int resultat;
		Scanner sc;
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre ");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre ");
		nombre2 = sc.nextInt();
		resultat = nombre1 + nombre2;
		
		System.out.println("Le resultat de l'addition de "+
							nombre1 +" et "+ nombre2 + " est "+
							resultat);
		sc.close();
	}

}
