package vezba;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		/*
		 * 1=id rakija=60 rsd 41=id gurmanska pljeskavica=250 rsd 2=id vinjak=60 rsd
		 * 42=id cevapi na kajmaku=240 rsd 3=id pivo=100 rsd 43=id bela vesalica=240 rsd
		 * 4=id sok=120 rsd
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int por = 1, y = 0, sump = 0, sumj = 0, pp = 0, pj = 0, uz = 0;
		System.out.println("Dobrodosli u pametni servis za konobare!");
		System.out.println("Unesite porudzbine:");
		while (por > 0) {
			por = sc.nextInt();
			if (por == 0) {
				break;

			} else if (por == 1 || por == 2) {
				y = 60;
				sump += y;
			} else if (por == 3) {
				y = 100;
				sump += y;
			} else if (por == 4) {
				y = 120;
				sump += y;
			} else if (por == 41) {
				y = 250;
				sumj += y;
			} else if (por == 42) {
				y = 240;
				sumj += y;
			} else if (por == 43) {
				y = 290;
				sumj += y;

			} else {
				System.out.println("Greska, zeljeni id nije u bazi podataka. Pokušajte ponovo");
				y = 0;
				uz = 0;
				sump = 0;
				sumj = 0;
				continue;
			}
			pp = sump / 10;
			pj = sumj * 5 / 100;
			uz = pp + pj;
		}
		if (sump > 0) {
			System.out.println("ukupno popijeno: " + sump + " zarada: " + pp);
		}
		if (sumj > 0) {
			System.out.println("ukupno pojedeno: " + sumj + " zarada: " + pj);
		}
		if (uz > 0) {
			System.out.println("ukupna zarada: " + uz);
		}
	}
}