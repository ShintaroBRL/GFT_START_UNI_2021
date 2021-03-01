package com.gft.exercicio1.classes;

public class Eletronico extends Produto{

	public Eletronico(String nome, double valor, int quantidade) {
		super(nome, valor, quantidade);
	}
	
	public double calcularValorTotal() throws Exception {
		double valorTotal = getQuantidade()*getValor();
		if(getQuantidade() != 0) {
			return ((15*(valorTotal))/100)+valorTotal;
		}else{
			throw new Exception("Quantidade menor ou igual a 0");
		}
	}

}
