package spring.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	//constructor is the default injection
	
	@Autowired //field injection 
	private BankService service;
	  
	public BankController(BankService service) {
		this.service=service;
	}
	
	//ModelAndView->java object to connect the jsp
	@RequestMapping("createUser") 
	public ModelAndView createUse() {
		
		ModelAndView mv=new ModelAndView();
	    mv.addObject("bankmodel",new BankUser());//object reference/model attribute,
		mv.setViewName("bankuser.jsp");
		return mv;
	}
	
	
	@RequestMapping(value="saveUser",method = RequestMethod.GET)
	public void saveUser(@ModelAttribute BankUser user, 
	    HttpServletRequest req,
		HttpServletResponse res) throws IOException, ServletException {
		
		 String message=service.saveUser(user);
		 
		 
		 res.setContentType("text/html");
		 PrintWriter out=res.getWriter();
		 out.print("<h1><center>");
		 out.print("saved");
		 out.print("</h1></center>");
		 
		 RequestDispatcher d=req.getRequestDispatcher("displayuser");
		 d.include(req, res);
		 
		
	}
	
	
	@RequestMapping("displayuser")
	public ModelAndView displayuser() {  //passing all users in the jsp
		List<BankUser> all=service.getAll();
		ModelAndView mv=new ModelAndView();
	    mv.addObject("allusers",all);
		mv.setViewName("displayuser.jsp");
		return mv;
	}
	
	

}
