package acacia.springframework.sfgpetclinic.services;

import java.util.Set;

import acacia.springframework.sfgpetclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

    // Can be deleted with CrudService extension

    // Pet findById(Long id);

    // Pet save(Pet pet);

    // Set<Pet> findAll();

}
