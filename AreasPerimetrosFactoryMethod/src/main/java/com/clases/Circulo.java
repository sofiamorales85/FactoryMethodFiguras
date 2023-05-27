package com.clases;

import com.servlet.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
	
	private double radio;
	static final double pi = 3.1415;

	public Circulo(double radio) {
		this.radio = radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public double getArea() {
		return (pi * (radio * radio));
	}
	@Override
	public double getPerimetro() {
		return ((2 * pi) * radio);
	}

}
