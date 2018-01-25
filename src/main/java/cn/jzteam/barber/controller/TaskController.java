
package cn.jzteam.barber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import cn.jzteam.barber.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TaskService service;

	@RequestMapping("test")
	@ResponseBody
	public String test(){
		return "test";
	}

}
