package br.com.entra21.main.exercise_41;

import java.util.Scanner;

public class StoreNumbers {

    public static void StoreNumbers() {

        System.out.println("Develop a program that reads a user-defined amount of integers, stores them in an array, and displays the sum of only those that are even. If the value entered is odd, disregard it.");

        Scanner input = new Scanner(System.in);
        int soma = 0;

        System.out.print("Informe quantos valores quer armazenar: ");
        int[] armazenar = new int[input.nextInt()];

        for (int count = 0; count < armazenar.length; count++) {
            System.out.print("Informe o numero " + (count + 1) + ": ");
            armazenar[count] = input.nextInt();
        }

        System.out.println("Os numeros aramazenados foram: ");
        for (int read = 0; read < armazenar.length; read++) {
            System.out.println(armazenar[read]);
        }

        for (int interno = 0; interno < armazenar.length; interno++) {

            if (armazenar[interno] % 2 == 0) {
                soma+=armazenar[interno];
            }
        }
        System.out.println("Soma dos numeros pares: " + soma);
    }
}
