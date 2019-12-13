package bandeau;

public class ChangementMessage extends Effet {
	private String message;
	
	public ChangementMessage(Bandeau bandeau,String message) {
		super(bandeau);
		this.message=message;
		
	}
	public void play() {
		bandeau.setMessage(message);
		bandeau.sleep(1000);
	}
}
