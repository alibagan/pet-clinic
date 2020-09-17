package sid.org.petclinic.service.map;

import org.springframework.stereotype.Service;
import sid.org.petclinic.model.PetType;
import sid.org.petclinic.service.PetTypeService;

import java.util.Set;
@Service
public class PetTypeMapService extends AbstractMapService<Long, PetType> implements PetTypeService {
    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }
}
