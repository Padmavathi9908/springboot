package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repose.ProductRepository;
import com.example.demo.entity.Product;

@SpringBootTest
class SpringbootJpa2ApplicationTests {
	@Autowired
	ApplicationContext context;

	@RequestMapping("/")
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);

		Product product = new Product();
		product.setId(1L);
		product.setName("mac");
		product.setDescription("awesome");
		product.setPrice(1200);
		repository.save(product);

		Optional<Product> result = repository.findById(1L);
		System.out.println(result);

	}
}