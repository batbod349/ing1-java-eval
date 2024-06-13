package io;

import java.util.Scanner;

public class Keyboard {
    public int askNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an int : ");
        return scn.nextInt();
    }
}
