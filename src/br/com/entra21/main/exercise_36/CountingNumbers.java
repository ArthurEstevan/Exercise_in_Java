package br.com.entra21.main.exercise_36;

public class CountingNumbers {

    public static void countingNumbers() {

        System.out.println("Create a program that displays on the screen all even numbers that are in the range between 1 and 50.");

        byte contador;

        for (contador = 0; contador <= 50; contador++) {
            if (contador % 2 == 0) {
                System.out.println("Even Numbers between 0 and 50: " + (contador));
            } else {

            }
        }
    }
}
