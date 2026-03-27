package br.edu.fatecpg.tecprog.model;

public class Viagem {

    public void apresentaResultado(double distancia, double consumoKmL, double precoCombustivel) {
     
        double litrosNecessarios = distancia / consumoKmL;

        double custoTotal = litrosNecessarios * precoCombustivel;

        System.out.println("\n--- PLANEJAMENTO VIAGEM ---");
        System.out.printf("Distância a percorrer: %.2f km\n", distancia);
        System.out.printf("Consumo médio do veículo: %.2f km/L\n", consumoKmL);
        System.out.printf("Combustível necessário: %.2f litros\n", litrosNecessarios);
        System.out.printf("Preço do combustível: R$ %.2f\n", precoCombustivel);
        System.out.println("---------------------------------");
        System.out.printf("VALOR TOTAL ESTIMADO: R$ %.2f\n", custoTotal);
    }
}