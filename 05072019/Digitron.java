package vezba;

public class Digitron {
	public static double sabiranje (double a, double b) {	
		double rezultat=a+b;
		return rezultat;
	}
	public static double oduzimanje (double a, double b) {	
		double rezultat=a-b;
		return rezultat;
	}
	public static double mnozenje (double a, double b) {	
		double rezultat=a*b;
		return rezultat;
	}
	public static double deljenje (double a, double b) {	
		double rezultat=a/b;
		return rezultat;
	}
	public static int dizanjeNaStepen (int a, int b) {	
		int rezultat =a;

        for (int x=2; x<=b; x++){
            rezultat *= a;
        }
		return rezultat; 
	}
	public static int faktorijel (int a) {
			int rezultat=a;
		for(int i=1;i<=a;i++){    
			rezultat=rezultat*i; 
		}
		return rezultat;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
