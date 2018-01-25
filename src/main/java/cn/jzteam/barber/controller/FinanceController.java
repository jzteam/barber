
package cn.jzteam.barber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import cn.jzteam.barber.service.FinanceService;
import org.springframework.stereotype.Controller;

@Controller
public class FinanceController {
	
	@Autowired
	private FinanceService service;


}
