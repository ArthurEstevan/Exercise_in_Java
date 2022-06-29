package br.com.entra21.main.translation;

public enum Exercise33 {

    ENUNCIADO("\nElabore um programa que calcule o valor a ser pago por um produto, considerando o seu preço normal e condição de pagamento:\n" +
            "à vista dinheiro/cheque: 10% de desconto"  + "\n" +
            "à vista no cartão: 5% de desconto"         + "\n" +
            "em até 2x no cartão: preço normal"         + "\n" +
            "3x ou mais no cartão: 20% de juros"),

    PRODUTO("\nQual é o produto: "),

    PRECO("Quanto custa: "),

    FORMADEPAGEMENTO ("\n1) à vista em dinheiro/cheque: 10% de desconto" + "\n" +
                               "2) à vista no cartão: 5% de desconto"             + "\n" +
                               "3) Até 2x no cartão: preço normal"                + "\n" +
                               "4) Até 3x ou mais no cartão: 20% de juros"        + "\n" +
                               "-----------------------------"                    + "\n" +
                               "Escolha opção: "),

    AVISTA ("\nVocê recebu 10% de desconto: "),

    CARTAO ("\nVocê recebeu 5% de desconto: "),

    CARTAO2X ("\nValor ficou normal: "),

    CARTAO3X ("\nVocê pagará 20% de juros: ");

    private String portugues;

    Exercise33(String portugues) {
        this.portugues = portugues;
    }

    public String getPortugues() {
        return portugues;
    }
}
