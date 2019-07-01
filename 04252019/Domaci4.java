package vezba;

import java.util.Scanner;

public class Domaci4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p, id = 1;
		double t, q = 0, pc = 0, bac = 0, procenat = 0, a = 0, b = 0;
		boolean c = id != -1;
		System.out.println("Dobrodošli u alko aproksimator 9000!");
		System.out.println("Unesite vašu težinu (kg): ");
		t = sc.nextDouble();
		System.out.println("Unesite vaš pol (M:0/Ž:1): ");
		p = sc.nextInt();
		while (c) {			
			if (p != 1 && p != 0) {
				break;
			}
			System.out.println("Šta ste i koliko popili (id_pica kolicina_u_ml):");
			id = sc.nextInt();
			if (id == -1) {
				break;
			} else if (id == 0) {
				pc = sc.nextDouble();
			 
			} if (id == 0) {
				a = pc * q;
				b += pc * q / 100;
			} else if (id == 1) {
				pc = 50;
				a = pc * q;
				b += 50 * q / 100;
			} else if (id == 2) {
				pc = 40;
				a = pc * q;
				b += 40 * q / 100;
			} else if (id == 3) {
				pc = 4.7;
				a = pc * q;
				b += 4.7 * q / 100;
			} else if (id == 4) {
				pc = 11;
				a = pc * q;
				b += 11 * q / 100;
			} else {
				System.out.println("Greška, željeni id nije u bazi podataka. Pokusajte ponovo");t=0; p=0;id=0;
				break; 
			}q = sc.nextDouble();

			if (p == 0) {
				bac = b / (t * 1000 * 0.68) * 1000;
			} else if (p == 1) {
				bac = b / (t * 1000 * 0.55) * 1000;
			}
		}
		if (bac > 0.2 && bac < 0.51) {
			System.out.println("BAC: " + bac + " - Umerena alkoholisanost");
			System.out.println("Kazna: 10 000 rsd");
			System.out.println("Kazneni poeni: 0");
			System.out.println("Zabrana voznje: 0");
			System.out.println("Uzmite autobus");
		} else if (bac > 0.5 && bac < 0.81) {
			System.out.println("BAC: " + bac + " - Srednja alkoholisanost");
			System.out.println("Kazna: 10 000 - 20 000 rsd");
			System.out.println("Kazneni poeni: 6");
			System.out.println("Zabrana voznje: 3");
			System.out.println("Uzmite autobus");
		} else if (bac > 0.8 && bac < 1.21) {
			System.out.println("BAC: " + bac + " - Visoka alkoholisanost");
			System.out.println("Kazna: 20 000 - 40 000 rsd");
			System.out.println("Kazneni poeni: 8");
			System.out.println("Zabrana voznje: 4");
			System.out.println("Uzmite autobus");
		} else if (bac > 1.20 && bac < 1.61) {
			System.out.println("BAC: " + bac + " - Teska alkoholisanost");
			System.out.println("Kazna: 100 000 - 120 000 rsd");
			System.out.println("Kazneni poeni: 9");
			System.out.println("Zabrana voznje: 8");
			System.out.println("Uzmite autobus");
		} else if (bac > 1.6 && bac < 2.1) {
			System.out.println("BAC: " + bac + " - Teska alkoholisanost");
			System.out.println("Kazna: 100 000 - 120 000 rsd");
			System.out.println("Kazneni poeni: 14");
			System.out.println("Zabrana voznje: 8");
			System.out.println("Uzmite autobus");
		} else if (bac > 2) {
			System.out.println("BAC: " + bac + " - Potpuna alkoholisanost");
			System.out.println("Kazna: 30 - 60 dana zatvora");
			System.out.println("Kazneni poeni: 15");
			System.out.println("Zabrana voznje: 9");
			System.out.println("Uzmite autobus");
		}

		{

		}

	}

}
