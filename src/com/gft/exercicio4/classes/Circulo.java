package com.gft.exercicio4.classes;

import com.gft.exercicio4.interfaces.Area;

public class Circulo implements Area {

	private double raio;

	public double areaCirculo() throws Exception {
		return Math.pow(raio, 2) * Math.PI;
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double areaQuadrado() throws Exception {
		throw new Exception("Chamada de função ilegal em circulo!");
	}
	
	@Override
	public double areaRetangulo() throws Exception {
		throw new Exception("Chamada de função ilegal em circulo!");
	}

}
