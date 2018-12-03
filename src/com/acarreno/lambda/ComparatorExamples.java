package com.acarreno.lambda;

import com.acarreno.model.PersonDTO;
import com.acarreno.samples.SamplesPerson;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Agelvis Carreno
 */
public class ComparatorExamples {

  public static void main(String[] args) {

    List<PersonDTO> personList = SamplesPerson.createList();

    orderWithInnerClass(personList);

    orderWithLambda(personList);

    orderWithJavaUtilList(personList);

    orderWithCollections(personList);

  }

  /**
   * Ordenar con {@link java.util.Comparator}
   * 
   * @param personList - Lista a ordenar
   */
  private static void orderWithInnerClass(List<PersonDTO> personList) {

    Collections.sort(personList, new Comparator<PersonDTO>() {
      public int compare(PersonDTO p1, PersonDTO p2) {
        return p1.getName().compareTo(p2.getName());
      }
    });

    for (PersonDTO p : personList) {
      System.out.println(
          "Name: " + p.getName() + " " + p.getLastName() + ": " + p.getAge() + " years old");
    }

  }

  /**
   * Ordena con expresiones lambda
   * 
   * @param personList
   */
  private static void orderWithLambda(List<PersonDTO> personList) {

    // Orden usando stream obj
    personList = personList.stream().sorted(Comparator.comparing(PersonDTO::getAge))
        .collect(Collectors.toList());

    personList.forEach(p -> System.out
        .println(p.getAge() + " years old, Name: " + p.getName() + " " + p.getLastName()));

    // Revesar orden
    Collections.reverse(personList);

    personList.forEach(p -> System.out
        .println(p.getAge() + " years old, Name: " + p.getName() + " " + p.getLastName()));

  }

  /**
   * Ordenar con {@link java.util.List}
   * 
   * @param personList
   */
  private static void orderWithJavaUtilList(List<PersonDTO> personList) {

    personList.sort((PersonDTO p1, PersonDTO p2) -> p1.getAge().compareTo(p2.getAge()));

    personList.forEach(p -> System.out
        .println(p.getAge() + " years old, Name: " + p.getName() + " " + p.getLastName()));

  }

  /**
   * Orden con {@link java.util.Collection}
   * 
   * @param personList
   */
  private static void orderWithCollections(List<PersonDTO> personList) {

    Collections.sort(personList,
        (PersonDTO p1, PersonDTO p2) -> p1.getName().compareTo(p2.getName()));

    personList.forEach(p -> System.out.println(
        "Name: " + p.getName() + " " + p.getLastName() + ": " + p.getAge() + " years old"));

  }

}
