package com.gl.EmployeeManagement.Controller;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.EmployeeManagement.Entity.Employee;
import com.gl.EmployeeManagement.Service.EmployeeService;

public class EmployeeController {
	
	public EmployeeController() {
		System.out.println("Employee controller");
	}
	@Autowired
	private EmployeeService EmployeeService;
	@GetMapping
	public String getAllEmployee(Map<String, List<Employee>> map)
	{
		System.out.println("get Employee");
		List<Employee> Employee = this.EmployeeService.findAll();
		map.put("Employee", Employee);
		return "Employeelist";
	}
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Employee theEmployee = new Employee();

		theModel.addAttribute("Employee", theEmployee);

		return "Employeeaddform";
	}

	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("EmployeeId") int theId,
			Model theModel) {

		// get the Book from the service
		Employee theEmployee = EmployeeService.findById(theId);


		// set Book as a model attribute to pre-populate the form
		theModel.addAttribute("Employee", theEmployee);

		// send over to our form
		return "employeeaddform";			
	}


	@RequestMapping("/save")
	public String saveEmployee(@RequestParam("Employeeid") int Employeeid,
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,@RequestParam("email") String email) {

		System.out.println(Employeeid);
		Employee theemployee;
		if(Employeeid!=0)
		{
			theemployee=EmployeeService.findById(Employeeid);
			theemployee.setfirstname(firstname);
			theemployee.setlastname(lastname);
			theemployee.setemail(email);
		}
		else
			theemployee=new Employee(firstname, lastname, email);
		// save the Book
		EmployeeService.save(theemployee);

		// use a redirect to prevent duplicate submissions
		return "redirect:/employee";

	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) {

		// delete the Book
		EmployeeService.deleteById(theId);

		// redirect to /Books/list
		return "redirect:/books";

	}


	@RequestMapping("/search")
	public String search(@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,
			Model theModel) {

		// check names, if both are empty then just give list of all Books

		if (firstname.trim().isEmpty() && lastname.trim().isEmpty()) {
			return "redirect:/books/list";
		}
		else {
			// else, search by first name and last name
			List<Employee> theEmployee =
					EmployeeService.searchBy(firstname, lastname);

			// add to the spring model
			theModel.addAttribute("Employee", theEmployee);

			// send to list-employee
			return "employeelist";
		}

	}
	
	@RequestMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		System.out.println(user);
		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() 
			+ ", you have permission to access this page!");
		} else {
			model.addObject("msg", 
			"You do not have permission to access this page!");
		}

		model.setViewName("403");
		return model;

	}

}
