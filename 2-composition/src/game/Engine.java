package game;

import io.Console;
import io.Keyboard;
import math.Calculs;

import java.util.ArrayList;

public class Engine {
    private Console console;
    private Keyboard keyboard;
    private Calculs calculs;

    public Engine(Console console, Keyboard keyboard, Calculs calculs) {
        this.console = console;
        this.keyboard = keyboard;
        this.calculs = calculs;
    }

    public void start() {
        int choix = keyboard.askChoice();
        if (choix == 2) {
            calculerMoyenne();
        } else {
            devinerNombre();
        }
    }

    private void calculerMoyenne() {
        double dMoyenne;
        ArrayList<Integer> nombres = keyboard.askNumbers();

        dMoyenne = calculs.calculerMoyenne(nombres);
        console.print("La moyenne des nombres est : " + dMoyenne);
    }

    private void devinerNombre() {
        RandomNumberGame game = new RandomNumberGame(console, keyboard);
        game.start();
    }
}
