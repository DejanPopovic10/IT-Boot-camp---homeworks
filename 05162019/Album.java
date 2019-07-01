package kalibar;

import java.util.Date;
import java.util.LinkedList;

public class Album {
	private String naziv;
	private String izvodjac;
	private Date datum;
	private LinkedList<Numera> kancona;

	public Album(String naziv, String izvodjac, Date datum) {
		super();
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		kancona = new LinkedList<Numera>();
	}

	public void dodajNumeru(Numera n) {

		kancona.add(n);
	}

	public void dodaj(String name, String trajanje) {

		Numera m = new Numera(name, getIzvodjac(), trajanje);

		kancona.add(m);
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}

	public String getTrajanje() {

		int SumMin = 0;
		int SumSek = 0;
		for (int i = 0; i < kancona.size(); i++) {
			String S = kancona.get(i).getTrajanje();
			String[] vremena = S.split(":");
			SumMin += Integer.parseInt(vremena[0]);
			SumSek += Integer.parseInt(vremena[1]);
		}
		SumSek = SumSek % 60;
		SumMin = (SumMin + SumSek / 60) + 1;

		return SumMin + ":" + SumSek;

	}

	public Date getDatum() {

		return datum;
	}

	public Numera vratiPoBroju(int index) {

		Numera p = kancona.get(index);

		return p;
	}

	public Numera vratiPoNazivu(String ime) {
		Numera a = new Numera("", "", "");
		for (int i = 0; i < kancona.size(); i++)
			if (kancona.get(i).getNaziv().equals(ime))
				a = kancona.get(i);
		return a;
	}

	public String uzmiString() {
		String buffer = "";
		for (int i = 0; i < kancona.size(); i++) {
			buffer += "\n\t" + kancona.get(i).toString();
		}

		return buffer;

	}

	public String toString() {

		String st = izvodjac + " - " + naziv + " (" + datum.getYear();
		st += ") :[" + "\n\t" + uzmiString() + "]:";
		st += getTrajanje() + "\n\t\n\t";
		return st;
	}
}