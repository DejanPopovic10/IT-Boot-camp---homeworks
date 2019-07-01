package ptt;

public class PoljaPisma {
	private String posaljilac;
	private String primalac;
	private int postanskiBroj;
	private double tezina;
	private boolean prioritetno;

	public PoljaPisma (String po, String pr, int p, double t, boolean prioritet ) {
		po=posaljilac;
		pr=primalac;
		p=postanskiBroj;
		t=tezina;
		prioritet=prioritetno;
	}

	public String getPosaljilac() {
		return posaljilac;
	}

	public void setPosaljilac(String posaljilac) {
		this.posaljilac = posaljilac;
	}

	public String getPrimalac() {
		return primalac;
	}

	public void setPrimalac(String primalac) {
		this.primalac = primalac;
	}

	public int getPostanskiBroj() {
		return postanskiBroj;
	}

	public void setPostanskiBroj(int postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}

	public double getTezina() {
		return tezina;
	}

	public void setTezina(double tezina) {
		this.tezina = tezina;
	}

	public boolean isPrioritetno() {
		return prioritetno;
	}

	public void setPrioritetno(boolean prioritetno) {
		this.prioritetno = prioritetno;
	}
	public double Cena(double P) {
		if (this.tezina<20) {
			P=23;
		}else if (this.tezina>=2 && this.tezina<100) {
			P=35;
		}else if (this.tezina>=101 && this.tezina<250) 
			P=46;
		else if (this.tezina>=251 && this.tezina<500) {
			P=81;
		}else if (this.tezina>=501 && this.tezina<1000) {
			P=92;
		}else if (this.tezina>=1001 && this.tezina<2000) {
			P=127;
				
		}if (prioritetno==true) {
			P=+46;
		}
		return P;
	}
	public String toString() {
		String st= "Posaljilac -> " + posaljilac;
		st+="Primalac->" + primalac + ":\n " + postanskiBroj+ ", "+ tezina;		
		if (prioritetno== true) st+= "\nprioritetno je je.";
		else st+= "";
		return st;
	}
}


