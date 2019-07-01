package vezba;

public class Vezba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int CM,PCM,CP,PCP;
		CM=23;
		PCM=170;
		CP=40;
		PCP=150;
		double pi=3.14;
		double PM,CPDM,PP,CPDP;
		PM=CM*CM*pi;
		CPDM=CM*CM*pi/PCM;
		PP=CP*CP/5*pi;
		CPDP=CP*CP/5*pi/PCP;
		System.out.println("povrsina male:		"+PM+" cm²"+ "	cena: 170din	cm² po dinaru: "+CPDM+"cm²");
		System.out.println("povrsina parceta:	"+PP+" cm²"+ "	cena: 150din	cm² po dinaru: "+CPDP+"cm²");
		if(PP>CPDP) {
			System.out.println("mala pizza je isplativija!");
		}else {
			System.out.println("pizza na parce je isplativija!");
		}
		
	}

}

