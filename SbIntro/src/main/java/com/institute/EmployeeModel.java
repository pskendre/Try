package com.institute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*@Component is used to make current class as spring bean class means it's
object creation, destruction in another class is automatically done by spring.
With the help of @@Autowired in another class, Spring will provide object of current
bean class to that another class
*/

@Component
public class EmployeeModel {

	public EmployeeModel() { //not necessary to create this constructor
		System.out.println("Employee model object is created..");
		}
		public void saveEmployee() {
		System.out.println("Employee Info Saved....");
		}

}
