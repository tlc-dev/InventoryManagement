package com.tristanchester.inventoryManagementTest.repository;

import org.springframework.data.repository.CrudRepository;

import com.tristanchester.inventoryManagementTest.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
