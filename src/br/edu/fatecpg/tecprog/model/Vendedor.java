package br.edu.fatecpg.tecprog.model;

public class Vendedor {

    public void folhaPagamento(String nome, double totalVendas, double percentualComissao, double salarioBase) {
        double valorComissao = totalVendas * (percentualComissao / 100);
        

        double salarioFinal = salarioBase + valorComissao;

        System.out.println("\n--- Folha de Pagamento ---");
        System.out.println("Vendedor: " + nome);
        System.out.printf("Salário Base: R$ %.2f\n", salarioBase);
        System.out.printf("Total de Vendas: R$ %.2f\n", totalVendas);
        System.out.printf("Comissão (%s%%): R$ %.2f\n", percentualComissao, valorComissao);
        System.out.printf("SALÁRIO TOTAL: R$ %.2f\n", salarioFinal);
    }
}