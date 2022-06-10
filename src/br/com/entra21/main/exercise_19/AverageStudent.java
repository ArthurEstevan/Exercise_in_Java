package br.com.entra21.main.exercise_19;

import java.util.Scanner;

public class AverageStudent {

    public static void averageStudent() {

        System.out.println("From 3 grades provided by a student, inform if he passed, was in recovery or failed.\n" +
                "\tThe passing average is >= 7.0.\n" +
                "\tThe average recovery is >= 5.0 and < 7.0.\n" +
                "\tFail average is < 5.0.");

        float notas = 0, media, soma = 0, valorNotas;
        String auxiliar = null;

        Scanner input = new Scanner(System.in);

        do {

            System.out.print("Enter your grade: ");
            valorNotas = input.nextFloat();
            if (valorNotas != 0f) {
                notas++;
                System.out.print("Do you have any more notes: ");
                auxiliar = input.next();
            }

            soma = soma + valorNotas;
            media = soma / notas;

        } while (auxiliar.equalsIgnoreCase("sim"));

        if (media >= 7) {
            System.out.println("You passed: " +media);
        } if(media >= 5 || media < 7) {
            System.out.println("You stayed in recovery: "+media);
        } if (media < 5) {
            System.out.println("You fail: "+media);
        }
    }

}
