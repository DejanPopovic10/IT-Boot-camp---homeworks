package kargo;

import java.util.LinkedList;

public class Kamion {
	private String regBroj;
	private double nosivost;
	private double teret;
	private LinkedList<Tovar> prikolica;

	public Kamion(String regBroj, double nosivost) {
		super();
		this.regBroj = regBroj;
		this.nosivost = nosivost;
		this.teret = teret;
		prikolica = new LinkedList<Tovar>();
	}

	public boolean stavi(Tovar x) {
		double sum = 0;
		for (int i = 0; i < prikolica.size(); i++) {
			sum += prikolica.get(i).tezina();
		}
		if (sum + x.tezina() < nosivost)
			prikolica.addLast(x);

		return true;
	}

	public void stavi() {

		prikolica.removeLast();
	}

	public String getRegBroj() {
		return regBroj;
	}

	public void setRegBroj(String regBroj) {
		this.regBroj = regBroj;
	}

	public double getNosivost() {
		return nosivost;
	}

	public void setNosivost(double nosivost) {
		this.nosivost = nosivost;
	}

	public double getTeret() {
		double teret=0;
		for (int i = 0; i < prikolica.size(); i++) {
		teret+=prikolica.get(i).tezina();
		}
		return teret;
	}

	public void setTeret(double teret) {
		this.teret = teret;
	}

	public String toString() {
		String s = regBroj + "(" + getTeret() + '/' + nosivost + ")\n";
		for (int i = 0; i < prikolica.size(); i++) {
			s += "\t" + prikolica.get(i).toString()+ "\n";
		}
		return s;
	}

}
