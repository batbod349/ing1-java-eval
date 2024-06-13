import java.util.ArrayList;

public class AverageManager {

    private ArrayList<Integer> nombres = new ArrayList<>();

    public ArrayList<Integer> getNombres() {
        return nombres;
    }

    public void setNombres(ArrayList<Integer> nombres) {
        this.nombres = nombres;
    }

    public void displayAverage() {
        int sum = 0;
        for (Integer i : nombres) {
            sum += i;
        }

        String result = (!nombres.isEmpty()) ? String.valueOf((sum/nombres.size())) : "Impossible, aucun nombre";
        System.out.println("Résultat : " + result);
    }

}
