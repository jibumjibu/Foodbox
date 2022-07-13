package com.simplilearn.foodbox.Product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> ListAll() {
		return repo.findAll();
	}
	
	public void save (Product product) {
		repo.save(product);	
	}
	
	public Product get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public List<Product> fetchByCategory(String category) {
		   return repo.findByCategory(category);
		}
}
