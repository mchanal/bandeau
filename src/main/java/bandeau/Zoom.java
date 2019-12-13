package bandeau;

import java.awt.Font;

public class Zoom extends Effet {
	private String zoom;
	
	
	public Zoom(Bandeau bandeau,String zoom) {
		super(bandeau);
		this.zoom=zoom;
		
	}
	public void play() {
		if(this.zoom.toLowerCase().equals("zoom")) {
		for (int i = 5; i < 60 ; i+=5) {
			this.bandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			this.bandeau.sleep(100);
		}}
		else {
			for (int i = 5; i < 30 ; i+=5) {
				this.bandeau.setFont(new Font("Dialog", Font.BOLD, 60-i));
				this.bandeau.sleep(100);
			}}
		
		bandeau.sleep(1000);
	}
}
