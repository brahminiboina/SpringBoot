package com.wicore.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.wicore.emp.bean.Employee;
import com.wicore.emp.service.EmployeeService;

@Controller
public class EmployeeController {
	 @Autowired
	    private EmployeeService service;

	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        List<Employee> listemployee = service.listAll();
	        model.addAttribute("listemployee", listemployee);
	        System.out.print("Get / ");	
	        return "view";
	    }

	    @GetMapping("/addnew")
	    public String add(Model model) {
	        model.addAttribute("employee", new Employee());
	        return "addnew";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveEmployee(@ModelAttribute("employee") Employee emp) {
	        service.save(emp);
	        return "redirect:/";
	    }

	    @RequestMapping("/edit/{emp_id}")
	    public ModelAndView showEditEmployeePage(@PathVariable(name = "emp_id") int emp_id) {
	        ModelAndView mav = new ModelAndView("addnew");
	       Employee emp = service.get(emp_id);
	        mav.addObject("employee",emp);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{emp_id}")
	    public String deleteemployee(@PathVariable(name = "emp_id") int emp_id) {
	        service.delete(emp_id);
	        return "redirect:/";
	    }
}
