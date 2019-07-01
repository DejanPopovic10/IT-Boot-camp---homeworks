package vezba;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		/*
		 * kackavalj=2=50 sunka=3=40 pecurke=5=30 cajna=7=40 Capricciosa (kackavalj,
		 * sunka,pecurke) id=2*3*5=30=320rsd Pepperoni (kackavalj, cajna)
		 * id=2*7=14=270rsd Vesuvio (cajna, pecurke, sunka) id=7*5*3=105=310rsd
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 200, i = 0, s = 0, n, id = 1, y = 0;
		System.out.println("Dobrodosli u Brasko++ servis za narucivanje!");
		System.out.println("Koliko sastojaka zelite: ");
		n = sc.nextInt();
		System.out.println("Sastojci: ");
		while (i < n) {
			i += 1;	
			s = sc.nextInt();
			if (s == 2) {
				y = 50;
				sum += y;
			} else if (s == 3) {
				y = 40;
				sum += y;
			} else if (s == 5) {
				y = 30;
				sum += y;
			} else if (s == 7) {
				y = 40;
				sum += y;
			} else {
				System.out.println("Greska, zeljeni sastojak ne postoji u bazi podataka. Pokusajte ponovo .");
				i -= 1;
				s = 1;
				continue;
			}
			id *= s;
		}
		if (id != 30 && id != 105 && id != 14)
			System.out.println("Izabrali ste pizzu Kombinacija. Cena pizze je " + sum);
		switch (id) {
		case 30:
			System.out.print("Izabrali ste pizzu Capricciosa. Cena pizze je 320din. ");
			break;
		case 105:
			System.out.print("Izabrali ste pizzu Vesuvio. Cena pizze je 310din. ");
			break;
		case 14:
			System.out.print("Izabrali ste pizzu Pepperoni. Cena pizze je 290din. ");
			break;
		}
	}
}
