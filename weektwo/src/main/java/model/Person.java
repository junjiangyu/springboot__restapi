package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
  //Test comment added
  String id;
  String firstName;
  String lastName;
  String DOB;
  String gender;
  String email;


  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDOB() {
    return DOB;
  }
  public void setDOB(String DOB) { this.DOB = DOB; }

  public String getGender() {
    return gender;
  }
  public void setGender(String gender) { this.gender = gender; }

  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }


}
