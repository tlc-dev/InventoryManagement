package com.tristanchester.inventoryManagementTest.repository;

import org.springframework.data.repository.CrudRepository;

import com.tristanchester.inventoryManagementTest.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
