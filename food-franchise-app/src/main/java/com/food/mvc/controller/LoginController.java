package com.food.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.food.mvc.dao.OwnerWorkerDao;
import com.food.mvc.model.Owner;

@Controller
public class LoginController {
	
	@Autowired
	private OwnerWorkerDao ownerDao;
	
	@RequestMapping("ownerLogin")
	public void ownerLogin(@RequestParam String email,String password
			,HttpServletRequest req
			,HttpServletResponse res) throws ServletException, IOException {
		
		Owner owner=ownerDao.ownerLogin(email,password);
		
		res.setContentType("text/html");
		if(owner!=null) {
			RequestDispatcher d=req.getRequestDispatcher("ownerhome.jsp");
			d.include(req, res);
			
		}else {
			PrintWriter out=res.getWriter();
			out.print("<center><h1>INVALID CREDENTIALS</center></h1>");
			RequestDispatcher d=req.getRequestDispatcher("index.jsp");
			d.include(req, res);
		}
		
	}

}
