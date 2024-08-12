package com.uno;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteLazy")
public class DeleteLazyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		LazyDao dao=new LazyDao();
		String message=dao.deletelazy(id);
		
		PrintWriter out=resp.getWriter();
		out.print("<h1>");
		out.print(message);
		out.print("</h1>");
		
		RequestDispatcher d=req.getRequestDispatcher("displayalllazy.jsp");
		d.include(req,resp);
	
	
	}

}
