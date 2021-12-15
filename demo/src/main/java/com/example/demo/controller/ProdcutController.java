package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ProductService;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
@SpringBootApplication



@RestController
public class ProdcutController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}
	
	@PostMapping("/products")
	public List<Product> addProduct(@RequestBody List<Product> products)
	{
		return service.saveProduct(products);
	}
	@GetMapping("/products")
	public List<Product> findAllProducts()
	{
		return service.getProduct();
	}
	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable int id)
	{
		return service.getProductById(id);
	}
	@GetMapping("/products/{name}")
	public Product findProductByName(@PathVariable String name)
	{
	return service.getProductByName(name);	
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@RequestBody Product product)
	{
		return service.updateProduct(product);
		
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}
	
	
	
	

}
