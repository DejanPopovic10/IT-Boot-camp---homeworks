package kazaliste;

import java.util.LinkedList;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private LinkedList<Zaposleni> radnici;

	public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {

		this.naziv = naziv;
		this.pozoriste = pozoriste;
		int brojacReditelja = 0;
		radnici = new LinkedList<Zaposleni>();
		for (int i = 0; i < radnici.size(); i++) {
			if (radnici.get(i).getIme().equals(reditelj.imePosla()))
				;
			brojacReditelja++;
		}
		if (brojacReditelja < 1 && reditelj.getPozoriste().equals(pozoriste))
			radnici.add(reditelj);
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public void setPozoriste(Pozoriste pozoriste) {
		this.pozoriste = pozoriste;
	}

	public boolean dodaj(Kostimograf x) {
		int brojacKostimografa = 0;
		for (int i = 0; i < radnici.size(); i++) {
			if (radnici.get(i).getIme().equals(x.imePosla()))
				;
			brojacKostimografa++;
		}
		if (brojacKostimografa < 2 && x.getPozoriste().equals(pozoriste))
			radnici.add(x);

		return true;

	}

	public boolean dodaj(Glumac x) {

		if (x.getPozoriste().equals(pozoriste))
			radnici.add(x);

		return true;
	}

	public String toString() {

		String st = naziv + ":";
		for (int i = 0; i < radnici.size(); i++) {

			st += "\n\t\t" + radnici.get(i).toString();

		}
		return st;
	}

}
