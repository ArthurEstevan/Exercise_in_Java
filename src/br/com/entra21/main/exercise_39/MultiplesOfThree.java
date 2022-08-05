package br.com.entra21.main.exercise_39;

public class MultiplesOfThree {

    public static void multiplesOfThree() {

        System.out.println("Write a program that calculates the sum of all numbers that are multiples of three and that lie in the range 1 to 500.");

        int multiplesThree = 0;

        for (short count = 1; count <= 500; count++) {
            if (count%3 == 0) {
                System.out.println(count);
                multiplesThree+=count;
            }
        }

        System.out.println("Soma dos multiplos de tres e: " + multiplesThree);
    }

}
