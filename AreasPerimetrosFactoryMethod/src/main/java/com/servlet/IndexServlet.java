package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.clases.Circulo;
import com.clases.Cuadrado;
import com.clases.FormInicio;
import com.clases.Rectangulo;
import com.clases.Triangulo;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		// obtenemos variables de formulario
		String figura = request.getParameter("comboFiguras");
		System.out.println("seleccion figuras: " + figura);
		double lado = Double.valueOf(request.getParameter("lado"));
		double base = Double.valueOf(request.getParameter("base"));
		double altura = Double.valueOf(request.getParameter("altura"));
		double radio = Double.valueOf(request.getParameter("radio"));

		// Captura formularo en ámbito de sesion
		HttpSession sesion = request.getSession();
		if (figura.equals("cuadrado")) {
			Cuadrado cuadrado = new Cuadrado(lado);
			System.out.println("Area: " + cuadrado.getArea());
			System.out.println("Perimetro: " + cuadrado.getPerimetro());
			request.setAttribute("area", cuadrado.getArea());
			request.setAttribute("perimetro", cuadrado.getPerimetro());
		} else if(figura.equals("circulo")) {
			Circulo circulo = new Circulo(radio);
			System.out.println("Area: " + circulo.getArea());
			System.out.println("Perimetro: " + circulo.getPerimetro());
			request.setAttribute("area", circulo.getArea());
			request.setAttribute("perimetro", circulo.getPerimetro());
		} else if (figura.equals("triangulo")){
			Triangulo triangulo = new Triangulo(base, altura);
			System.out.println("Area: " + triangulo.getArea());
			System.out.println("Perimetro: " + triangulo.getPerimetro());
			request.setAttribute("area", triangulo.getArea());
			request.setAttribute("perimetro", triangulo.getPerimetro());
		} else if (figura.equals("rectangulo")){
			Rectangulo rectangulo = new Rectangulo(base, altura);
			System.out.println("Area: " + rectangulo.getArea());
			System.out.println("Perimetro: " + rectangulo.getPerimetro());
			request.setAttribute("area", rectangulo.getArea());
			request.setAttribute("perimetro", rectangulo.getPerimetro());
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
