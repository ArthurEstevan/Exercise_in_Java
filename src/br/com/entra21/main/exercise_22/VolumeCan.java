package br.com.entra21.main.exercise_22;

import java.util.Scanner;

public class VolumeCan {

    public static void volumeCan() {

        System.out.println("Calculate and present the value of the volume of an oil can, using the formula: V = PI * R * R * A;\n" +
                "V, R and A represent respectively the volume, the radius and the height.\n");

        Scanner input = new Scanner(System.in);

        double volume, raio, heigth;

        System.out.print("Enter the radius of the can in meter: ");
        raio = input.nextFloat();

        System.out.print("Enter the height of the can in meter: ");
        heigth = input.nextFloat();

        volume = Math.PI * (raio / 100) * (raio / 100) * heigth;

        System.out.println("The can volume is " +volume);
    }
}
