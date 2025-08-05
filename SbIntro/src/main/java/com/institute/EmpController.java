package com.institute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController = @Controller + @ResponseBody (returns data directly)
public class EmpController {

	@Autowired 
	EmployeeModel em; /*Putting @@Autowired above EmployeeModel will tell Spring
	to automatically fetch matching object and insert on this page, also known
	as Dependency Injection (DI).
	*/
	
//o/p mentioned in constructor EmployeeModel() printed first of all after running program.
	
	/*@GetMapping is used to tell Spring , 
	which method in your code should handle http request for a specific URL like "/save"
	After running the program go to web server and type localhost:3306/save , then it will
	call below method and shows below returned value on web page. 
	*/
	@GetMapping("/save") 
	public String saveEmp() { //a customized method used to call saveEmployee()
		em.saveEmployee(); /*calling of this method and printing o/p on console is only after
		displaying returned value on webpage.
		 */
		return "Emp saved successfully";
	}
	


}
