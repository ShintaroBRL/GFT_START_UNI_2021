package com.gft.exercicio1;

import com.gft.exercicio1.classes.Caixa;
import com.gft.exercicio1.classes.Eletronico;
import com.gft.exercicio1.classes.Movel;

public class Main {

	public static void main(String[] args){
		
		Movel produtoMovel = new Movel("Mesa", 1000, 2);
		Eletronico produtoEletronico = new Eletronico("Celular", 1000, 1);
		
		Caixa caixa = new Caixa();
		caixa.addItem(produtoEletronico);
		caixa.addItem(produtoMovel);
		caixa.calcularTotal();
	}

}
