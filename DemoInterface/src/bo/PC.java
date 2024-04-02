package bo;

public class PC implements Empruntable {
	private String marque;
	private String type;
	private String disqueDur;
	private String gpu;
	private String cpu;
	
	
	//Constructor
	public PC(String marque, String type, String disqueDur, String gpu, String cpu) {
		super();
		this.marque = marque;
		this.type = type;
		this.disqueDur = disqueDur;
		this.gpu = gpu;
		this.cpu = cpu;
	}

	
	

	@Override
	public String toString() {
		return "PC [marque=" + marque + ", type=" + type + ", disqueDur=" + disqueDur + ", gpu=" + gpu + ", cpu=" + cpu
				+ "]";
	}




	//Getter/Setter
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDisqueDur() {
		return disqueDur;
	}

	public void setDisqueDur(String disqueDur) {
		this.disqueDur = disqueDur;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}



	
	
	
}
