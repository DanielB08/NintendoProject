package metier;

import java.util.List;

public class Client {

		private String name;
		private String prenom;
		private List <Achat> listeAchat;
		
		public Client() {
			
		}

		public Client(String name, String prenom, List<Achat> listeAchat) {
			super();
			this.name = name;
			this.prenom = prenom;
			this.listeAchat = listeAchat;
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

		public List<Achat> getListeAchat() {
			return listeAchat;
		}

		public void setListeAchat(List<Achat> listeAchat) {
			this.listeAchat = listeAchat;
		}

		@Override
		public String toString() {
			return "Client [name=" + name + ", prenom=" + prenom + "]";
		}


}
