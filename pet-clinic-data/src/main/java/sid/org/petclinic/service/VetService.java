package sid.org.petclinic.service;

import sid.org.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet finById(Long id);
    Set<Vet> findAll();
    Vet save(Vet vet);
}
