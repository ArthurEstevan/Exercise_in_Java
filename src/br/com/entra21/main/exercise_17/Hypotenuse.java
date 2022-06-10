package br.com.entra21.main.exercise_17;

import java.util.Scanner;

public class Hypotenuse {

    public static void hypotenuse() {

        System.out.println("Write a program that reads the length of the opposite and adjacent sides of a right triangle.\n" +
                "Calculate and display the length of the hypotenuse.");

        Scanner input = new Scanner(System.in);

        double catetoOposto, catetoAdjecente, hipotenusa;

        System.out.print("Inform the value of the opposite side: ");
        catetoOposto = input.nextFloat();

        System.out.print("Inform the value of the adjacent side: ");
        catetoAdjecente = input.nextFloat();

        hipotenusa = Math.sqrt((catetoOposto*catetoOposto)+(catetoAdjecente*catetoAdjecente));

        System.out.println("Hypotenuse: " +hipotenusa);
    }
}
