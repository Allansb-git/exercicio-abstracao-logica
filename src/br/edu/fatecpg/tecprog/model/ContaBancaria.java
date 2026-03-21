package br.edu.fatecpg.tecprog.model;

public class ContaBancaria {
    public String numeroConta;
    public String titular;
    public double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        status();
    }

    public void sacar (double valor){
        saldo -= saldo > valor ? valor : 0;
        if (saldo < valor) { saqueInvalido(); }

        status();
    }

    public void saqueInvalido(){
        System.out.println("\nSaque inválido. Por favor, tente novamente.\n");
    }

    public void status(){
        System.out.printf("""
                \n-- BANCO DIGITAL --
                Nº da Conta: %s
                Titutlar: %s
                Saldo: %.2f
                """, this.numeroConta, this.titular, this.saldo);
    }
}
