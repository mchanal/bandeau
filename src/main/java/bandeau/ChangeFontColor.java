package bandeau;

import java.awt.Color;
import java.util.Random;

public class ChangeFontColor extends Effet {
	Random rand=new Random();
	int r;
	int g;
	int b;
	public ChangeFontColor(Bandeau bandeau) {
		super(bandeau);
	}
	
	public void play() {
		r = rand.nextInt(255);
		g = rand.nextInt(255);
		b = rand.nextInt(255);
		bandeau.setForeground(new Color(r,g,b));
		bandeau.sleep(1000);
		
	}
}
