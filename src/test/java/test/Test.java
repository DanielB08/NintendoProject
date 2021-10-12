package test;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {
		Adresse adresse = new Adresse (3, 4, "Paris");
		List<Jeu> jeu = new ArrayList();
		Boutique boutique = new Boutique("Micromania", adresse,jeu);
	}

}
