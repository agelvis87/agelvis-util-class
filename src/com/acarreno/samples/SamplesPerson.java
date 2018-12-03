package com.acarreno.samples;

import com.acarreno.enums.CivilStatusType;
import com.acarreno.enums.GenderType;
import com.acarreno.model.PersonDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Agelvis Carreno
 *
 */
public enum SamplesPerson {

  PERSON_1("1", "Juan", "Cuesta", 50, LocalDateTime.now(), CivilStatusType.MARRIED,
      GenderType.MALE),

  PERSON_2("2", "Mauricio", "Hidalgo", 35, LocalDateTime.now(), CivilStatusType.SINGLE,
      GenderType.MALE),

  PERSON_3("3", "Belen", "Camejo", 30, LocalDateTime.now(), CivilStatusType.SINGLE,
      GenderType.FEMALE),

  PERSON_4("4", "Hilda", "Torrealba", 55, LocalDateTime.now(), CivilStatusType.WIDOWER,
      GenderType.FEMALE),

  PERSON_5("5", "Pedro", "Carmona", 25, LocalDateTime.now(), CivilStatusType.MARRIED,
      GenderType.MALE),

  PERSON_6("6", "Irvin", "Marquez", 20, LocalDateTime.now(), CivilStatusType.SINGLE,
      GenderType.MALE),

  PERSON_7("7", "Cesar", "Torres", 18, LocalDateTime.now(), CivilStatusType.SINGLE,
      GenderType.MALE),

  PERSON_8("8", "Ernesto", "Valverde", 40, LocalDateTime.now(), CivilStatusType.MARRIED,
      GenderType.MALE),

  PERSON_9("9", "July", "Acosta", 22, LocalDateTime.now(), CivilStatusType.SINGLE,
      GenderType.FEMALE),

  PERSON_10("10", "Maria", "Castro", 27, LocalDateTime.now(), CivilStatusType.SINGLE,
      GenderType.FEMALE);

  // ==================
  // Atributos privados
  // ==================

  private String id;

  private String name;

  private String lastName;

  private int age;

  private LocalDateTime birthDate;

  private CivilStatusType civilStatus;

  private GenderType gender;


  // =============
  // Constructores
  // =============

  private SamplesPerson(String id, String name, String lastName, int age, LocalDateTime birthDate,
      CivilStatusType civilStatus, GenderType gender) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.birthDate = birthDate;
    this.civilStatus = civilStatus;
    this.gender = gender;
  }

  // ================
  // Metodos publicos
  // ================

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

  public GenderType getGender() {
    return gender;
  }

  public CivilStatusType getCivilStatus() {
    return civilStatus;
  }

  // =================
  // Metodos estaticos
  // =================

  public static List<PersonDTO> createList() {

    List<PersonDTO> personList = new ArrayList<>();

    PersonDTO person = null;

    for (SamplesPerson item : values()) {

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
