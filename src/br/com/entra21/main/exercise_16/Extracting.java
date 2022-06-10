package br.com.entra21.main.exercise_16;

import java.util.Scanner;

public class Extracting {

        public static void extracting () {

        System.out.println("Create a program that reads any Real number from the keyboard and displays its entire portion on the screen.\n" +
                "Ex: Enter a number: 6,127.\n" +
                "\tThe number 6,127 has the Integer part 6.");

        Scanner input = new Scanner(System.in);

        double numero;
        int numeroTruncado;

            System.out.print("\nEnter a number decimal: ");
            numero = input.nextDouble();

            if((numero - Math.round(numero))>0.5f) {
                numeroTruncado = (int) (numero - (numero - Math.round(numero)));
                System.out.println("The number " +numero+ " has the Integer part" +numeroTruncado);
            } else {
                numeroTruncado = (int) (numero + (numero - Math.round(numero)));
                System.out.println("The number " +numero+ " has the Integer part " +numeroTruncado);
            }

    }
}
