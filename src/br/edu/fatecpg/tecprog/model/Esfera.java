package br.edu.fatecpg.tecprog.model;

public class Esfera {

    public void apresentaResultado(double raio) {
        
        double area = 4 * Math.PI * Math.pow(raio, 2);

        
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.println("\n--- DADOS DA ESFERA ---");
        System.out.printf("Raio informado: %.2f\n", raio);
        System.out.printf("Área da Superfície: %.2f\n", area);
        System.out.printf("Volume da Esfera: %.2f\n", volume);
    }
}