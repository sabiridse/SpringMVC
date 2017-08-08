package com.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.entities.Users;
import com.servicesapi.UsersService;
 
@Controller
public class NavigationController {

	@RequestMapping(value = "/main", method = RequestMethod.POST)//branch1
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
	
}
