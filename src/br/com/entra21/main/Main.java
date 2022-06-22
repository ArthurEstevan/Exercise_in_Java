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
import br.com.entra21.main.exercise_14.CelsiusFahrenheit;
import br.com.entra21.main.exercise_15.CarRentalPrice;
import br.com.entra21.main.exercise_16.Extracting;
import br.com.entra21.main.exercise_17.Hypotenuse;
import br.com.entra21.main.exercise_18.AgeCurrentYear;
import br.com.entra21.main.exercise_19.AverageStudent;
import br.com.entra21.main.exercise_20.TemperatureConverter;
import br.com.entra21.main.exercise_21.WallTiles;
import br.com.entra21.main.exercise_22.VolumeCan;
import br.com.entra21.main.exercise_23.GuessTheNumber;
import br.com.entra21.main.exercise_24.ElectronicRadar;
import br.com.entra21.main.exercise_25.EvenOrOdd;
import br.com.entra21.main.exercise_26.TicketPrice;
import br.com.entra21.main.exercise_27.YearVerifier;
import br.com.entra21.main.exercise_28.IncreaseCalculator;
import br.com.entra21.main.exercise_29.ComparingValues;
import br.com.entra21.main.exercise_30.MilitaryEnlistment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println("\nSeu acesso foi no dia: " + formatar.format(hoje) + "\n");

        byte opcao;

        do {
            System.out.println("=====================Menu Exercises======================");
            for (int contador = 0; contador <= 30; contador++) {
                System.out.println(contador == 0 ? "\t0 - Fechar Programa" : "\t" + (contador) + " - Exercise");
            }
            System.out.println("=======================================================");
            System.out.print("Choose the Exercise: ");
            opcao = input.nextByte();

            switch (opcao) {

                case 0:
                    System.out.println("Thank you so much for using my program.");
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
                    CelsiusFahrenheit.celsiusFahrenheit();
                    exit();
                    break;
                case 15:
                    CarRentalPrice.carRentalPrice();
                    exit();
                    break;
                case 16:
                    Extracting.extracting();
                    exit();
                    break;
                case 17:
                    Hypotenuse.hypotenuse();
                    exit();
                    break;
                case 18:
                    AgeCurrentYear.ageCurrentYear();
                    exit();
                    break;
                case 19:
                    AverageStudent.averageStudent();
                    exit();
                    break;
                case 20:
                    TemperatureConverter.temperatureConverter();
                    exit();
                    break;
                case 21:
                    WallTiles.wallTiles();
                    exit();
                    break;
                case 22:
                    VolumeCan.volumeCan();
                    exit();
                    break;
                case 23:
                    GuessTheNumber.guessTheNumber();
                    exit();
                    break;
                case 24:
                    ElectronicRadar.electronicRadar();
                    exit();
                    break;
                case 25:
                    EvenOrOdd.evenOrOdd();
                    exit();
                    break;
                case 26:
                    TicketPrice.ticketPrice();
                    exit();
                    break;
                case 27:
                    YearVerifier.yearVerifier();
                    exit();
                    break;
                case 28:
                    IncreaseCalculator.increaseCalculator();
                    exit();
                    break;
                case 29:
                    ComparingValues.comparingValues();
                    exit();
                    break;
                case 30:
                    MilitaryEnlistment.militaryEnlistment();
                    exit();
                    break;
                case 31:
                    exit();
                    break;
                case 32:
                    exit();
                    break;


            }

        } while (opcao != 0);

    }

    public static void exit() {
        String answer;
        System.out.println("\nDo you wanna exit? (yes or no)");
        answer = input.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Thank you so much for using my program.");
            System.exit(1);
        }
    }

}
