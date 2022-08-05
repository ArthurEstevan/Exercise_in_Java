package br.com.entra21.main.exercise_45;

import java.util.Scanner;

public class PersonalData {

    public static void personalData() {

        System.out.println("Make a program that reads the weight of a number of people defined by the user.\n" +
                           "At the end, show which was the highest and lowest weight read.");

        Scanner input = new Scanner(System.in);

        System.out.print("De quantas pessoasa deseja capturar o peso: ");
        float[] vetor = new float[input.nextInt()];

        for (int count = 0; count < vetor.length; count++) {
            System.out.print("Informe o pesso da pessoa numero " + (count + 1) + ": ");
            vetor[count] = input.nextFloat();
        }

        float maiorPeso = 0;
        float menorPeso = 0;

        for (int count = 0; count < vetor.length; count++) {
            if (menorPeso == 0) {
                menorPeso = vetor[count];
            } else if (vetor[count] < menorPeso) {
                menorPeso = vetor[count];
            }
        }
        System.out.println("Menor peso informado foi: " + menorPeso);

        for (int count = 0; count < vetor.length; count++) {
            if (maiorPeso == 0) {
                maiorPeso = vetor[count];
            } else if (vetor[count] > maiorPeso) {
                maiorPeso = vetor[count];
            }
        }
        System.out.println("O maior peso informado foi: " + maiorPeso);
    }
}
