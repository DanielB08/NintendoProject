package metier;

import java.util.List;

public class Jeu {

	private String titre;
	private List <Console> console;
	
	
	public Jeu(String titre, List<Console> console) {
		super();
		this.titre = titre;
		this.console = console;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


<<<<<<< Updated upstream
	public List<Console> getConsole() {
=======
	public Console getConsole() {
>>>>>>> Stashed changes
		return console;
	}


<<<<<<< Updated upstream
	public void setConsole(List<Console> console) {
=======
	public void setConsole(Console console) {
>>>>>>> Stashed changes
		this.console = console;
	}


	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", console=" + console + "]";
	}
	
}
