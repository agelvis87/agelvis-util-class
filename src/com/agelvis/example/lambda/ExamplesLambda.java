package com.agelvis.example.lambda;

import com.agelvis.example.enums.PersonEnum;
import com.agelvis.example.model.PersonDTO;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * @author Agelvis Carreño
 *
 */
public class ExamplesLambda {

  public static void main(String[] args) {
    
    List<PersonDTO> personList = PersonEnum.createList();

    eval(personList, n -> n != null);
  }

  /**
   * Ejemplo de metodo 'sort' y 'forEach' de java.util.list usando expresiones lambda
   */
  public static void exampleOrder() {

    List<PersonDTO> personList = PersonEnum.createList();

    // Orden por tipo de datos 'int' (Primitivo)
    personList.sort((PersonDTO p1, PersonDTO p2) -> p1.getAge() - p2.getAge());

    System.out.println("========== Orden por Edad ==========");
    personList.forEach(item -> System.out
        .println("Nombre: " + item.getCompleteName() + ", Edad: " + item.getAge()));

    // Orden por tipo de datos 'String'
    personList.sort((PersonDTO p1, PersonDTO p2) -> p1.getName().compareTo(p2.getName()));

    System.out.println("========== Orden por Nombre ==========");
    personList.forEach(item -> System.out
        .println("Nombre: " + item.getCompleteName() + ", Edad: " + item.getAge()));

  }

  /**
   * Ejemplo de metodo 'stream' de java.util.list usando expresiones lambda
   */
  public static void exampleStream() {

    List<PersonDTO> personList = PersonEnum.createList();

    // strem usando filter
    personList =
        personList.stream().filter(item -> item.getAge() > 40).collect(Collectors.toList());

    System.out.println("========== Filtrando lista con stream ==========");

    personList.forEach(item -> System.out
        .println("Nombre: " + item.getCompleteName() + ", Edad: " + item.getAge()));

    // stream usando Comparator
    personList = PersonEnum.createList().stream()
        .sorted(Comparator.comparing(PersonDTO::getBirthDate)).collect(Collectors.toList());

    System.out.println("========== Comparando lista con stream ==========");

    personList.forEach(item -> System.out.println(
        "Nombre: " + item.getCompleteName() + ", Fecha Nacimiento: " + item.getBirthDate()));

  }

  private static void eval(List<PersonDTO> personList, Predicate<PersonDTO> predicate) {
    
    personList.forEach(item -> System.out.println(item.getCompleteName() + predicate.test(item)));

  }

}
