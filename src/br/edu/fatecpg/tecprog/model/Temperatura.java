package br.edu.fatecpg.tecprog.model;


public class Temperatura {

    public void apresentaResultado(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("\n--- RESULTADOS CONVERSÕES ---");
        System.out.printf("Celsius: %.2f°C\n", celsius);
        System.out.printf("Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Kelvin: %.2fK\n", kelvin);
    }
}