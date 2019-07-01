package rs.itbootcamp.gen4.nedelja1;

import java.util.Scanner;

public class ServisZaKonobare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dobrodošli u pametni servis za konobare!");
		
		System.out.print("Unsesite porudžbine: ");
		int id = sc.nextInt();
		int pice = 0, hrana = 0;
		while(id!=0) {			
			switch(id) {
				case  1: pice+=60; break;
				case  2: pice+=60; break;
				case  3: pice+=100; break;
				case  4: pice+=120; break;
				case 41: hrana+=250; break;
				case 42: hrana+=240; break;
				case 43: hrana+=290; break;
				default: System.err.println("Greška, željeni id nije u bazi podataka. Pokušajte ponovo");
			}
			id = sc.nextInt();
		}
		
		double zarada_pice = 0.10 * pice;
		double zarada_hrana = 0.15 * hrana;
		
		System.out.printf("ukupno popijeno: %ddin \t zarada: %.0fdin \n", pice, zarada_pice);
		System.out.printf("ukupno pojedeno: %ddin \t zarada: %.0fdin \n", hrana, zarada_hrana);
		System.out.println();
		System.out.printf("ukupna zarada: %.0fdin", zarada_pice + zarada_hrana);
	}

}
