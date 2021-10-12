package metier;

import java.util.List;

public class Boutique {
	
	private String nom;
	private Adresse adresseBoutique;
	private List <Jeu> stockJeux;
	
	public Boutique(String nom, Adresse adresseBoutique, List<Jeu> stockJeux) {
		super();
		this.nom = nom;
		this.adresseBoutique = adresseBoutique;
		this.stockJeux = stockJeux;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Adresse getAdresseBoutique() {
		return adresseBoutique;
	}
	public void setAdresseBoutique(Adresse adresseBoutique) {
		this.adresseBoutique = adresseBoutique;
	}
	public List<Jeu> getStockJeux() {
		return stockJeux;
	}
	public void setStockJeux(List<Jeu> stockJeux) {
		this.stockJeux = stockJeux;
	}
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresseBoutique=" + adresseBoutique + ", stockJeux=" + stockJeux + "]";
	}
	
	

}
