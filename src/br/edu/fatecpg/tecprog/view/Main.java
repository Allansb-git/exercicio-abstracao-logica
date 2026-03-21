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
		Funcionario funcionario = new Funcionario("Kauan", 7000.00);

		funcionario.apresentaResultado();
		funcionario.apresentaResultado(7.5);
	}

}
