package metier;

public class Adresse {
	
	protected int numero;
	protected int rue;
	protected String ville;
	
	
	
	
	
	public Adresse(int numero, int rue, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getRue() {
		return rue;
	}
	public void setRue(int rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", ville=" + ville + "]";
	}
	
	

}
