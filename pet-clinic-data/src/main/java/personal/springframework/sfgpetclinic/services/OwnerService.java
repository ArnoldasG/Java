package personal.springframework.sfgpetclinic.services;

import personal.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
