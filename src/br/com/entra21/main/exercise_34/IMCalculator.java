package br.com.entra21.main.exercise_34;

import br.com.entra21.main.translation.Exercise34;

import java.util.Scanner;

public class IMCalculator {

    public static void iMCalculator() {

        Scanner input = new Scanner(System.in);
        byte opcao;
        float height, weight, imc;

        System.out.println("\n-Selecione Idioma-");
        System.out.println("1) en-US");
        System.out.println("2) pt-BR");
        System.out.println("-----------------------------");
        System.out.print("Escolha opção:");
        opcao = input.nextByte();

        System.out.println(opcao == 1 ? "\nCapture weight and height to calculate IMC and display the result and in which weight range.\n" : Exercise34.ENUNCIADO.getPortugues());

        System.out.print(opcao == 1 ? "What is your height: " : Exercise34.HEIGHT.getPortugues());
        height = input.nextFloat();

        System.out.print(opcao == 1 ? "What is your weight: " : Exercise34.WEIGHT.getPortugues());
        weight = input.nextFloat();

        imc = weight / (height * height);

        if (imc < 18.5f) {
            System.out.printf(opcao == 1 ? "\nYour are underweight: %.2f" : Exercise34.ABAIXOPESO.getPortugues(), imc);
        } else if (imc >= 18.5f || imc <= 24.9f) {
            System.out.printf(opcao == 1 ? "\nYour are normal weight: %.2f" : Exercise34.PESONORMAL.getPortugues(), imc);
        } else if (imc >= 25f || imc <= 29.9f) {
            System.out.printf(opcao == 1 ? "\nYou are overweight: %.2f" : Exercise34.SOBREPESO.getPortugues(), imc);
        } else if (imc >= 30f || imc <= 34.9f) {
            System.out.printf(opcao == 1 ? "\nYou are obesity grade I: %.2f" : Exercise34.OBESIDADE_I.getPortugues(), imc);
        } else if (imc >= 35f || imc <= 39.9f) {
            System.out.printf(opcao == 1 ? "\nYou are obesity grade II: %.2f" : Exercise34.OBESIDADE_II.getPortugues(), imc);
        } else if (imc >= 40f) {
            System.out.printf(opcao == 1 ? "\nYou are obesity grade III: %.2f" : Exercise34.OBESIDADE_III.getPortugues(), imc);
        } else {
            System.out.println(opcao == 1 ? "\ninformation not found\n" : Exercise34.INFORMACAO.getPortugues());
        }
        System.out.println();
    }
}
