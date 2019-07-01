package rs.itbootcamp.gen4.nedelja3.muzika;

public class CD extends AlbumArtikal {

	public CD(Album album, String izdavac, int cena, int kolicina) {
		super(album, izdavac, cena, kolicina);
	}

	@Override
	public String ime() {
		return String.format("%s - %s (CD)", album.getIzvodjac(), album.getNaziv());
	}

}
