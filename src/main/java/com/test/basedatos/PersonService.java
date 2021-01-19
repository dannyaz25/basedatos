package com.test.basedatos;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonService {
    private final PersonReposity personReposity;

    public PersonService(PersonReposity personReposity){
        this.personReposity = personReposity;
    }

    public Person register(String firstName, String secondName){
        return this.personReposity.save(new Person(1l,firstName,secondName));
    }

    @Transactional( readOnly = true )
    public List<Person> findAll(){
        return this.personReposity.findAll();
    }
}
