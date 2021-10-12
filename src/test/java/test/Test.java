package test;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {
		
		List<Jeu> jeux = new ArrayList();
		List<Console> Consoles = new ArrayList();
		
		Adresse adresse = new Adresse (3, 4, "Paris");
	
		Boutique boutique = new Boutique("Micromania", adresse,jeux);
		
		
		Console c1 = new Console("Nintendo Gamecube");
		Console c2 = new Console("PlayStation4");
		Console c3 = new Console("Xbox one");
		
		Consoles.add(c1);
		Consoles.add(c2);
		Consoles.add(c3);
	
	Jeu j1 = new Jeu("F1 2021", Consoles);
	Jeu j2 = new Jeu("Fifa 21", Consoles);
	Jeu j3 = new Jeu("Call of duty", Consoles);
	

	Console playstation = new Console ("Playstation");
	Console gameboy = new Console ("gameboy");
	Console xbox = new Console ("xbox");
	Console wii = new Console ("wii");
	
	List <Console> listConsole = new ArrayList();
	listConsole.add(playstation);
	listConsole.add(gameboy);
	
	
	List <Console> listConsole1 = new ArrayList();
	listConsole.add(wii);
	listConsole.add(xbox);
	
	List <Console> listConsole2 = new ArrayList();
	listConsole.add(gameboy);
	listConsole.add(xbox);
	Jeu j = new Jeu("Pokemon",listConsole);
	Jeu j4 = new Jeu("Mario",listConsole1);
	Jeu j5 = new Jeu("Zelda",listConsole2);
	
	
	
	Client c = new Client ("Vince","Dve","Pokemon");
}

	
}
