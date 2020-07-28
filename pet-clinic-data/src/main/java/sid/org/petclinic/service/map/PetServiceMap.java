package sid.org.petclinic.service.map;

import sid.org.petclinic.model.Pet;
import sid.org.petclinic.service.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Long, Pet> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
