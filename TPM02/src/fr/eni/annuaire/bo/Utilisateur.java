package fr.eni.annuaire.bo;

public class Utilisateur {
	
	private int id;
	private String nom;
	private String pseudo;
	private String motPasse;
	
	
	//Constructor
	public Utilisateur(int id, String nom, String pseudo, String motPasse) {
		super();
		this.id = id;
		this.nom = nom;
		this.pseudo = pseudo;
		this.motPasse = motPasse;
	}


	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", pseudo=" + pseudo + ", motPasse=" + motPasse + "]";
	}

	
	//getter/setter

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getMotPasse() {
		return motPasse;
	}


	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	
	
	
}
