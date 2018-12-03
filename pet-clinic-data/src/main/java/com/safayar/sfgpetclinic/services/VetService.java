package com.safayar.sfgpetclinic.services;

import com.safayar.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{
    Vet findByLastName(String lastName);
}
