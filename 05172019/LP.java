package bokaRepublika;

public class LP extends AlbumArtikal {

	private int tezina;

	public LP(Album album,String izdavac,double cena, int kolicina, int tezina) {
		
		super(album, izdavac, cena, kolicina);
		this.tezina = tezina;
	}

	public String ime() {

		String a = getAlbum().getIzvodjac() + '-' + getAlbum().getNaziv();
		a += "("  + tezina + "g LP)";

		return a;

	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

}
