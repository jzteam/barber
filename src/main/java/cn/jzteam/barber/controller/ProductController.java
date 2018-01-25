
package cn.jzteam.barber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import cn.jzteam.barber.service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;


}
