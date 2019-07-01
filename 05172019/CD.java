package bokaRepublika;

public class CD extends AlbumArtikal {

	public CD(Album album, String izdavac, double cena, int kolicina) {
		
		super(album, izdavac, cena, kolicina);
		
	}

	public String ime() {

		String a = getAlbum().getIzvodjac() + '-' + getAlbum().getNaziv() + "(CD)";
		return a;

	}

}
