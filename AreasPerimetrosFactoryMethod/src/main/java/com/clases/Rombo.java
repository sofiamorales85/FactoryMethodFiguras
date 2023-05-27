package com.clases;

import com.servlet.FiguraGeometrica;

public class Rombo implements FiguraGeometrica {

	private double diagonal1;
	private double diagonal2;
	private double lado;

	public double getDiagonal1() {
		return diagonal1;
	}
	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}
	public double getDiagonal2() {
		return diagonal2;
	}
	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double getArea() {
		return ((diagonal1 * diagonal2) / 2);
	}
	@Override
	public double getPerimetro() {
		return (lado * 4);
	}

}