package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
	private PrintWriter printWriter;
	private double num1;
	private double num2;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		printWriter = response.getWriter();
		num1 =Double.valueOf(request.getParameter("numberOne"));
		num2 =Double.parseDouble(request.getParameter("numberTwo"));
		printWriter.println(num1 + num2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		printWriter = response.getWriter();
		num1 =Double.valueOf(request.getParameter("numberOne"));
		num2 =Double.parseDouble(request.getParameter("numberTwo"));
		printWriter.println(num1 + num2);
	}

}
