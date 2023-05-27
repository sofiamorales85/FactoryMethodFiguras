package com.clases;

import com.servlet.FiguraGeometrica;

public class FormInicio {

	// ------------------------
	// atributos
	// ------------------------
	private FiguraGeometrica figura;
	private double pi = 0, area = 0, altura = 0, base = 0;


	// ------------------------
	// CONSTRUCTOR
	// ------------------------
	
	public FormInicio() {

	}




	public FiguraGeometrica getFigura() {
		return figura;
	}



	public void setFigura(FiguraGeometrica figura) {
		this.figura = figura;
	}




	public double getPi() {
		return pi;
	}


	public double setPi(double pi) {
		return this.pi = pi;
	}


	public double getArea() {
		return area;
	}


	public double setArea(double area) {
		return this.area = area;
	}


	public double getAltura() {
		return altura;
	}


	public Double setAltura(double altura) {
		return this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public Double setBase(double base) {
		return this.base = base;
	}
	
	

}
