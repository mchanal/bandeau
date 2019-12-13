package bandeau;

import java.awt.Color;
import java.util.Random;

public class AffichageColore extends Effet{
	private String message;
	Random rand=new Random();
	int r;
	int g;
	int b;
	public AffichageColore(Bandeau bandeau,String message) {
		super(bandeau);
		this.message=message;
		
	}
	public void play() {
		bandeau.sleep(2000);
		for(int i=0;i<this.message.length();i++) {
		r = rand.nextInt(255);
    		g = rand.nextInt(255);
    		b = rand.nextInt(255);
    		bandeau.setMessage(this.message.substring(0,i+1));
    		bandeau.setForeground(new Color(r,g,b));
    		bandeau.sleep(500);
    		
		}
}
}
