package com.clases;

import com.servlet.FiguraGeometrica;

public class Trapecio implements FiguraGeometrica {
	
	private double baseMayor;
	private double baseMenor;
	private double ladoA;
	private double ladoB;
	private double altura;

	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double getArea() {
		return (baseMayor + baseMenor) * (altura / 2);
	}
	@Override
	public double getPerimetro() {
		return (baseMayor + baseMenor + ladoA + ladoB);
	}

}
