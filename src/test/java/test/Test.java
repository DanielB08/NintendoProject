package test;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Hybride;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {

		List<Console> Consoles = new ArrayList();
		Console c1 = new Hybride("Nintendo Gamecube",0,"");
		Console c2 = new Hybride("PlayStation4",0,"");
		Console c3 = new Hybride("Xbox one",0,"");
		Console playstation = new Hybride ("Playstation",0,"");
		Console gameboy = new Hybride ("gameboy",0,"");
		Console xbox = new Hybride ("xbox",0,"");
		Console wii = new Hybride ("wii",0,"");

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


		Jeu j = new Jeu("Pokemon",Consoles);
		Jeu j4 = new Jeu("Mario",Consoles);
		Jeu j5 = new Jeu("Zelda",Consoles);



		Client c = new Client ("Vince","Dve","Pokemon");
	}


}
