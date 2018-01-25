
package cn.jzteam.barber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import cn.jzteam.barber.service.EmployeeService;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;


}
