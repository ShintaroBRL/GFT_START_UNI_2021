package com.gft.exercicio4;

import com.gft.exercicio4.classes.Circulo;
import com.gft.exercicio4.classes.Quadrado;
import com.gft.exercicio4.classes.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		//Instances
		Circulo circulo = new Circulo(2);
		Quadrado quadrado = new Quadrado(2,2);
		Retangulo retangulo = new Retangulo(2,2);
		
		//Outputs
		try {
			System.out.println("Area circulo: "+String.format("%.2f", circulo.areaCirculo()));
			System.out.println("Area quadrado: "+String.format("%.2f", quadrado.areaQuadrado()));
			System.out.println("Area retangulo: "+String.format("%.2f", retangulo.areaRetangulo()));
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

}
