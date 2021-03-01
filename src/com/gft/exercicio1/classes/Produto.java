package com.gft.exercicio1.classes;

public class Produto {
	
	private String nome;
	private double valor;
	private int quantidade;

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public Produto(String nome,double valor,int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
}
