package com.cdzy.pojo;


public class Student {

  private long id;
  private String name;
  private String pwd;
  private String state;
  private String picture;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public Student(long id, String name, String pwd, String state, String picture) {
    this.id = id;
    this.name = name;
    this.pwd = pwd;
    this.state = state;
    this.picture = picture;
  }

  public Student(long id, String name, String state, String picture) {
    this.id = id;
    this.name = name;
    this.state = state;
    this.picture = picture;
  }

  public Student() {
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", pwd='" + pwd + '\'' +
            ", state='" + state + '\'' +
            ", picture='" + picture + '\'' +
            '}';
  }
}
