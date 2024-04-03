package fr.eni.annuaire.bo;

public class Adresse {
	
	private long code;
	private String rue;
	private String codepostal;
	private String ville;
	
	//constructor
	public Adresse(long code, String rue, String codepostal, String ville) {
		super();
		this.code = code;
		this.rue = rue;
		this.codepostal = codepostal;
		this.ville = ville;
	}
	
	
	
	@Override
	public String toString() {
		return "Adresse [code=" + code + ", rue=" + rue + ", codepostal=" + codepostal + ", ville=" + ville + "]";
	}



	//getters/setters
	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
}
