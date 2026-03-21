package br.edu.fatecpg.tecprog.model;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double calculaArea(){
        return largura * altura;
    }

    public double calculaPerimetro(){
        return 2 * (largura + altura);
    }

    public void apresentaResultado(){
        System.out.printf("""
                -- SISTEMA DE MARCENARIA --
                Área: %.2fm²
                Perímetro: %.2fm
                """, calculaArea(), calculaPerimetro());
    }
}