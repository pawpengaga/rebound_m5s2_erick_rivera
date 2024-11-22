package com.reboundcinco.controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ExaminaContrasenia
 */
@WebServlet("/ExaminaContrasenia")
public class ExaminaContrasenia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExaminaContrasenia() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String accion = request.getParameter("pass");
		String password = request.getParameter("passToText");

		if ("fuerte".equals(accion) && !passFuerte(password)) {
			
		} else if ("debil".equals(accion) && !passFuerte(password)) {
			System.out.println("La pass es debil");
		}
		System.out.println("Introduce algo...");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		request.setAttribute("passToText", password);
		if(!passFuerte(password)){
			request.setAttribute("pass", false);
		} else if (passFuerte(password)){
			request.setAttribute("pass", true);
		}
		request.getRequestDispatcher("Respuesta.jsp").forward(request, response);
	}

	private boolean passFuerte(String pass){
		// Si contiene al menos 4 MAYUS, 3 minus, 3 num 
		String regex = "^(?=(.*[A-Z]){4,})(?=(.*[a-z]){3,})(?=(.*[0-9]){3,}).*$";
		if (pass.matches(regex)) {
			return true;
		}
		return false;
	}

}
