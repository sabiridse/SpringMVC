package com.controllers;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.entities.Terminals;
import com.entities.Users;
import com.servicesapi.TerminalsService;
import com.servicesapi.UsersService;
 
@Controller
//@RequestMapping("table")
public class TableController {
	
	@Autowired
	TerminalsService terminalsService;
	
	

	@RequestMapping(value = "/terminals", method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("/terminals");
        return view;
    }
	

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public String findTerm(@RequestParam("serchTerm") String termFind, Model model) throws SQLException {
			
		List<Terminals> terms = terminalsService.getTerms(termFind);
		model.addAttribute("terms", terms);		
		return "terminals";
	}
	
	
	
	
	
}
