package com.gft.exercicio1.classes;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
	private List<Movel> CaixaMovel = new ArrayList<>();
	private List<Eletronico> CaixaEletronico = new ArrayList<>();
	
	public void addItem(Movel item) {
		CaixaMovel.add(item);
	}
	
	public void addItem(Eletronico item) {
		CaixaEletronico.add(item);
	}
	
	public void calcularTotal() {
		double total = 0;
		System.out.format("%10s %10s %5s %10s \n","Tipo","Nome","QTD","Total");
		System.out.print("-----------------------------------------\n");
		try {
			for (Eletronico eletronico : CaixaEletronico) {
					double valorTotal = eletronico.calcularValorTotal();
					total += valorTotal;
					System.out.format("%10s %10s %5s %10s \n","Eletronico",eletronico.getNome(),eletronico.getQuantidade(),String.format("%.2f", valorTotal));
			}
			for (Movel movel : CaixaMovel) {
				double valorTotal = movel.calcularValorTotal();
				total += valorTotal;
				System.out.format("%10s %10s %5s %10s \n","Movel",movel.getNome(),movel.getQuantidade(),String.format("%.2f", valorTotal));
			}
		} catch (Exception e) {
			System.out.println("A quantidade do produto não pode ser menor que 1");
			System.out.println(e);
		}
		System.out.print("-----------------------------------------\n");
		System.out.print("Total da compra: R$"+String.format("%.2f", total));
	}
}
