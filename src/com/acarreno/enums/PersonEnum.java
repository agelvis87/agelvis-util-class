package com.acarreno.enums;

import com.acarreno.model.PersonDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public enum PersonEnum {

  PERSON_1("1", "Juan", "Cuesta", 50, LocalDateTime.now(), "Casado"),
  PERSON_2("2", "Mauricio", "Hidalgo", 35, LocalDateTime.now(), "Soltero"),
  PERSON_3("3", "Belen", "Camejo", 30, LocalDateTime.now(), "Soltero"),
  PERSON_4("4", "Hilda", "Torrealba", 55, LocalDateTime.now(), "Casado"),
  PERSON_5("5", "Pedro", "Carmona", 25, LocalDateTime.now(), "Soltero"),
  PERSON_6("6", "Irvin", "Marquez", 20, LocalDateTime.now(), "Soltero"),
  PERSON_7("7", "Cesar", "Torres", 18, LocalDateTime.now(), "Casado"),
  PERSON_8("8", "Ernesto", "Valverde", 40, LocalDateTime.now(), "Soltero"),
  PERSON_9("9", "July", "Acosta", 22, LocalDateTime.now(), "Casado"),
  PERSON_10("10", "Maria", "Castro", 27, LocalDateTime.now(), "Soltero");

  // Fields
  private String id;

  private String name;

  private String lastName;

  private int age;

  private LocalDateTime birthDate;

  private String civilStatus;

  // Constructor
  private PersonEnum(String id, String name, String lastName, int age, LocalDateTime birthDate,
      String civilStatus) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.birthDate = birthDate;
    this.civilStatus = civilStatus;
  }

  // Public methods
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public LocalDateTime getBirthDate() {
    return LocalDateTime.of(birthDate.getYear() - this.age, birthDate.getMonthValue(),
        birthDate.getDayOfMonth(), 0, 0);
  }

  public String getCivilStatus() {
    return civilStatus;
  }

  public static List<PersonDTO> createList() {

    List<PersonDTO> personList = new ArrayList<PersonDTO>();

    PersonDTO person = null;

    for (PersonEnum item : values()) {

      person = new PersonDTO();
      person.setAge(item.getAge());
      person.setBirthDate(item.getBirthDate());
      person.setCivilStatus(item.getCivilStatus());
      person.setId(item.getId());
      person.setLastName(item.getLastName());
      person.setName(item.getName());

      personList.add(person);
    }

    return personList;
  }

}
