package br.com.entra21.main.exercise_18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCurrentYear {

    public static void ageCurrentYear() {

        System.out.println("Determine how old the user is in the current year.\n" +
                "To do this, request the user's year of birth and the current year.\n");

        Scanner input = new Scanner(System.in);
        int idade;
        String anoNascimento;

        LocalDate dataNascimento = LocalDate.now();

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("YYYY");

        System.out.print("What year is your birthday: ");
        anoNascimento = input.next();

        System.out.println("Current year: " +formatacao.format(dataNascimento));
        System.out.println("User's year of birth: " +anoNascimento);

        int nascimento = Integer.parseInt(anoNascimento);

        idade = 2022 - nascimento;

        System.out.println("How old the user is: " +idade);

    }
}
