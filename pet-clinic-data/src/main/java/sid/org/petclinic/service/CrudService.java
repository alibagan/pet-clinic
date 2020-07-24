package sid.org.petclinic.service;

import java.util.Set;

/**
 * BAGAN ALI date: 24/07/2020
 * @param <T>
 * @param <ID>
 */

public interface CrudService<T, ID> {
    T findById(ID id);
    Set<T> findAll();
    T save(T object);
    void deleteById(ID id);
    void delete(T object);
}
