package sid.org.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sid.org.petclinic.model.Owner;
import sid.org.petclinic.model.Pet;
import sid.org.petclinic.model.PetType;
import sid.org.petclinic.model.Vet;
import sid.org.petclinic.service.OwnerService;
import sid.org.petclinic.service.PetTypeService;
import sid.org.petclinic.service.VetService;

import java.time.LocalDate;

@Component
public class DataLaoder implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLaoder(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType petDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType petCat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("bagan");
        owner1.setLastname("ali");
        owner1.setAddress("144 rue la fayette");
        owner1.setTelephone("02478374774");
        owner1.setCity("Paris");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(petDog);
        mikesPet.setOwner(owner1);
        mikesPet.setBithDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("boualaoui");
        owner2.setLastname("oussama");
        owner2.setAddress("150 avenue hassan 2");
        owner2.setTelephone("0837837773");
        owner2.setCity("Beni Mellal");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(petCat);
        fionasCat.setOwner(owner2);
        fionasCat.setBithDate(LocalDate.now());
        fionasCat.setName("Rosco cat");
        owner2.getPets().add(fionasCat);


        ownerService.save(owner2);

        System.out.println("Loader Owners ............");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstname("nazouli");
        vet1.setLastname("hamza");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstname("nabil");
        vet2.setLastname("maroussi");

        vetService.save(vet2);
        System.out.println("Loaded Vets ...........");

    }
}















