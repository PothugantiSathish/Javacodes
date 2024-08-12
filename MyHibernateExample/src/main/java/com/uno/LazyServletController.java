package com.uno;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/lazy")
public class LazyServletController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("lazyguy.jsp");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id =Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		Lazyguy dto=new Lazyguy();
		dto.setId(id);
		
		dto.setName(name);
		
		LazyDao dao=new LazyDao();
		String message=dao.saveLazy(dto);
		
		resp.setContentType("textt/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1>");
		out.print(message);
		out.print("</h1>");
		
		RequestDispatcher d=req.getRequestDispatcher("displayalllazy.jsp");
		d.include(req,resp);
	}
	
}
