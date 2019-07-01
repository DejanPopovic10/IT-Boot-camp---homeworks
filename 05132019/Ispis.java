package ptt;

import java.util.Scanner;

public class Ispis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Dobrodošli u pametni sistem pošte!");
		System.out.println("------------------------------------");
		System.out.println("Unesite pristigla pisma: ");
		String kraj = "";
		int i = 0;
		while (!kraj.equals("stop")) {
			i++;
			String ime = s.next();
			String prezime = s.next();
			int broj = s.nextInt();
			double gram = s.nextDouble();
			boolean hitnost = s.nextBoolean();

			System.out.println("Ako zelite novi unos, stisnite enter, u suprotnom otkucajte stop");
			kraj = s.next();

			PoljaPisma a = new PoljaPisma(ime, prezime, broj, gram, hitnost);
			a.setPosaljilac(ime);
			a.setPrimalac(prezime);
			a.setPostanskiBroj(broj);
			a.setTezina(gram);
			a.setPrioritetno(hitnost);
		}
		System.out.println("Unesite poštanski br. grada:");
		Pismo q = new Pismo(i);
		int zadata = s.nextInt();
		
		System.out.println(q.dohvatiGrad(zadata));
	}

}
