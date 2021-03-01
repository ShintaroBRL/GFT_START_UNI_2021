package com.gft.exercicio1.classes;

public class Movel extends Produto{

	public Movel(String nome, double valor, int quantidade) {
		super(nome, valor, quantidade);
	}
	
	public double calcularValorTotal() throws Exception {
		double valorTotal = getQuantidade()*getValor();
		if(getQuantidade() < 10 && getQuantidade() != 0) {
			return ((11*(valorTotal))/100)+valorTotal;
		}else if(getQuantidade() >= 10 && getQuantidade() != 0) {
			return ((5*(valorTotal))/100)+valorTotal;
		}else{
			throw new Exception("Quantidade menor ou igual a 0");
		}
	}

}
