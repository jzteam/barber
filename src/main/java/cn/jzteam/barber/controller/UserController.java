
package cn.jzteam.barber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import cn.jzteam.barber.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;


}
