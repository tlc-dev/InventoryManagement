package com.tristanchester.inventoryManagementTest.repository;

import org.springframework.data.repository.CrudRepository;

import com.tristanchester.inventoryManagementTest.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
