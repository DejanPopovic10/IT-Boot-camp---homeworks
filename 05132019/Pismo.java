package ptt;

public class Pismo {
	private PoljaPisma[] sanduk;

	public Pismo(int broj) {
		// TODO Auto-generated constructor stub
		sanduk=new PoljaPisma[broj];
	}

	public PoljaPisma dohvatiGrad(int zadata) {
		
		int j=0;
		for (int i = 0; i < sanduk.length; i++) {
			
			if (sanduk[i].getPostanskiBroj() == zadata) {
				j++;	
			}
			
		}PoljaPisma [] gradNiz=new PoljaPisma [j];
		for (int i = 0; i < sanduk.length ; i++) {
			if (sanduk[i].getPostanskiBroj() == zadata) {
				
				gradNiz[i]=sanduk[i];
			}
		}
		for(int i=0; i<gradNiz.length;i++) {
			
			System.out.println("gradNiz[i].toString()");
		}
		return  gradNiz[zadata];
				
		


		
}
}