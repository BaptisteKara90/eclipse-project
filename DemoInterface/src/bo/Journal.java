package bo;

import java.time.LocalDate;

public class Journal extends Document{
	
	private LocalDate dateParution;

	
	// Constructor
	public Journal(String titre, LocalDate dateParution) {
		super(titre);
		this.dateParution = dateParution;
	}
	
	
}
