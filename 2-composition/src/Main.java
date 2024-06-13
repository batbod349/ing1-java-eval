import game.Engine;
import io.Console;
import io.Keyboard;
import math.Calculs;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        Keyboard keyboard = new Keyboard();
        Calculs calculs = new Calculs();

        Engine engine = new Engine(console, keyboard,calculs);
        engine.start();
    }
}