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
import br.com.entra21.main.exercise_31.NationalSwimming;
import br.com.entra21.main.exercise_32.EstateFinancing;
import br.com.entra21.main.exercise_33.ProductPrice;
import br.com.entra21.main.exercise_34.IMCalculator;
import br.com.entra21.main.exercise_35.SpecifyingNumber;
import br.com.entra21.main.exercise_36.CountingNumbers;
import br.com.entra21.main.exercise_37.ReadingList;
import br.com.entra21.main.exercise_38.BiggerSmaller;
import br.com.entra21.main.exercise_39.MultiplesOfThree;
import br.com.entra21.main.exercise_40.MountingMultiplicationTable;
import br.com.entra21.main.exercise_41.StoreNumbers;
import br.com.entra21.main.exercise_42.CountDown;
import br.com.entra21.main.exercise_43.PrimeNumbers;
import br.com.entra21.main.exercise_44.AgeList;
import br.com.entra21.main.exercise_45.PersonalData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println("\nSeu acesso foi no dia: " + formatar.format(hoje) + "\n");

        byte opcao;

        do {
            System.out.println("=====================Menu Exercises======================");
            for (int contador = 0; contador <= 50; contador++) {
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
                    NationalSwimming.nationalSwimming();
                    exit();
                    break;
                case 32:
                    EstateFinancing.estateFinancing();
                    exit();
                    break;
                case 33:
                    ProductPrice.productPrice();
                    exit();
                    break;
                case 34:
                    IMCalculator.iMCalculator();
                    exit();
                    break;
                case 35:
                    SpecifyingNumber.specifyingNumber();
                    exit();
                    break;
                case 36:
                    CountingNumbers.countingNumbers();
                    exit();
                    break;
                case 37:
                    ReadingList.readingList();
                    exit();
                    break;
                case 38:
                    BiggerSmaller.biggerSmaller();
                    exit();
                    break;
                case 39:
                    MultiplesOfThree.multiplesOfThree();
                    exit();
                    break;
                case 40:
                    MountingMultiplicationTable.mountingMultiplicationTable();
                    exit();
                    break;
                case 41:
                    StoreNumbers.StoreNumbers();
                    exit();
                    break;
                case 42:
                    CountDown.countDown();
                    exit();
                    break;
                case 43:
                    PrimeNumbers.PrimeNumbers();
                    exit();
                    break;
                case 44:
                    AgeList.ageList();
                    exit();
                    break;
                case 45:
                    PersonalData.personalData();
                    exit();
                    break;
                case 46:
                    exit();
                    break;
                case 47:
                    exit();
                    break;
                case 48:
                    exit();
                    break;
                case 49:
                    exit();
                    break;
                case 50:
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
