package kazaliste;

public abstract class Zaposleni {

	private String ime;
	private Pozoriste pozoriste;

	public Zaposleni(String ime, Pozoriste pozoriste) {
		super();
		this.ime = ime;
		this.pozoriste = pozoriste;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public void setPozoriste(Pozoriste pozoriste) {
		this.pozoriste = pozoriste;
	}

	public abstract String imePosla();

	public String toString() {

		String s = ime + "(" + imePosla() + ", ";
		s += pozoriste.getSkraceniNaziv() + ")";
		return s;
	}

}
