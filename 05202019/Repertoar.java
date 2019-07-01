package kazaliste;

import java.util.LinkedList;

public class Repertoar {
	private Pozoriste pozoriste;
	private LinkedList<Predstava> predstave;

	public Repertoar(Pozoriste pozoriste) {

		this.pozoriste = pozoriste;
		predstave = new LinkedList<Predstava>();
	}

	public void dodaj(Predstava x) {
		predstave.add(x);
	}

	public void ukloni(String x) {

		predstave.remove(x);

	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public void setPozoriste(Pozoriste pozoriste) {
		this.pozoriste = pozoriste;
	}

	public String toString() {
		String s = pozoriste + ": [";
		for (int i = 0; i < predstave.size(); i++) {
			s += "\n\t" + predstave.get(i).toString();
		}
		return s+="\n]";

	}

}
