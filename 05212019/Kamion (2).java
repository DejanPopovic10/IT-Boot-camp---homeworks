package rs.itbootcamp.gen4.nedelja4.teret;

import java.util.LinkedList;
import java.util.List;

public class Kamion {
	private String regBroj;
	private List<Tovar> tovar;
	private double nosivost;
	private double teret;
	
	public Kamion(String regBroj, double nosivost) {
		this.regBroj = regBroj;
		this.nosivost = nosivost;
		this.tovar = new LinkedList<Tovar>();
	}
	
	public boolean stavi(Tovar t) {
		if(teret + t.tezina() > nosivost)
			return false;
		
		tovar.add(t);
		teret += t.tezina();
		return true;
	}
	
	public void skini() {
		int index = tovar.size()-1; //nadjemo index poslednjeg
		if(index >= 0) {
			teret -= tovar.get(index).tezina();
			tovar.remove(index);
		}
	}
	public String toString() {
		String buffer =  String.format("%s(%.2f/%.2f)", regBroj, teret, nosivost);
		for(int i=0;i<tovar.size();i++) {
			buffer += "\n  " + tovar.get(i).toString();
		}
		return buffer;
	}
}
