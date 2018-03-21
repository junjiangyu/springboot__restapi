package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonService {

  Hashtable<String, Person> persons = new Hashtable<String, Person>();

  public PersonService() {
    Person p = new Person();
    p.setId("1");
    p.setFirstName("Junjiang");
    p.setLastName("yu");
    p.setDOB("23/03/1997");
    p.setGender("Male");
    p.setEmail("yjunji@deakin.edu.au");
    persons.put("1", p);

    p = new Person();
    p.setId("2");
    p.setFirstName("Marry");
    p.setLastName("Carthy");
    p.setDOB("15/05/1998");
    p.setGender("Female");
    p.setEmail("abcd@gmail.com");
    persons.put("2", p);
  }
  public Person getPerson(String id) {
    if (persons.containsKey(id))
      return persons.get(id);
    else
      return null;
  }

  public Person DeletePerson(String id){
    if (persons.containsKey(id))
      return null;
      else
        return null;

  }

  public Hashtable<String, Person> getAll() {
    return persons;
  }
}
