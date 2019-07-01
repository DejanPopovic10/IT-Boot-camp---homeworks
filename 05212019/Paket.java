package kargo;

import java.util.LinkedList;

public class Paket extends Tovar {

	private LinkedList<Tovar> sanduk;

	public Paket() {
		super();
		sanduk = new LinkedList<Tovar>();
	}

	public void dodaj(Tovar x) {
		sanduk.add(x);
	}

	public double tezina() {

		double t = 0;
		for (int i = 0; i < sanduk.size(); i++) {
			t += sanduk.get(i).tezina();
			
		}
		return t;
	}

	public String vrsta() {

		String s = "paket" + '[';
		for (int i = 0; i < sanduk.size(); i++) {
			s += sanduk.get(i).vrsta();
		}
		s += ']';
		return s;
	}

}
