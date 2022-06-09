package br.com.entra21.main.exercise_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CarRentalPrice {

    public static void carRentalPrice() {

        String[] auxiliar;
        do {

            System.out.println("\nWrite a program that asks the number of kilometers traveled by a rented car and the number of days for which it was rented.\n"
                    + "Calculate the price to pay, knowing that the car costs R$60.00 per day and R$0.15 per km driven.");

            Scanner input = new Scanner(System.in);
            auxiliar = new String[5];
            int km;
            float carPrice, kmPrice;

            HashMap<String, Double> rentCar = new HashMap<>();

            rentCar.put("Ferrari Monza", 60.00);
            rentCar.put("Bugatti Chiron", 60.00);
            rentCar.put("Corvette C8", 60.00);

            System.out.println("\n=============Table Cars==============");
            for (Entry<String, Double> rentCars : rentCar.entrySet()) {
                System.out.println("Cars: " + rentCars.getKey());
                System.out.println("Price: " + rentCars.getValue());
                System.out.println("=====================================");

            }

            System.out.print("Hello. Wich car do you wanna rent: ");
            auxiliar[0] = input.nextLine();
            System.out.print("How many days do you wanna rent the car: ");
            auxiliar[1] = input.next();

            float precoPorDias = Float.parseFloat(auxiliar[1]);

            carPrice = precoPorDias * 60f;

            System.out.println("Rent for " + auxiliar[1] + " days the car will cost: " + carPrice);

            System.out.println("Do you wanna rent the car really?");
            auxiliar[2] = input.next();

            if (auxiliar[2].equalsIgnoreCase("sim")) {
                System.out.println("a few moments later....");


                System.out.println("How many kilometer does the car have now?");
                auxiliar[3] = input.next();

                float kilometrosRodados = Float.parseFloat(auxiliar[3]);

                kmPrice = kilometrosRodados * 0.15f;

                System.out.println("value of days rented: " + carPrice);
                System.out.println("value of kilometer traveled: " + kmPrice);
                System.out.println("total: " + (carPrice + kmPrice));

                System.out.println("Do you wanna rent the car again?");
                auxiliar[4] = input.next();

            }

        } while (auxiliar[4].equalsIgnoreCase("sim"));
    }
}

