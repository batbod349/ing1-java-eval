package io;

import java.util.ArrayList;
import java.util.Scanner;

public class Keyboard {

    Scanner scn = new Scanner(System.in);

    public ArrayList<Integer> askNumbers() {

        ArrayList<Integer> userInput = new ArrayList<>();

        boolean continuer = true;
        while (continuer) {
            System.out.print("Entrer un int : ");
            while (!scn.hasNextInt()) {
                System.out.print("Entrée invalide. Veuillez entrer un nombre entier : ");
                scn.next();
            }
            userInput.add(scn.nextInt());

            System.out.print("Voulez-vous entrer un autre nombre? (oui/non) : ");
            String response = scn.next();
            continuer = response.equalsIgnoreCase("oui");
        }

        return userInput;
    }

    public int askOneNumber(){
        System.out.print("Entrez un nombre entier : ");
        while (!scn.hasNextInt()) {
            System.out.print("Entrée invalide. Veuillez entrer un nombre entier : ");
            scn.next();
        }
        return scn.nextInt();
    }
    public int askChoice() {
        int choice = -1;
        while (choice != 2 && choice != 3) {
            System.out.print("Choisissez une option (2 pour calculer la moyenne, 3 pour deviner le nombre) : ");
            while (!scn.hasNextInt()) {
                System.out.print("Entrée invalide. Veuillez entrer 2 ou 3 : ");
                scn.next();
            }
            choice = scn.nextInt();
        }
        return choice;
    }
}

