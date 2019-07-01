package rs.itbootcamp.gen4.nedelja4.teret;

import java.util.LinkedList;
import java.util.List;

public class Paket extends Tovar{
	List<Tovar> tovar;
	public Paket() {
		tovar =  new LinkedList<Tovar>();
	}
	public void dodaj(Tovar t) {
		tovar.add(t);
	}
	@Override
	public String vrsta() {
		String buffer = "paket[";
		for(int i=0;i<tovar.size();i++) 
			buffer += tovar.get(i).vrsta() + ",";
		buffer = buffer.substring(0,buffer.length()-1) + "]"; //menjamo poslednji ',' karakterom ']'
		return buffer;
	}

	@Override
	public double tezina() {
		double tezina = 0;
		for(int i=0;i<tovar.size();i++)
			 tezina += tovar.get(i).tezina();
		return tezina;
	}

}
