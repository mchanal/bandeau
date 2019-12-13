package bandeau;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

import java.util.Random;

public class ChangementPolice extends Effet{

	
public ChangementPolice(Bandeau bandeau) {
	super(bandeau);
}

public void play() {
	String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	Random rand=new Random();
	String f=fonts[rand.nextInt(fonts.length)];
	bandeau.setFont(new Font(f,Font.BOLD,30));
	bandeau.sleep(500);
}
}
