package br.com.entra21.main.exercise_33;

import br.com.entra21.main.translation.Exercise33;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductPrice {

    public static void productPrice() {

        Scanner input = new Scanner(System.in);
        byte opcao;
        String product;
        double amount, productPrice;
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.println("\n-Selecione Idioma-");
        System.out.println("1) en-US");
        System.out.println("2) pt-BR");
        System.out.println("-----------------------------");
        System.out.print("Escolha opção:");
        opcao = input.nextByte();

        System.out.println(opcao == 1 ? "\nCreate a program that calculates the amount to be paid for a product, considering its normal price and payment terms:\n" +
                                        "cash/check: 10% discount"           + "\n" +
                                        "cash on card: 5% discount"          + "\n" +
                                        "up to 2x on the card: normal price" + "\n" +
                                        "3x or more on the card: 20% interest" : Exercise33.ENUNCIADO.getPortugues());

        System.out.print(opcao == 1 ? "\nWich is the product: " : Exercise33.PRODUTO.getPortugues());
        product = input.next();

        System.out.print(opcao == 1 ? "How much is it: " : Exercise33.PRECO.getPortugues());
        amount = input.nextDouble();

        System.out.print(opcao == 1 ?  "\n1) cash/check: 10% discount"  + "\n" +
                           "2) cash on card: 5% discount"               + "\n" +
                           "3) Up to 2x on the card: normal price"      + "\n" +
                           "4) 3x or more on the card: 20% interest"    + "\n" +
                           "-----------------------------"              + "\n" +
                           "Choose Option: " : Exercise33.FORMADEPAGEMENTO.getPortugues());
                            byte auxiliar = input.nextByte();

        if (auxiliar == 1) {
            productPrice = amount - (amount * 0.10f);
            productPrice = Double.valueOf(formato.format(productPrice));
            System.out.println((opcao == 1 ? "\nYou received 10% discount: " : Exercise33.AVISTA.getPortugues()) + productPrice);
        } else if (auxiliar == 2) {
            productPrice = amount - (amount * 0.05f);
            productPrice = Double.valueOf(formato.format(productPrice));
            System.out.println((opcao == 1 ? "\nYou received 5% discount: " : Exercise33.CARTAO.getPortugues()) + productPrice);
        } else if (auxiliar == 3) {
            productPrice = Double.valueOf(formato.format(amount));
            System.out.println((opcao == 1 ? "\nThe price was normal: " : Exercise33.CARTAO2X.getPortugues()) + amount);
        } else if (auxiliar == 4) {
            productPrice = amount * 1.2f;
            productPrice = Double.valueOf(formato.format(productPrice));
            System.out.println((opcao == 1 ? "\nYou will pay 20% interest: " : Exercise33.CARTAO3X.getPortugues()) + productPrice);
        }
    }
}
