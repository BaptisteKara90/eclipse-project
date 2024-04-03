package fr.eni.annuaire.bo;

public class Professionnel extends Contact {
	
	private String nomEntreprise;
	
	//constructor
	public Professionnel(long numero, String nom, String telephone, String adresseMail, Adresse adresse,
			String nomEntreprise) {
		super(numero, nom, telephone, adresseMail, adresse);
		this.nomEntreprise = nomEntreprise;
	}
	
	



	@Override
	public String toString() {
		return "[nomEntreprise=" + nomEntreprise + ", getNature()=" + getNature() + ", toString()="
				+ super.toString() + "]";
	}





	//setters/getters
	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}



	@Override
	protected String getNature() {
		return getClass().getSimpleName();
	}
	
	
}
