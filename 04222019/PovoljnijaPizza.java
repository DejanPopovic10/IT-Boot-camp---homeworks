package rs.itbootcamp.gen4.nedelja1;

public class PovoljnijaPizza {
	public static void main(String[] args) {
		//pocetni podaci (parce je petina velike)
		int r_male = 23, c_male = 170;
		int r_velike = 40, c_velike = 750;
		int r_parceta = 40, c_parceta = 150;
		
		//moze i fiksno 3.14 kao u zadatku
		double p_male = r_male * r_male * Math.PI;
		double p_velike = r_velike * r_velike * Math.PI;
		double p_parceta = r_parceta * r_parceta * Math.PI / 5;	
		
		//cpd: cena po dinaru
		double cpd_male = p_male / c_male;
		double cpd_velike = p_velike / c_velike;
		double cpd_parceta = p_parceta / c_parceta;
		
		//ispis rezultata
		System.out.printf("povrsina male:    \t %.2f \t cena: %ddin \t cm² po dinaru: %.2fcm² \n", p_male, c_male, cpd_male);
		System.out.printf("povrsina parčeta: \t %.2f \t cena: %ddin \t cm² po dinaru: %.2fcm² \n", p_parceta, c_parceta, cpd_parceta);
		
		if(cpd_parceta > cpd_male) {
			System.out.println("parče pizza je isplativije");
		}else
			System.out.println("mala pizza je isplativija");
	}
}	
