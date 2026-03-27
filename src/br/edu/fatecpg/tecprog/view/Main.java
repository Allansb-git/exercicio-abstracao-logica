package br.edu.fatecpg.tecprog.view;
import java.sql.Array;
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

		// SISTEMA ESCOLAR
		Aluno aluno = new Aluno("Kauan", new double[] {7.5, 4.5, 10});

		aluno.boletim();

		// APLICATIVO DE VEÍCULOS
		Carro carro = new Carro("Renalt", 10, 100);
		carro.status();
		carro.viajar(11);
		carro.abastecer(300);
		carro.viajar(15);
		
		//CONVERSOR DE TEMPERATURA
        Temperatura conversor = new Temperatura();
        System.out.print("\nDigite a temperatura em Celsius: ");
        double cel = scan.nextDouble();
        conversor.apresentaResultado(cel);
     
        
        //INDUSTRIA DE BOLAS(ESFERA)
        Esfera bola = new Esfera();
        System.out.print("\nInforme o raio da esfera (em cm): ");
        double r = scan.nextDouble();
        bola.apresentaResultado(r);
        
        //SISTEMA DE VENDAS
        Vendedor funcionario2 = new Vendedor();
        System.out.print("Nome do vendedor: ");
        String nome = scan.nextLine();
        System.out.print("Informe o salário base: R$ ");
        double base = scan.nextDouble();
        System.out.print("Total de vendas no mês: R$ ");
        double vendas = scan.nextDouble();
        System.out.print("Percentual de comissão (apenas números): ");
        double porcetagem = scan.nextDouble();
        funcionario2.folhaPagamento(nome, vendas, porcetagem, base);
	}
}
