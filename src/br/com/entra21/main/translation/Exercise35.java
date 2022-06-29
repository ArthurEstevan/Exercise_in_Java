package br.com.entra21.main.translation;

public enum Exercise35 {

    ENUNCIADO ("\nFaça um programa que leia um número de 0 a 9999 e mostre na tela cada um dos dígitos separados."),

    PERGUNTA ("\nPor favor, insira um número entre 0 e 9999: "),

    UNIDADE ("\nUnidade: "),

    DEZENA ("\nDezena: "),

    CENTENA ("\nCentena: "),

    MILHAR ("\nMilhar: ");

    private String portugues;

    Exercise35(String portugues) {
        this.portugues = portugues;
    }

    public String getPortugues() {
        return portugues;
    }
}
