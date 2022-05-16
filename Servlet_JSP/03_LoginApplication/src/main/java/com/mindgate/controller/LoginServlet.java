package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private PrintWriter printWriter;
	private String loginId;
	private String password;
	private PrintWriter out;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		loginId = request.getParameter("loginid");
		password = request.getParameter("password");

		if (loginId.equals("sha1") && password.equals("12")) {
			out.println("Login Successfully");
			out.println("Welcome User");
		} else {
			out.println("Invalid UserID and Password");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		loginId = request.getParameter("loginid");
		password = request.getParameter("password");

		if (loginId.equals("sha1") && password.equals("12")) {
			out.println("Login Successfully");
			out.println("Welcome User");
		} else {
			out.println("Invalid UserID and Password");
		}

	}

}
