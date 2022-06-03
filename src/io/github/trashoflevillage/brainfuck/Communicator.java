package io.github.trashoflevillage.brainfuck;

import java.util.Scanner;

public class Communicator {
    public static Scanner scanner = new Scanner(System.in);

    public static String prompt(String prompt) {
        System.out.print("\u001b[33m" + prompt + "\u001B[0m ");
        String output = scanner.nextLine();
        return output;
    }

    public static void print(String message) {
        System.out.print(message);
    }
    public static void print(char message) {
        System.out.print(message);
    }
}
