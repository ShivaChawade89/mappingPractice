package com.shiv.mappingPra.controller;

import com.shiv.mappingPra.model.Address;
import com.shiv.mappingPra.model.Student;
import com.shiv.mappingPra.service.AddressService;
import com.shiv.mappingPra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping
    public Address addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping
    public List<Address> getAllStudent(){
        return addressService.getAllAddress();
    }

    @DeleteMapping("/{id}")
    public String deleteAddress(@RequestParam Integer id){
        return addressService.deleteAddress(id);
    }
}
