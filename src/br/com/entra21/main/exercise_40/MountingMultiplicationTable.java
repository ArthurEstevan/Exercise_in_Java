package br.com.entra21.main.exercise_40;

import java.util.Scanner;

public class MountingMultiplicationTable {

    public static void mountingMultiplicationTable() {

        System.out.println("Create a table of a number that the user chooses, only now using a for loop.\n");

        Scanner input = new Scanner(System.in);

        byte opcao;

        System.out.print("Informe o número que deseja ver a tabuada: ");
        opcao = input.nextByte();

        for (byte count = 0; count <= 10; count++) {

            System.out.println(opcao + "x" + count + " = " + (opcao*count));
        }

    }


}
