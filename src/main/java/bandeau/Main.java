package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private final Bandeau monBandeau = new Bandeau();

    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        List<Effet> mesEffets = new ArrayList<Effet>();
        List<Integer> repetitions = new ArrayList<Integer>();

        bandeau.sleep(2000);
        mesEffets.add(new AffichageColore(bandeau, "3..2..1.."));
        repetitions.add(1);
        mesEffets.add(new ChangementMessage(bandeau, "GO!!"));
        repetitions.add(1);
        mesEffets.add(new ChangementMessage(bandeau, "On change le fond!"));
        repetitions.add(1);
        mesEffets.add(new ChangeBackground(bandeau));
        repetitions.add(1);
        mesEffets.add(new ChangementMessage(bandeau, "ZooOOM"));
        repetitions.add(1);
        mesEffets.add(new Zoom(bandeau, "zoom"));
        repetitions.add(1);
        mesEffets.add(new ChangementMessage(bandeau, "ZOOoom"));
        repetitions.add(1);
        mesEffets.add(new Zoom(bandeau, "dezoom"));
        repetitions.add(1);
      
        mesEffets.add(new ChangementMessage(bandeau, "Encore de la couleur!"));
        repetitions.add(1);
        mesEffets.add(new ChangeFontColor(bandeau));
        repetitions.add(2);
        mesEffets.add(new ChangementMessage(bandeau, "Attention ça tourne"));
        repetitions.add(1);
        mesEffets.add(new ChangementMessage(bandeau, "Gauche.."));
        repetitions.add(1);
        mesEffets.add(new Rotation(bandeau, "gauche", 90));
        repetitions.add(1);
        mesEffets.add(new ChangementMessage(bandeau, "Ou droite!"));
        repetitions.add(1);
        mesEffets.add(new Rotation(bandeau, "droite", 180));
        repetitions.add(1);
        
        mesEffets.add(new ChangementMessage(bandeau, "On clignote 3fois"));
        repetitions.add(1);
        mesEffets.add(new Clignotement(bandeau, 3));
        repetitions.add(1);
        mesEffets.add(new ChangementMessage(bandeau, "changement de police"));
        repetitions.add(1);
        mesEffets.add(new ChangementPolice(bandeau));
        repetitions.add(2);
        

        Scenario s1 = new Scenario(mesEffets, repetitions);

        s1.play();

    }
}
