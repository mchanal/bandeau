package bandeau;

import java.awt.Color;
import java.util.Random;

public class ChangeBackground extends Effet {
	Random rand=new Random();
	int r;
	int g;
	int b;
	public ChangeBackground(Bandeau bandeau) {
		super(bandeau);
	}
	public void play() {
		r = rand.nextInt(255);
		g = rand.nextInt(255);
		b = rand.nextInt(255);
		bandeau.setBackground(new Color(r,g,b));
		bandeau.sleep(1000);
	}
}
