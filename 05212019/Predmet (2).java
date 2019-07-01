package rs.itbootcamp.gen4.nedelja4.teret;

public class Predmet extends Tovar{
	String vrsta;
	double tezina;
	public Predmet(String vrsta, double tezina) {
		this.vrsta = vrsta;
		this.tezina = tezina;
	}
	@Override
	public String vrsta() {
		return vrsta;
	}

	@Override
	public double tezina() {
		return tezina;
	}

}
