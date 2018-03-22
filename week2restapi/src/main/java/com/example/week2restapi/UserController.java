package com.example.week2restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private UserService userservice;

  //retrieve all user
  @RequestMapping("/Users")
  public List<User> getAllTopics() {
    return userservice.GetAllUser();

  }

  //retrieve single user
  @RequestMapping("/Users/{id}")
  public User getuser(@PathVariable String id) {
    return userservice.getuser(id);

  }

  //create a new user
  @RequestMapping(method = RequestMethod.POST, value = "/Users")
  public void createuser(@RequestBody User User) {
    userservice.createuser(User);
  }

  @RequestMapping(method = RequestMethod.PUT,value = "/Users/{id}")
  public void updatetopic(@RequestBody User user,@PathVariable String id){
    userservice.updateuser(user,id);
  }


  @RequestMapping(method = RequestMethod.DELETE,value = "/Users/{id}")
  public void deletetopic(@PathVariable String id){
    userservice.deleteuser(id);
  }


}
