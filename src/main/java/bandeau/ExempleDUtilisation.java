package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExempleDUtilisation {

    private final Bandeau monBandeau = new Bandeau();

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello World !");
        monBandeau.sleep(1000);

        String a[] = new String[]{"L", "e", " ", "j", "e", "u", " ", "d", "u", " ", "p", "e", "n", "d", "u"};
        ArrayList alist = new ArrayList(Arrays.asList(a));
        monBandeau.setMessage("_______________");
        monBandeau.sleep(100);
        String b[] = new String[]{"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"};
        ArrayList blist = new ArrayList(Arrays.asList(b));
        int r = (int) (Math.random() * (14));
        int n = 0;
        int p = 0;
        String s = "";
        ArrayList<Integer> clist = new ArrayList<Integer>();
        clist.add(1);
        clist.add(2);
        clist.add(3);
        clist.add(4);
        clist.add(5);
        clist.add(6);
        clist.add(7);
        clist.add(8);
        clist.add(9);
        clist.add(10);
        clist.add(11);
        clist.add(12);
        clist.add(13);
        clist.add(14);
        clist.add(15);
        Collections.shuffle(clist);
        
        for (int z : clist) {
            System.out.println(z);
            String phrase = "";
            blist.remove(z-1);
            blist.add(z-1, alist.get(z-1));
            for (int g = 0; g<15;g++) {
                phrase = phrase + blist.get(g);
                
            }
            System.out.println(phrase);
            monBandeau.setMessage(phrase);
            monBandeau.sleep(500);
        }

        monBandeau.setMessage("_______________");
        monBandeau.sleep(1000);
        monBandeau.setMessage("_______________");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne...");
        for (int i = 0; i <= 100; i++) {
            monBandeau.setRotation(2 * Math.PI * i / 100);
            monBandeau.sleep(100);
        }

        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Termine");
    }
}
