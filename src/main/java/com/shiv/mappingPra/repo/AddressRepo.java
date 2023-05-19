package com.shiv.mappingPra.repo;

import com.shiv.mappingPra.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
