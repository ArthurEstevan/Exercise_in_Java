package br.com.entra21.main;

import br.com.entra21.main.exercise_01.HelloWorld;
import br.com.entra21.main.exercise_02.WelcomeMenssage;
import br.com.entra21.main.exercise_03.Sum;
import br.com.entra21.main.exercise_04.CountingLetters;
import br.com.entra21.main.exercise_05.SuccessorAndPredecessor;
import br.com.entra21.main.exercise_06.DoubleTripleRoot;
import br.com.entra21.main.exercise_07.StudentAverage;
import br.com.entra21.main.exercise_08.ConvertMeters;
import br.com.entra21.main.exercise_09.TableMultiplication;
import br.com.entra21.main.exercise_10.RealToDollar;
import br.com.entra21.main.exercise_11.PaintingWall;
import br.com.entra21.main.exercise_12.DiscountedPrice;
import br.com.entra21.main.exercise_13.NewSalary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println("\nSeu acesso foi no dia: " +formatar.format(hoje)+"\n");

        byte opcao;

        do {
            System.out.println("=====================Menu Exercises======================");
            for (int contador=0; contador <= 20; contador++) {
                System.out.println(contador==0?"\t0 - Fechar Programa":"\t" +(contador)+ " - Exercise");
            }
            System.out.println("=======================================================");
            System.out.print("Choose the Exercise: ");
            opcao = input.nextByte();

            switch (opcao) {

                case 0:
                    System.exit(0);
                    break;
                case 1:
                    HelloWorld.helloWorld();
                    exit();
                    break;
                case 2:
                    WelcomeMenssage.welcomeMenssage();
                    exit();
                    break;
                case 3:
                    Sum.sum();
                    exit();
                    break;
                case 4:
                    CountingLetters.countingLetters();
                    exit();
                    break;
                case 5:
                    SuccessorAndPredecessor.SuccessorAndPredecessor();
                    exit();
                    break;
                case 6:
                    DoubleTripleRoot.DoubleTripleRoot();
                    exit();
                    break;
                case 7:
                    StudentAverage.StudentAverage();
                    exit();
                    break;
                case 8:
                    ConvertMeters.convertMeters();
                    exit();
                    break;
                case 9:
                    TableMultiplication.tableMultiplication();
                    exit();
                    break;
                case 10:
                    RealToDollar.realToDollar();
                    exit();
                    break;
                case 11:
                    PaintingWall.paintingWall();
                    exit();
                    break;
                case 12:
                    DiscountedPrice.discountedPrice();
                    exit();
                    break;
                case 13:
                    NewSalary.newSalary();
                    exit();
                    break;
                case 14:
                    exit();
                    break;
                case 15:
                    exit();
                    break;
                case 16:
                    exit();
                    break;
                case 17:
                    exit();
                    break;
                case 18:
                    exit();
                    break;
                case 19:
                    exit();
                    break;
                case 20:
                    exit();
                    break;
            }

        }while (opcao != 0);


    }

    public static void exit() {
        String answer;
        System.out.println("Do you wanna exit? (yes or no)");
        answer = input.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.exit(1);
        }
    }

}
