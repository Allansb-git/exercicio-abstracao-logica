package br.edu.fatecpg.tecprog.model;

public class Carro {
    public String marca;
    public double consumo;
    public double combustivel;
    public double kmRestantes;

    public Carro (String marca, double consumo, double combustivel){
        this.marca = marca;
        this.consumo = consumo;
        this.combustivel = combustivel;
        kmRestantes = combustivel / consumo;
    }

    public void viajar(double km){
        double consumoViagem = km * consumo;

        if (combustivel < consumoViagem){
            System.out.println("\nNão é possível viajar.\n");
            status();

            return;
        }

        System.out.printf("\nViagem de %.2fkm foi realizada!\n", km);
        combustivel -= consumoViagem;
        kmRestantes = combustivel / consumo;

        status();
    }

    public void abastecer(double combustivel){
        System.out.printf("\nAbastecimento de %.2fL foi realizado!\n", combustivel);
        this.combustivel += combustivel;
        kmRestantes = this.combustivel / consumo;

        status();
    }

    public void status(){
        System.out.printf("""
            \n-- APLICATIVO DE VEÍCULOS --
            Marca: %s
            Combustível atual: %.2fL
            Quilômetros que ainda podem ser percorridos: %.2fkm
            """, this.marca, this.combustivel, this.kmRestantes);
    }
}
