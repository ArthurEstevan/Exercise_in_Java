package br.com.entra21.main.exercise_44;

import java.util.Scanner;

public class AgeList {

    public static void ageList() {

        System.out.println("Create a program that reads the year of birth of a number of people defined by the user.\n" +
                           "At the end, show how many people have not yet reached the age of majority and how many are already older.");

        Scanner input = new Scanner(System.in);
        int ano = 0;
        byte qtdPessoasMaiores = 0;

        System.out.print("Em que ano estamos: ");
        ano = input.nextInt();

        System.out.print("Quantas pessoas você quer capturar: ");
        short[] vetor = new short[input.nextShort()];

        for (int count = 0; count < vetor.length; count++) {
            System.out.print("Qual data de nascimento da pessoa numero " + (count + 1) + ": ");
            vetor[count] = input.nextShort();
        }

        for (int interno = 0; interno < vetor.length; interno++) {

            if ((ano - vetor[interno]) < 18) {
                qtdPessoasMaiores+=1;
            }
        }

        System.out.println("Das " + vetor.length + " pessoas sao maiores de idade " + qtdPessoasMaiores);
    }
}
