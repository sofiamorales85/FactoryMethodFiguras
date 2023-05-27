package com.clases;

import com.servlet.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica {
	
	private Double lado;
	
	public Cuadrado(Double lado) {
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}
	public void setLado(Double lado) {
		this.lado = lado;
	}
	@Override
	public double getArea() {
		return lado * lado;
	}
	@Override
	public double getPerimetro() {
		return lado * 4;
	}

}
