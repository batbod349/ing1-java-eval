import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("1 - Capsule vers un autre monde");
        AverageManager avgManager = new AverageManager();
        ArrayList<Integer> nombres = new ArrayList<Integer>();
        nombres.add(20);
        nombres.add(42);
        nombres.add(10);
        avgManager.setNombres(nombres);
        avgManager.displayAverage();
    }
}