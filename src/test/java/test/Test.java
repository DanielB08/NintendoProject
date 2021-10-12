package test;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Console;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {

		List<Console> Consoles = new ArrayList();
		Console c1 = new Console("Nintendo Gamecube");
		Console c2 = new Console("PlayStation4");
		Console c3 = new Console("Xbox one");

		Consoles.add(c1);
		Consoles.add(c2);
		Consoles.add(c3);

		Jeu j1 = new Jeu("F1 2021", Consoles);
		Jeu j2 = new Jeu("Fifa 21", Consoles);
		Jeu j3 = new Jeu("Call of duty", Consoles);

		List<Jeu> jeux = new ArrayList();
		jeux.add(j1);
		jeux.add(j2);
		jeux.add(j3);

		Adresse adresse = new Adresse (3, 4, "Paris");

		Boutique boutique = new Boutique("Micromania", adresse,jeux);



	}
}
