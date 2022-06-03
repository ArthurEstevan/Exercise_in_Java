package br.com.entra21.main.exercise_11;

import java.util.Scanner;

public class PaintingWall {

    public static void paintingWall() {

        System.out.println("Write a program that reads the width and height of a wall in meters, calculates its area and the amount of paint needed to paint it, knowing that each liter of paint paints an area of 2m squared.");

        Scanner input = new Scanner(System.in);

        float width, height, area;

        System.out.print("What is the width of your wall in meters? ");
        width = input.nextFloat();

        System.out.print("What is the height of your wall in meters? ");
        height = input.nextFloat();

        area = width * height;

        area = area / 2;

        System.out.println("You need " + area + " liters of paint to paint your wall.");

    }
}
