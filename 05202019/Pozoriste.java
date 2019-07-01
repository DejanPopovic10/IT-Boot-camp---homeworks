package kazaliste;

public class Pozoriste {

	private int id;
	private String ime;
	public static int idGlobal = 1;

	public Pozoriste(String ime) {

		id = idGlobal++;
		this.ime = ime;
	}

	public int getId() {
		return id;
	}

	public String getIme() {
		return ime;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String toString() {
		String s = ime + "[" + id + "]";

		return s;
	}

	public String getSkraceniNaziv() {

		String[] nizReci = ime.split(" ");
		String skracenica = "";
		for (int i = 0; i < nizReci.length; i++) {
			skracenica += nizReci[i].toUpperCase().charAt(0);
		}
		return skracenica;

	}
}