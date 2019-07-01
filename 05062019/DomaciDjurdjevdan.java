package vezba;

import java.util.Scanner;

public class DomaciDjurdjevdan {

	public static void main(String[] args) {		
		System.out.println("Dobrodosli u Brasko++ pametnu kasu!");
		Scanner sc = new Scanner(System.in);
		int musterija = 0; int n=0; int sumn=0; int cena = 0; int sum=0; int gratis=1;
		int pica=0; int popustCappriciosa=0; int popustVesuvio=0; int popustSvePice=0;
		boolean izlaz=false;
		System.out.println("Koji je danas dan (Pon/Uto/Sre/Cet/Pet/Sub/Ned):");
			while (izlaz==false) {
			String dan = sc.next();
			if (dan.equals ("Uto")) {popustVesuvio=1; izlaz=true;
			}else if (dan.equals ("Cet")) {popustCappriciosa=1; izlaz=true;
			}else if (dan.equals ("Sub") || dan.equals ("Ned") ) {popustSvePice=1; izlaz=true;
			}else if (dan.equals ("Pon") || dan.equals ("Uto") || dan.equals ("Sre") || dan.equals ("Cet") || dan.equals ("Pet") || dan.equals ("Sub") || dan.equals ("Ned")){
			izlaz=true;
		}
			else 	{System.out.println("Greska u unosu. Pokusajte ponovo: " ); izlaz=false;
			}
			}
			while (n!=-1) {
				sum=0;
				musterija++;			
				System.out.println("Musterija "+musterija);
				n=sc.nextInt();
				for (int i=1; i<n+1; i++) {						
					int id=sc.nextInt();
					sumn++;					
					if (id!=2 && id!=3 && id!=5) n=-1;
					if (sumn%7==0) { gratis = 0;
					System.out.println("Akcija 7 ");
					}else if (i%4==0) {gratis = 0;
					System.out.println("Akcija 3+1 ");
					}else {gratis=1;					
					}if (popustCappriciosa==1) {
						if (id==2) {
					cena=(320-320/10)*gratis; 					
					System.out.println("Pizza Capricciosa " +cena);
					}
					}else {
						if (id==2) {
							cena=320*gratis;
					System.out.println("Pizza Capricciosa " +cena);					
						}
					}if (popustVesuvio==1) {
						if (id==5) {
					cena=(290-290/10)*gratis; 					
					System.out.println("Pizza Vesuvio " +cena);}
					}else {
						if (id==5) {
							cena=290*gratis;
					System.out.println("Pizza Vesuvio " +cena);					
						}
					}
					if (id==3) {cena=310*gratis;
					System.out.println("Pizza Pepperoni " +cena);
					}sum+=cena;
				}if (popustSvePice==1) {sum=sum-(sum/100*15);
				System.out.println("Ukupno "+sum);
				}else {System.out.println("Ukupno "+sum);					
					}															
			}		
		}
		}



