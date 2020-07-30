package sid.org.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sid.org.petclinic.model.Owner;
import sid.org.petclinic.model.Vet;
import sid.org.petclinic.service.OwnerService;
import sid.org.petclinic.service.VetService;
import sid.org.petclinic.service.map.OwnerServiceMap;
import sid.org.petclinic.service.map.VetServiceMap;

@Component
public class DataLaoder implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLaoder(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("bagan");
        owner1.setLastname("ali");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("boualaoui");
        owner2.setLastname("oussama");

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















