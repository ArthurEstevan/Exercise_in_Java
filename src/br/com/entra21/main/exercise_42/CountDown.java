package br.com.entra21.main.exercise_42;

public class CountDown {

    public static void countDown() throws InterruptedException {

        System.out.println("Write a program that displays a countdown to the burst of fireworks on the screen, going from 10 to 0, with a 1 second pause between them.");

        for (byte count = 0; count < 10; count++) {

            System.out.println((10-count));
            new Thread();
            Thread.sleep(1000);
        }
        System.out.println("Feliz ano novo!");


    }
}
