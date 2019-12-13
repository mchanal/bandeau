package bandeau;

import java.util.List;

public class Scenario {
	
	List<Effet> effets;
	List<Integer> repetitions;
	
	public Scenario (List<Effet> effets, List<Integer> repetitions) {
		this.effets = effets;
		this.repetitions = repetitions;
	}
	
	public void play() {
		
		for(int i = 0; i < effets.size(); i++) {
			
			for (int j = 0 ; j < repetitions.get(i); j++) {
				
				effets.get(i).play();
			}
		}
	}
	

}
