package br.com.entra21.main.exercise_38;

import java.util.Scanner;

public class BiggerSmaller {

    public static void biggerSmaller() {

        System.out.println("Write a program that reads three numbers, stores them in an array, and shows which is the biggest and which is the smallest.");

        Scanner input = new Scanner(System.in);

        byte[] vetor = new byte[3];

        for (int count = 0; count < vetor.length; count++) {
            System.out.print("Informe o " + (count+1) + "° numero: ");
            vetor[count] = input.nextByte();
        }

        if (vetor[0] > vetor[1] && vetor[0] > vetor[2]) {
            System.out.printf("O numero " + (vetor[0]) + " e o maior." + "\n");
        } else if (vetor[1] > vetor[0] && vetor[1] > vetor[2]) {
            System.out.printf("O numero " + (vetor[1]) + " e o maior." + "\n");
        } else {
            System.out.printf("O numero " + (vetor[2]) + " e o maior." + "\n");
        }

        if (vetor[0] < vetor[1] && vetor[0] < vetor[2]) {
            System.out.printf("O numero " + (vetor[0]) + " e o menor." + "\n");
        } else if (vetor[1] < vetor[0] && vetor[1] < vetor[2]) {
            System.out.printf("O numero " + (vetor[1]) + " e o menor." + "\n");
        } else {
            System.out.printf("O numero " + (vetor[2]) + " e o menor." + "\n");
        }
    }
}
