package personal.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import personal.springframework.sfgpetclinic.model.Owner;
import personal.springframework.sfgpetclinic.model.Vet;
import personal.springframework.sfgpetclinic.services.OwnerService;
import personal.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Arnoldas");
        owner1.setLastName("Grevas");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Rytis");
        owner2.setLastName("Cicinas");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");
        Vet vet1 = new Vet();
        vet1.setFirstName("Algebrijus");
        vet1.setLastName("Runkelis");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Rimantas");
        vet2.setLastName("Bernadietis");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");


    }
}
