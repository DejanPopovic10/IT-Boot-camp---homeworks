package bokaRepublika;

public abstract class Artikal {
	private int id;
	private double cena;
	private int kolicina;
	public static int IDglobal = 1;

	public Artikal(double cena, int kolicina) {
		super();
		id = IDglobal;
		IDglobal++;
		this.cena = cena;
		this.kolicina = kolicina;

	}

	public boolean kupi() {
		if (kolicina == 0) {

			return false;
		} else
			kolicina--;
		return true;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public abstract String ime();

	public String toString() {
		String s = "#" + id + ": " + ime() + " - " + cena + " [kol: " + kolicina + "]";
		return s;
	}

}
