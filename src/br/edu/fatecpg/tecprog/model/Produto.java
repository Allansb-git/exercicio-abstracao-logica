package br.edu.fatecpg.tecprog.model;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calculaValorTotal(){
        return quantidade * preco;
    }

    public  void vender(int quantidade){
        if (this.quantidade < quantidade) {
            System.out.printf("\nNão foi possível vender esta quantidade de %s\n", this.nome);
            return;
        }

        this.quantidade -= quantidade;
        apresentar();
    }

    public void apresentar(){
        System.out.printf("""
                \n-- CONTROLE DE ESTOQUE --
                Nome do Produto: %s
                Preço: %.2f
                Quantidade: %d
                Status: %s
                --------------------------
                VALOR TOTAL: %.2f
                """, this.nome, this.preco, this.quantidade, this.quantidade > 0 ? "Em estoque" : "Esgotado", calculaValorTotal());
    }
}
