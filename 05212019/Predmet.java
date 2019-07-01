package kargo;

public class Predmet extends Tovar {

	private String vrsta;
	private double tezina;

	public Predmet(String vrsta, double tezina) {
		super();
		this.vrsta = vrsta;
		this.tezina = tezina;
	}

	public String vrsta() {
		String s = vrsta;
		return s;
	}

	public double tezina() {
		
		double s = tezina;
		return s;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public double getTezina() {
		return tezina;
	}

	public void setTezina(double tezina) {
		this.tezina = tezina;
	}

}
