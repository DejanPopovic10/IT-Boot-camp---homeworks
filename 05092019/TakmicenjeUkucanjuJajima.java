package drugaNedelja;

import java.util.Scanner;

public class TakmicenjeUkucanjuJajima {

	public static void sortiraj(double[] jacina) {
		for (int i = 0; i < jacina.length - 1; i++) {
			double max = jacina[i];
			int pozicija = i;
			for (int j = i + 1; j < jacina.length; j++) {
				if (jacina[j] > max) {
					max = jacina[j];
					pozicija = j;
				}
			}
			jacina[pozicija] = jacina[i];
			jacina[i] = max;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj takmicara:");
		int brPol = s.nextInt();
		int[] indeks = new int[brPol];
		int[] duplikat = new int[brPol];
		double jacina[] = new double[brPol];
		double kopija[] = new double[brPol];
		if (brPol < 3) {
			System.out.println("Greska. Broj takmicara mora da bude veci od 3.");
		} else {
			for (int i = 0; i < brPol; i++) {
				int id = s.nextInt();
				indeks[i] = id;
				duplikat[i] = id;
				double jaja = s.nextDouble();
				jacina[i] = jaja;
				kopija[i] = jaja;
			}
			sortiraj(jacina);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < kopija.length; j++) {
					if (jacina[i] == kopija[j]) {
						indeks[i] = duplikat[j];
					}

				}
				System.out.println(
						i + 1 + " mesto osvojio je takmicar " + indeks[i] + " sa jacinom jajeta! " + jacina[i]);
			}
		}
	}
}
