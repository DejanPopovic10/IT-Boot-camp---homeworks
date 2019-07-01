package kargo;

public abstract class Tovar {
	public abstract String vrsta();

	public abstract double tezina();

	public String toString() {
		String s = vrsta() + '(' + tezina() + ')';
		return s;
	}

}
