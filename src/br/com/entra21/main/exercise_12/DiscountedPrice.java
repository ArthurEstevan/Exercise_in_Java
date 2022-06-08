package br.com.entra21.main.exercise_12;

import java.util.Scanner;

public class DiscountedPrice {

    public static void discountedPrice() {

        System.out.println("Make an algorithm that reads the price of a product and displays its new price, with a 5% discount.");

        Scanner input = new Scanner(System.in);

        String productName;
        float price, discount;

        System.out.print("What is your product: ");
        productName = input.next();

        System.out.print("How much does your product cost: ");
        price = input.nextByte();

        System.out.println(productName+ " cost: " +(price)+ " R$");

        discount = price * (5f / 100f);
        System.out.println("5% discount of " +price+ " R$: " +discount+ " R$");
        System.out.println(productName+ " cost with 5% discount: " +(price-discount)+ " R$");

    }

}
