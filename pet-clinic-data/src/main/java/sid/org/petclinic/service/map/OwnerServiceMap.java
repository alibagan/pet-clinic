package sid.org.petclinic.service.map;

import org.springframework.stereotype.Service;
import sid.org.petclinic.model.Owner;
import sid.org.petclinic.model.Pet;
import sid.org.petclinic.service.OwnerService;
import sid.org.petclinic.service.PetService;
import sid.org.petclinic.service.PetTypeService;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Long, Owner> implements OwnerService {
    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {

        if (object != null){
            if (object.getPets() != null){
                object.getPets().forEach(pet ->{
                    if (pet.getPetType() != null){
                        if (pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet type is required");
                    }
                    if (pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else{
            return null;
        }



    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findByLastName(String lastname) {
        return findByLastName(lastname);
    }
}
