package bandeau;

public abstract class Effet {
	
	Bandeau bandeau;
	
	public Effet(Bandeau bandeau) {
		this.bandeau = bandeau;
	}
	
	public abstract void play();

}
