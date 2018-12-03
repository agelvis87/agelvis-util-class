package com.agelvis.example.main;

import com.agelvis.example.model.Singleton;

public class Pruebas {

  public static void main(String args[]) {

    Singleton example1 = Singleton.getInstance();
    Singleton example2 = Singleton.getInstance();

    if (example1 == example2) {
      System.out.println("Iguales");
    }

    example2.setId("2");

    System.out.println(example1.hashCode());
    System.out.println(example2.hashCode());

    System.out.println("1=> " + example1);
    System.out.println("2=> " + example2);

  }

}
