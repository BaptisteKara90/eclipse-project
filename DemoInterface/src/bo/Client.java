package bo;

import java.util.*;

public class Client {
	private String nom;
	private String prenom;
	private int age;
	
	private List<Empruntable> emprunts;
	
	// Constructor
	public Client(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		emprunts = new ArrayList<Empruntable>();
	}
	
	public void emprunter(Empruntable e) {
		if (emprunts.size()>3) {
			return;
		}
		emprunts.add(e);
	}
	
	public void rendre (Empruntable e) {
		emprunts.remove(e);
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", emprunts=" + emprunts + "]";
	}

	
	
}