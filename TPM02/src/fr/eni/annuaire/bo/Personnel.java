package fr.eni.annuaire.bo;

import java.time.*;

public class Personnel extends Contact {
	
	private LocalDate dateAnniversaire;

	
	
	public Personnel(long numero, String nom, String telephone, String adresseMail, Adresse adresse,
			LocalDate dateAnniversaire) {
		super(numero, nom, telephone, adresseMail, adresse);
		this.dateAnniversaire = dateAnniversaire;
	}



	public int getAge() {
		LocalDate today = LocalDate.now();
		Period age = Period.between(dateAnniversaire, today);
		return age.getYears();
	}



	@Override
	protected String getNature() {
		return getClass().getSimpleName();
	}



	@Override
	public String toString() {
		return "[dateAnniversaire=" + dateAnniversaire + ", getNature()=" + getNature() + ", toString()="
				+ super.toString() + "]";
	}




	
	
}
