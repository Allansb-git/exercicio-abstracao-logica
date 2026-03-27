package br.edu.fatecpg.tecprog.model;

public class Pessoa {

    public void apresentaResultado(String pac, double peso, double altura) {
        double imc = peso / Math.pow(altura, 2);
        String classificacao = "";

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III (Mórbida)";
        }

        System.out.println("\n--- RELATORIO ---");
        System.out.println("Paciente: " + pac);
        System.out.printf("Peso: %.2f kg | Altura: %.2f m\n", peso, altura);
        System.out.printf("IMC Calculado: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);
    }
}
