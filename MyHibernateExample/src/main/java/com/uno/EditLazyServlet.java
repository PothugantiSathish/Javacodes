package com.uno;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet("/editLazy")
public class EditLazyServlet extends HttpServlet {
	
//	private LazyDao dao;
//	
//	
//	@Override
//	public void init() throws ServletException{
//		this.dao=new LazyDao();
//	}
//	
//	int id;
//	PrintWriter pw;
//	RequestDispatcher rd;
//	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		id=Integer.parseInt(req.getParameter("id"));
//		Lazyguy dto=dao.getLazyguy(id);
//		
//		HttpSession ses=req.getSession();
//		ses.setAttribute("mtdo", dto);
//		resp.setContentType("text/html");
//		
//		pw=resp.getWriter();
//		pw.println("<h1>Edit the details of id"+dto.getId()+"</h1>");
//	}

}
