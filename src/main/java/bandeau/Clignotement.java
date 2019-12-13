package bandeau;

import java.awt.Color;

public class Clignotement extends Effet {
	private int nb;
	public Clignotement(Bandeau bandeau, int nb) {
		super(bandeau);
		this.nb=nb;
	}
	
	public void play() {
		Color c=bandeau.getForeground();
		for(int i=0;i<nb;i++) {
			
			bandeau.setForeground(bandeau.getBackground());
			bandeau.sleep(300);
			bandeau.setForeground(c);
			bandeau.sleep(300);
			
		}
	}
}
