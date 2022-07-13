package com.simplilearn.foodbox.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findByCategory(String category);
}
