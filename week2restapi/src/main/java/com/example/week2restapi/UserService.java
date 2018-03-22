package com.example.week2restapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private List<User> users = new ArrayList<>(Arrays.asList(
      new User("1","Junjiang","yu","23/03/1997","Male","yjunji@deakin.edu.au"),
      new User("2","Hongda","Xie","12/08/1991","Male","hongdax@deakin.edu.au"),
      new User("3","Tom","Cat","23/02/1992","Female","TC@deakin.edu.au")

  ));

  public List<User> GetAllUser() {
    return users;
  }

  public User getuser(String id){
    return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
  }


  public void createuser(User User) {
    users.add(User);
  }
  
  
  public void deleteuser(String id) {
    users.removeIf(t -> t.getId().equals(id));

  }

  public void updateuser(User user, String id) {

    for(int i = 0; i < users.size();i++){
      User t = users.get(i);

      if (t.getId().equals(id)){
        users.set(i,user);
        return;
      }

    }
  }
}
