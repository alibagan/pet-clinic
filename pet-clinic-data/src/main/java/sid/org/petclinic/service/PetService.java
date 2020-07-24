package sid.org.petclinic.service;

import sid.org.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);
}
