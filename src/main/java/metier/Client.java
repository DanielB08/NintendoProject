package metier;

public class Client {

		private String name;
		private String prenom;
		private String listeDeJeu;
		
		public Client() {
			
		}

		public Client(String name, String prenom, String listeDeJeu) {
			super();
			this.name = name;
			this.prenom = prenom;
			this.listeDeJeu = listeDeJeu;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getListeDeJeu() {
			return listeDeJeu;
		}

		public void setListeDeJeu(String listeDeJeu) {
			this.listeDeJeu = listeDeJeu;
		}

		@Override
		public String toString() {
			return "Client [name=" + name + ", prenom=" + prenom + ", listeDeJeu=" + listeDeJeu + "]";
		}
}
