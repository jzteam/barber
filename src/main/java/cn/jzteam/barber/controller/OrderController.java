
package cn.jzteam.barber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import cn.jzteam.barber.service.OrderService;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService service;


}
