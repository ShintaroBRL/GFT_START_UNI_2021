package com.gft.exercicio4.classes;

import com.gft.exercicio4.interfaces.Area;

public class Quadrado implements Area {

	private double ladoH;
	private double ladoV;

	public double areaQuadrado() {
		return ladoH*ladoV;
	}
	
	public Quadrado(double ladoH, double ladoV) {
		this.ladoH = ladoH;
		this.ladoV = ladoV;
	}

	@Override
	public double areaRetangulo() throws Exception {
		throw new Exception("Chamada de função ilegal em quadrado!");
	}

	@Override
	public double areaCirculo() throws Exception {
		throw new Exception("Chamada de função ilegal em quadrado!");
	}

}
