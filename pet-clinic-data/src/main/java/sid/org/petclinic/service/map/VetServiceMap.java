package sid.org.petclinic.service.map;

import sid.org.petclinic.model.Vet;
import sid.org.petclinic.service.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Long, Vet> implements CrudService<Vet, Long> {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
