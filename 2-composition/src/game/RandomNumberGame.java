package game;

import io.Keyboard;
import io.Console;
import math.RandomNumber;

public class RandomNumberGame {
    private Console console;
    private Keyboard keyboard;

    public RandomNumberGame(Console console, Keyboard keyboard) {
        this.console = console;
        this.keyboard = keyboard;
    }

    public void start() {
        int numberToGuess = RandomNumber.getRandomNumber(0, 1024);
        int guess = -1;

        console.print("Bienvenue au jeu de devinette ! Devinez le nombre entre 0 et 1024.");

        while (guess != numberToGuess) {
            guess = keyboard.askOneNumber();
            if (guess < numberToGuess) {
                console.print("Le nombre à deviner est plus grand.");
            } else if (guess > numberToGuess) {
                console.print("Le nombre à deviner est plus petit.");
            } else {
                console.print("Félicitations ! Vous avez trouvé le nombre.");
            }
        }
    }
}
