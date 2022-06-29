package br.com.entra21.main.exercise_35;

import br.com.entra21.main.translation.Exercise33;
import br.com.entra21.main.translation.Exercise35;

import java.util.Scanner;

public class SpecifyingNumber {

    public static void specifyingNumber() {

        int number;
        String thousand, hundred, ten, unity;
        byte opcao;
        Scanner input = new Scanner(System.in);

        System.out.println("\n-Selecione Idioma-");
        System.out.println("1) en-US");
        System.out.println("2) pt-BR");
        System.out.println("-----------------------------");
        System.out.print("Escolha opção:");
        opcao = input.nextByte();

        System.out.println(opcao == 1 ? "\nWrite a program that reads a number from 0 to 9999 and displays each of the separate digits on the screen." : Exercise35.ENUNCIADO.getPortugues());
        System.out.print(opcao == 1 ?   "\nPlease, enter a number between 0 and 9999: " : Exercise35.PERGUNTA.getPortugues());
        number = input.nextInt();

        String numberToString = Integer.toString(number);

        if (number < 0) {
            System.out.println("\nInvalid number!");
        } else if (number < 10) {
            unity = numberToString.substring(0, 1);

            System.out.println((opcao == 1 ? "\nUnity = " : Exercise35.UNIDADE.getPortugues()) + unity);
        } else if (number < 100) {
            ten = numberToString.substring(0, 1);
            unity = numberToString.substring(1, 2);

            System.out.println((opcao == 1 ? "\nTen = " : Exercise35.DEZENA.getPortugues()) + ten +
                              (opcao == 1 ?  "\nUnity = " : Exercise35.UNIDADE.getPortugues()) + unity);
        } else if (number < 1000) {
            hundred = numberToString.substring(0, 1);
            ten = numberToString.substring(1, 2);
            unity = numberToString.substring(2, 3);

            System.out.println((opcao == 1 ? "\nHundred = " : Exercise35.CENTENA.getPortugues()) + hundred  +
                              (opcao == 1 ?  "\nTen = " : Exercise35.DEZENA.getPortugues()) + ten           +
                              (opcao == 1 ?  "\nUnity = " : Exercise35.UNIDADE.getPortugues()) + unity);
        } else if (number < 10000) {
            thousand = numberToString.substring(0, 1);
            hundred = numberToString.substring(1, 2);
            ten = numberToString.substring(2, 3);
            unity = numberToString.substring(3, 4);

            System.out.println((opcao == 1 ? "\nThousand = " : Exercise35.MILHAR.getPortugues()) + thousand +
                              (opcao == 1 ?  "\nHundred = " : Exercise35.CENTENA.getPortugues()) + hundred   +
                              (opcao == 1 ?  "\nTen = " : Exercise35.DEZENA.getPortugues()) + ten            +
                              (opcao == 1 ?  "\nUnity = " : Exercise35.UNIDADE.getPortugues()) + unity);
        } else {
            System.out.println("\nInvalid number!");
        }
    }
}