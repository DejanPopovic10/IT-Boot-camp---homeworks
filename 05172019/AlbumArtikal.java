package bokaRepublika;

public abstract class AlbumArtikal extends Artikal {
	private String izdavac;
	private Album album;

	public AlbumArtikal(Album album, String izdavac,double cena, int kolicina) {
		super(cena, kolicina);
		this.izdavac = izdavac;
		this.album = album;
	}

	public abstract String ime();

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

}