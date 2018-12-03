package com.acarreno.model;

import com.acarreno.enums.CivilStatusType;
import com.acarreno.enums.GenderType;

import java.time.LocalDateTime;

public class PersonDTO {

  private String id;

  private String name;

  private String lastName;

  private int age;

  private LocalDateTime birthDate;

  private CivilStatusType civilStatus;

  private GenderType gender;

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

  public Integer getAge() {
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

  public CivilStatusType getCivilStatus() {
    return civilStatus;
  }

  public void setCivilStatus(CivilStatusType civilStatus) {
    this.civilStatus = civilStatus;
  }

  public GenderType getGender() {
    return gender;
  }

  public void setGender(GenderType gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "PersonDTO [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age
        + ", birthDate=" + birthDate + ", civilStatus=" + civilStatus + ", gender=" + gender + "]";
  }

}
