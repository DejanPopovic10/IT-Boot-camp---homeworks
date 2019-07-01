package bokaRepublika;

import java.util.LinkedList;

public class Prodavnica {
	private String ime;
	private String lokacija;
	private LinkedList<Artikal> inventar;

	public Prodavnica(String ime, String lokacija) {
		super();
		this.ime = ime;
		this.lokacija = lokacija;
		inventar = new LinkedList<Artikal>();
	}

	public LinkedList<Artikal> pretrazi(String zelja) {
		LinkedList<Artikal> ponuda = new LinkedList<Artikal>();
		for (int i = 0; i < inventar.size(); i++) {
			String a= zelja.toLowerCase();
			String b= inventar.get(i).ime().toLowerCase();
			if (b.contains(a))
				ponuda.add(inventar.get(i));
		}
		return ponuda;

	}

	public void dodaj (Artikal n) {

		inventar.add(n);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getLokacija() {
		return lokacija;
	}

	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < inventar.size(); i++) {
			str+=inventar.get(i).toString() + "\n\t";
		}
		String st = ime + ' ' + lokacija + " [" + "\n\t" + str  + "]";
		
		return st;

	}
}
