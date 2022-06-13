package br.com.entra21.main.exercise_21;

import java.util.Scanner;

public class WallTiles {

    public static void wallTiles() {

        System.out.println("A rectangular shaped wall, whose height is hp (wall height) and width lp (wall width) needs to be covered by rectangular tiles.\n" +
                "The rectangular tile has dimensions ha (tile height) and la (tile width).\n" +
                "Write a program that reads the four measurements hp, lp, ha and la, calculates and prints how many tiles with the given measurements are needed to cover the given wall.");


        Scanner input = new Scanner(System.in);

        float height, width, tileHeight, tileWidth, areaWall, areaTile, area;

        System.out.print("\nEnter wall height: ");
        height = input.nextFloat();

        System.out.print("Enter wall width: ");
        width = input.nextFloat();

        System.out.print("Enter tile height in centimeter: ");
        tileHeight = input.nextFloat();

        System.out.print("Enter tile height in centimeter: ");
        tileWidth = input.nextFloat();

        areaWall = height * width;
        areaTile = (tileHeight / 100) * (tileHeight / 100);

        area = areaWall / areaTile;

        System.out.println("\nYou need " +area+ " tiles.");


    }
}
