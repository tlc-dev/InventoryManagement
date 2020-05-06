package com.tristanchester.inventoryManagementTest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tristanchester.inventoryManagementTest.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
