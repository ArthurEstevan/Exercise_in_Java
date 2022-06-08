package br.com.entra21.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner input;
    private String titulo;
    private ArrayList<String> opcoes;

    public Menu(String titulo, ArrayList<String> opcoes) {
        this.titulo = titulo;
        this.opcoes = opcoes;
    }

    public Menu() {
    }

    public void executarMenu() {
        do {
            System.out.println("===============Menu " + this.titulo + "===============");
            System.out.println("\t0 - Exit");

            if (opcoes == null && !opcoes.isEmpty()) {
                for (int contador = 0; contador < opcoes.size(); contador++) {
                    System.out.println("\t" + (contador + 1) + " - " + opcoes.get(contador));
                }

            }

        } while (capturarOpcao() != 0);

    }

    public byte capturarOpcao() {

        byte opcao;
        opcao = input.nextByte();

        switch (opcao) {

            case 0:
                System.out.println("Obrigado! Espero que tenha feito os exercicios.");
                System.exit(0);
                break;

        }

        return 0;
    }

}
