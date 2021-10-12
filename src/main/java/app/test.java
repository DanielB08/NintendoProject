package app;

import java.util.ArrayList;
import java.util.List;

import metier.Client;
import metier.Console;
import metier.Jeu;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		Jeu j1 = new Jeu("Mario",listConsole1);
		Jeu j2 = new Jeu("Zelda",listConsole2);
		
		
		Client c = new Client ("Vince","Dve","Pokemon");
	}

}
