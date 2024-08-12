package com.food.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.food.mvc.dao.OwnerWorkerDao;
import com.food.mvc.model.Owner;
import com.food.mvc.model.Worker;


@Controller
public class OwnerController {
	
	@Autowired
	private OwnerWorkerDao ownerDao;
	
@RequestMapping("createOwner")
public ModelAndView createOwner() {
		
		ModelAndView mv=new ModelAndView();
	    mv.addObject("owner",new Owner());//object reference/model attribute,
		mv.setViewName("createowner.jsp");
		return mv;
	}


@RequestMapping("saveOwner")
public void saveOwner(@ModelAttribute Owner owner,
		HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	
//	HttpSession session=req.getSession();
//	Owner owner =(owner) session.getAttribute("owner.jsp");
//	worker.setOwner(owner);
	
	String message=ownerDao.saveOwner(owner);
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<center><h1> "+message+"</center></h1>");
		
		RequestDispatcher d=req.getRequestDispatcher("index.jsp");
		d.include(req, res);
	}

@RequestMapping("createWorker")
public ModelAndView createWorker() {
		
		ModelAndView mv=new ModelAndView();
	    mv.addObject("worker",new Worker());//object reference/model attribute,
		mv.setViewName("creatworker.jsp");
		return mv;
	}


@RequestMapping("saveOwner")
public void saveWorker(@ModelAttribute Worker worker,
		HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	
//	Owner owner = owner.ownerLogin(email,password);
//	
//	HttpSession session=req.getSession();
	
	
	String message=ownerDao.saveWorker(worker);
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<center><h1> "+message+"</center></h1>");
		
		RequestDispatcher d=req.getRequestDispatcher("index.jsp");
		d.include(req, res);
	}

}
