package bandeau;

public class Rotation extends Effet {
	private String direction;
	private int deg;

	public Rotation(Bandeau bandeau, String direction, int deg) {
		super(bandeau);
		this.direction = direction;
		this.deg = deg;
	}

	public void play() {
		if (this.direction.toLowerCase().equals("gauche")) {
			if (this.deg == 90) {
				for (int i = 0; i <= 100; i++) {
					bandeau.setRotation(Math.PI * (-i) / 100);
					bandeau.sleep(10);
				}
			} else {
				for (int i = 0; i <= 100; i++) {
					bandeau.setRotation(2 * Math.PI * (-i) / 100);
					bandeau.sleep(10);
				}
			}
		} else {
			if (this.deg == 90) {
				for (int i = 0; i <= 100; i++) {
					bandeau.setRotation(Math.PI * (i) / 100);
					bandeau.sleep(10);
				}
			} else {
				for (int i = 0; i <= 100; i++) {
					bandeau.setRotation(2 * Math.PI * (i) / 100);
					bandeau.sleep(10);
				}
			}
		}
		bandeau.sleep(1000);
	}
}
