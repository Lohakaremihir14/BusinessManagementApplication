package com.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.business.entities.Product;

public interface IProductRepository extends JpaRepository<Product,Integer>
{
	public Product findBypName(String name);

}
