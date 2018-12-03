package com.agelvis.example.model;

public class Singleton {

  private static Singleton singleton;

  private String id;
  private String name;
  private String description;

  private Singleton() {
    this.id = "1";
    this.name = "Prueba";
    this.description = "Descripcion";
  }

  public static Singleton getInstance() {

    if (null == singleton) {
      singleton = new Singleton();
    }

    return singleton;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Singleton [id=" + id + ", name=" + name + ", description=" + description + "]";
  }


}
