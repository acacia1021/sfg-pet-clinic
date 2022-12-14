package acacia.springframework.sfgpetclinic.services;

import java.util.Set;

import acacia.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService <Vet, Long>{
    
    //Can be deleted with CrudService extension
    
    // Vet findById(Long id);

    // Vet save(Vet vet);

    // Set<Vet> findAll();
}
