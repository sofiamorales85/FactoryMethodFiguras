package com.clases;

import com.servlet.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {
	
	private Double base;
	private Double altura;
	
	public Rectangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	@Override
	public double getArea() {
		return base * altura;
	}
	@Override
	public double getPerimetro() {
		return (base * 2) + (altura * 2);
	}

}