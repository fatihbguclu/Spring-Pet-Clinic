package guru.springframework.sfgpetclinic.service.map;


import guru.springframework.sfgpetclinic.model.Person;
import guru.springframework.sfgpetclinic.service.CrudService;

import java.util.Set;

public class PersonServiceMap extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {
    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Person person) {
        super.delete(person);
    }

    @Override
    public Person save(Person person) {
        return super.save(person.getId(), person);
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }
}
