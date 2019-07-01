package rs.itbootcamp.gen4.nedelja4.teret;

public abstract class Tovar {
	public abstract String vrsta();
	public abstract double tezina();
	public String toString() {
		return String.format("%s(%.2f)", vrsta(), tezina());
	}
}
