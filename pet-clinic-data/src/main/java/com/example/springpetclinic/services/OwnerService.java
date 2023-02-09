package com.example.springpetclinic.services;

import com.example.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName();

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
