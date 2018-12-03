package com.agelvis.example.model;

import java.time.LocalDateTime;

public class PersonDTO {

  private String id;

  private String name;

  private String lastName;

  private int age;

  private LocalDateTime birthDate;

  private String civilStatus;

  public String getCompleteName() {
    return name + " " + lastName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public LocalDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDateTime birthDate) {
    this.birthDate = birthDate;
  }

  public String getCivilStatus() {
    return civilStatus;
  }

  public void setCivilStatus(String civilStatus) {
    this.civilStatus = civilStatus;
  }

}
