package rs.itbootcamp.gen4.nedelja2;

import java.util.Scanner;

public class TakmicenjeJaja {
	public static void main(String[] args) {
		final int br_mesta = 3; //konstantna vrednost
		Scanner sc = new Scanner(System.in);
		
		int broj = sc.nextInt();

		double[] jaja = new double[broj];
		int[] id = new int[broj];
		
		//učitaj jaja
		for(int i=0; i<broj;i++){
			id[i]=sc.nextInt();
			jaja[i]=sc.nextDouble();
		}
		
		//mali rečnik naziva, omogućava pramaetrizovani ispis :)
		String[] nazivi = {"Prvo", "Drugo", "Treće", "Četvrto", "Peto", "Šesto", "Sedmo", "Osmo", "Deveto"};
		
		//sortiramo jaja
		for (int i = 0; i < jaja.length; i++){
			int max = i;
			for(int j = i+1; j < jaja.length; j++) {
				if(jaja[max] < jaja[j])
					max = j;
			}

			//zamena jaja
			double tmp_jaja = jaja[i];
			jaja[i] = jaja[max];
			jaja[max] =  tmp_jaja;
			//zamena id-eva
			int tmp_id = id[i];
			id[i] = id[max];
			id[max] = tmp_id;
		}

		//stampamo
		for (int i=0;i<br_mesta;i++)
			System.out.println(nazivi[i] + " mesto odneo je takmičar #" + id[i] + "  sa jačinom jajeta " + jaja[i]);
	}
}
