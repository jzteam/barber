
package cn.jzteam.barber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import cn.jzteam.barber.service.TaskService;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService service;


}
