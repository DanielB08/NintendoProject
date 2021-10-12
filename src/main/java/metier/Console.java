package metier;

public abstract class Console {

	private String nom;
	private String prix;
	private String dateDeSortie;

	public Console(String nom, String prix, String dateDeSortie) {
		this.nom = nom;
		this.prix=prix;
		this.dateDeSortie=dateDeSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
