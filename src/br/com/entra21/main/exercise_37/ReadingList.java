package br.com.entra21.main.exercise_37;

public class ReadingList {

    public static void readingList() {

        System.out.println("\nWe have a dataset containing the height and gender (male, female) of 10 people.\n" +
                           "Make an algorithm that calculates and writes:\n" +
                           "The highest and lowest height of the group;\n" +
                           "Average height of men;\n" +
                           "The number of women.\n");


        float altura[] = {1.5f, 1.7f, 1.65f, 1.8f, 1.9f, 1.93f, 1.55f, 1.74f, 1.68f,};
        String sexo[] = {"m", "f", "m", "f", "m", "f", "m", "f", "m", "f"};

        // ================================= //
        // QUESTAO A - MAIOR E MENOR ALTURAS //
        // ================================= //

        int contadorAltura = 0;
        float menorAltura = 0;
        float maiorAltura = 0;

        while (contadorAltura < altura.length) {

            if (contadorAltura == 0) {
                menorAltura = altura[contadorAltura];
            } else if (menorAltura > altura[contadorAltura]) {
                menorAltura = altura[contadorAltura];
            } else {

            }

            if (contadorAltura == 0) {
                maiorAltura = altura[contadorAltura];
            } else if (maiorAltura < altura[contadorAltura]) {
                maiorAltura = altura[contadorAltura];
            } else {

            }

            contadorAltura++;
        }

        System.out.println("QUESTAO A - A menor altura encontrada no grupo de homens foi: " + menorAltura + " metros.");
        System.out.println("QUESTAO A - A maior altura encontrada no grupo de homens foi: " + maiorAltura + " metros.");

        // =================================== //
        // QUESTAO B - MEDIA ALTURA DOS HOMENS //
        // =================================== //

        byte contadorSexo = 0, qtdHomens = 0;
        float somaAlturasHomens = 0, mediaAlturaHomens;

        while (contadorSexo < sexo.length) {
            if (sexo[contadorSexo].equals("m")) {
                somaAlturasHomens = somaAlturasHomens + altura[contadorSexo];
                qtdHomens = (byte) (qtdHomens + 1);
            } else {

            }
            contadorSexo++;
        }

        mediaAlturaHomens = somaAlturasHomens / qtdHomens;
        System.out.println("QUESTAO B - A media de altura dos homens é de " + mediaAlturaHomens + " metros.");

        // ============================== //
        // QUESTAO C - NUMERO DE MULHERES //
        // ============================== //

        byte contadorMulheres = 0, qtdMulheres = 0;

        while (contadorMulheres < sexo.length) {
            if (sexo[contadorMulheres].equals("f")) {
                qtdMulheres += 1;
            } else {

            }
            contadorMulheres++;
        }

        System.out.println("QUESTAO C - Existem " + qtdMulheres + " mulheres na lista.");

    }
}
