package br.edu.fatecpg.tecprog.model;

public class ContaEnergia {

	public void apresentaResultado(double consumoKwh, double valorKwh) {
		double valorBruto = consumoKwh * valorKwh;
		double desconto = 0;

		if (consumoKwh < 100) {
			desconto = valorBruto * 0.10;
		}

		double valorTotal = valorBruto - desconto;

		System.out.println("\n--- Detalhamento da Fatura ---");
		System.out.printf("Consumo Mensal: %.2f kWh\n", consumoKwh);
		System.out.printf("Valor por kWh: R$ %.2f\n", valorKwh);
		System.out.printf("Valor Bruto: R$ %.2f\n", valorBruto);

		if (desconto > 0) {
			System.out.printf("Desconto Aplicado (Tarifa Social): R$ %.2f\n", desconto);
		} else {
			System.out.println("Desconto: R$ 0,00 (Consumo acima da faixa social)");
		}

		System.out.printf("TOTAL A PAGAR: R$ %.2f\n", valorTotal);
	}
}