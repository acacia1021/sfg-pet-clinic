package acacia.springframework.sfgpetclinic.services;

import java.util.Set;

import acacia.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    // Can be deleted with CrudService extension

    // Owner findById(Long id);

    // Owner save(Owner owner);

    // Set<Owner> findAll();
}
