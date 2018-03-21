package controller;

import java.util.Hashtable;
import java.util.List;

import model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import service.PersonService;

@RestController
@RequestMapping("/persons")

public class PersonController {
  public static final Logger logger = LoggerFactory.getLogger(PersonController.class);

  @Autowired
  PersonService ps;

  @RequestMapping("/all")
  public Hashtable<String, Person> getAll() {
    return ps.getAll();
  }

  //post user
  @RequestMapping(value = "{id}")
  public Person getPerson(@PathVariable("id") String id) {
    return ps.getPerson(id);
  }



}

