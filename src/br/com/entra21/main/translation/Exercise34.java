package br.com.entra21.main.translation;

public enum Exercise34 {

    ENUNCIADO ("\nCapturar peso e altura para calcular o IMC e exibir o resultado e em qual faixa de peso.\n"),

    HEIGHT ("Qual é sua altura: "),

    WEIGHT ("Qual é seu peso: "),

    ABAIXOPESO ("Você está abaixo do peso: %.2f"),

    PESONORMAL ("Vocês está com peso normal: %.2f"),

    SOBREPESO ("Você está com sobrepeso: %.2f"),

    OBESIDADE_I ("Você está com obesidade grau I: %.2f"),

    OBESIDADE_II ("Você está com obesidade grau II: %.2f"),

    OBESIDADE_III ("Você está com obesidade grau III: %.2f"),

    INFORMACAO ("informação não encontrada");

    private String portugues;

    Exercise34(String portugues) {
        this.portugues = portugues;
    }

    public String getPortugues() {
        return portugues;
    }
}
