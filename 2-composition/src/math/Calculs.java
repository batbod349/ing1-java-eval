package math;

import java.util.ArrayList;

public class Calculs {

    public double calculerMoyenne(ArrayList<Integer> nombres) {
        int somme = 0;
        for (Integer i : nombres) {
            somme += i;
        }
        return (!nombres.isEmpty()) ? (double) somme / nombres.size() : 0;
    }
}
