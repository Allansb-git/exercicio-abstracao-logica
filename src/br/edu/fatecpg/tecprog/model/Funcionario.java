package br.edu.fatecpg.tecprog.model;

public class Funcionario {
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double calculaSalarioAnual(){
        return salario * 12;
    }

    public double calculaSalarioAnual(double porcentagemAumento){
        return (salario * 12) + (salario * (porcentagemAumento/100));
    }

    public void apresentaResultado() {
        System.out.printf("""
                -- RH DE EMPRESA --
                Funcionário: %s
                Salário anual: %.2f
                """, this.nome, calculaSalarioAnual());
    }
    public void apresentaResultado(double p) {
        System.out.printf("""
                -- RH DE EMPRESA --
                Funcionário: %s
                Salário anual: %.2f
                """, this.nome, calculaSalarioAnual(p));
    }

}
