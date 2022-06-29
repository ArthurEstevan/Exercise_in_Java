package br.com.entra21.main.exercise_33;

import br.com.entra21.main.translation.TranslationPT;

import java.text.DecimalFormat;
import java.text.Format;
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


        if (opcao == 1) {
            System.out.println("\nCreate a program that calculates the amount to be paid for a product, considering its normal price and payment terms:\n" +
                               "cash/check: 10% discount"           + "\n" +
                               "cash on card: 5% discount"          + "\n" +
                               "up to 2x on the card: normal price" + "\n" +
                               "3x or more on the card: 20% interest");

        } else if (opcao == 2) {
            System.out.println("\n" + TranslationPT.ENUNCIADO.getPortugues());
        }

        System.out.print(opcao == 1 ? "\nWich is the product: " : TranslationPT.PRODUTO.getPortugues());
        product = input.next();

        System.out.print(opcao == 1 ? "How much is it: " : TranslationPT.PRECO.getPortugues());
        amount = input.nextDouble();

        System.out.print(opcao == 1 ?  "\n1) cash/check: 10% discount"  + "\n" +
                           "2) cash on card: 5% discount"               + "\n" +
                           "3) Up to 2x on the card: normal price"      + "\n" +
                           "4) 3x or more on the card: 20% interest"    + "\n" +
                           "-----------------------------"              + "\n" +
                           "Choose Option: " : TranslationPT.FORMADEPAGEMENTO.getPortugues());
                            byte auxiliar = input.nextByte();


        if (auxiliar == 1) {
            productPrice = amount - (amount * 0.10f);
            productPrice = Double.valueOf(formato.format(productPrice));
            System.out.println((opcao == 1 ? "\nYou received 10% discount: " : TranslationPT.AVISTA.getPortugues()) + productPrice);
        } else if (auxiliar == 2) {
            productPrice = amount - (amount * 0.05f);
            productPrice = Double.valueOf(formato.format(productPrice));
            System.out.println((opcao == 1 ? "\nYou received 5% discount: " : TranslationPT.CARTAO.getPortugues()) + productPrice);
        } else if (auxiliar == 3) {
            productPrice = Double.valueOf(formato.format(amount));
            System.out.println((opcao == 1 ? "\nThe price was normal: " : TranslationPT.CARTAO2X.getPortugues()) + amount);
        } else if (auxiliar == 4) {
            productPrice = amount * 1.2f;
            productPrice = Double.valueOf(formato.format(productPrice));
            System.out.println((opcao == 1 ? "\nYou will pay 20% interest: " : TranslationPT.CARTAO3X.getPortugues()) + productPrice);
        }
    }
}
