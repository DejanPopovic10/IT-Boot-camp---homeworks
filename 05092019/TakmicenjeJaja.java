package rs.itbootcamp.gen4.nedelja2;

import java.util.Scanner;

public class TakmicenjeJaja {
	public static void main(String[] args) {
		final int br_mesta = 3; //konstantna vrednost
		Scanner sc = new Scanner(System.in);
		
		int broj = sc.nextInt();
		double[] jaja = new double[broj];
		
		//učitaj jaja
		for(int i=0; i<broj;i++)
			jaja[sc.nextInt()]=sc.nextDouble();
		
		//mali rečnik naziva, omogućava pramaetrizovani ispis :)
		String[] nazivi = {"Prvo", "Drugo", "Treće", "Četvrto", "Peto", "Šesto", "Sedmo", "Osmo", "Deveto"};
		
		for (int i = 0; i < br_mesta; i++){
			int max = 0; //neka je max 0
			for(int j=0; j < jaja.length; j++) {
				if(jaja[max] < jaja[j])
					max = j;
			}
		    System.out.println(nazivi[i] + " mesto odneo je takmičar #" + max + "  sa jačinom jajeta " + jaja[max]);
		    jaja[max] = -1; // negativna vrednost nikada vise ne moze biti maksimalna
		}
	}
}
