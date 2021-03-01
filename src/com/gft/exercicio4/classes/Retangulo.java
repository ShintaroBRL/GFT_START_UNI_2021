package com.gft.exercicio4.classes;

import com.gft.exercicio4.interfaces.Area;

public class Retangulo implements Area {
	
	private double ladoH;
	private double ladoV;

	public double areaRetangulo() {
		return ladoH*ladoV;
	}
	
	public Retangulo(double ladoH, double ladoV) {
		this.ladoH = ladoH;
		this.ladoV = ladoV;
	}

	@Override
	public double areaQuadrado() throws Exception {
		throw new Exception("Chamada de função ilegal em retangulo!");
	}

	@Override
	public double areaCirculo() throws Exception {
		throw new Exception("Chamada de função ilegal em retangulo!");
	}

}
