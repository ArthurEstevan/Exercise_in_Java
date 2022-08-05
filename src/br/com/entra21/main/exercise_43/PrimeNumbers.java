package br.com.entra21.main.exercise_43;

import java.util.Scanner;

public class PrimeNumbers {

    public static void PrimeNumbers() {

        Scanner input = new Scanner(System.in);
        int qtdDivisores = 0, numero;

        System.out.print("Informe o numero para ver se ele e primo: ");
        numero = input.nextInt();

        for (int count = 1; count <= numero; count++) {
            if (numero % count == 0) {
                qtdDivisores+=1;
            }
        }

        if (qtdDivisores == 2) {
            System.out.println("Numero " +numero+ " e primo;");
        } else {
            System.out.println("Numero " +numero+ " nao e primo;");
        }

    }
}
