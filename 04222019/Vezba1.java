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
		System.out.println("povrsina male:		"+PM+" cm�"+ "	cena: 170din	cm� po dinaru: "+CPDM+"cm�");
		System.out.println("povrsina parceta:	"+PP+" cm�"+ "	cena: 150din	cm� po dinaru: "+CPDP+"cm�");
		if(PP>CPDP) {
			System.out.println("mala pizza je isplativija!");
		}else {
			System.out.println("pizza na parce je isplativija!");
		}
		
	}

}

