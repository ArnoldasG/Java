package personal.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> { // T- for TYPE

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
