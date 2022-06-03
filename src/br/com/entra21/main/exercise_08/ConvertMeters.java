package br.com.entra21.main.exercise_08;

import java.util.Scanner;

public class ConvertMeters {

    public static void convertMeters() {

        System.out.println("Write a program that reads a value in meters and displays it converted into centimeters and millimeters.");

        Scanner input = new Scanner(System.in);

        float meters, centimeters=0, millimeters=0;

        System.out.print("Enter value in meters that you wanna convert to centimeters and millimeters: ");
        meters = input.nextFloat();

        System.out.println("Meter: " +meters);

        centimeters = meters * 10;

        System.out.println("Centimeters: " +centimeters+ "cm");

        millimeters = centimeters * 10;

        System.out.println("Millimeters: " +millimeters+ "mm");


    }
}
