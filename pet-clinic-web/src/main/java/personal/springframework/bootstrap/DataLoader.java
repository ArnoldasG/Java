package personal.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import personal.springframework.sfgpetclinic.model.Owner;
import personal.springframework.sfgpetclinic.model.Vet;
import personal.springframework.sfgpetclinic.services.OwnerService;
import personal.springframework.sfgpetclinic.services.VetService;
import personal.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import personal.springframework.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Arnoldas");
        owner1.setLastName("Grevas");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Rytis");
        owner1.setLastName("Cicinas");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Algebrijus");
        vet1.setLastName("Runkelis");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Rimantas");
        vet1.setLastName("Bernadietis");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
