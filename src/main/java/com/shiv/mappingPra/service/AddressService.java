package com.shiv.mappingPra.service;

import com.shiv.mappingPra.model.Address;
import com.shiv.mappingPra.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    public Address addAddress(Address address) {
        return  addressRepo.save(address);
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public String deleteAddress(Integer id) {
        addressRepo.deleteById(id);
        return "deleted";
    }
}
