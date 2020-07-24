package sid.org.petclinic.service;


import sid.org.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);

}
