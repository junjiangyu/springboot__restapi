package com.example.week2restapi;

public class User {
  private String id;
  private String fname;
  private String lname;
  private String dob;
  private String gender;
  private String email;

  public User() { }

  public User(String id, String fname,String lname, String dob, String gender, String email){
    super();
    this.id = id;
    this.fname = fname;
    this.lname = lname;
    this.dob = dob;
    this.gender = gender;
    this.email = email;
  }

  public String getId() { return id; }

  public void setId(String id) { this.id = id; }

  public String getFname() { return fname; }

  public void setFname(String fname) { this.fname = fname; }

  public String getLname() { return lname; }

  public void setLname(String lname) { this.lname = lname; }

  public String getDob() { return dob; }

  public void setDob(String dob) { this.dob = dob; }

  public String getGender() { return gender; }

  public void setGender(String gender) { this.gender = gender; }

  public String getEmail() { return email; }

  public void setEmail(String email) { this.email = email; }
}
