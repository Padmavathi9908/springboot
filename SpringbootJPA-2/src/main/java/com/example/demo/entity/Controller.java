package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repose.ProductRepository;

@org.springframework.stereotype.Controller
public class Controller {

	Product p = new Product();
	@Autowired
	ProductRepository pr;

	@RequestMapping("/")
	public void set() {
		p.setId(4);
		p.setName("mac");
		p.setDescription("awesome");
		p.setPrice(1200);
		pr.save(p);
	}

}
