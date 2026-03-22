package br.edu.fatecpg.tecprog.view;
import java.util.Scanner;
import br.edu.fatecpg.tecprog.model.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// SISTEMA DE MARCENARIA
		Retangulo retangulo = new Retangulo(8.5, 7.3);

		retangulo.apresentaResultado();

		// RH DE EMPRESA
		Funcionario funcionario = new Funcionario("Kauan", 15000.00);

		funcionario.apresentaResultado();
		funcionario.apresentaResultado(7.5);

		// BANCO DIGITAL
		ContaBancaria conta = new ContaBancaria("09875643", "Kauan", 542761.27);

		conta.sacar(600000.00);
		conta.depositar(2000);
		conta.sacar(3000);

		// CONTROLE DE ESTOQUE
		Produto produto = new Produto("Vanish em Pó", 32.90, 45);

		produto.apresentar();
		produto.vender(50);
		produto.vender(40);
		System.out.println(produto.quantidade);
	}
}
