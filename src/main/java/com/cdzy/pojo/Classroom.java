package com.cdzy.pojo;


public class Classroom {

  private long id;
  private String classroomname;
  private String floor;
  private String classroomNumber;

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public void setClassroomNumber(String classroomNumber) {
    this.classroomNumber = classroomNumber;
  }

  public String getFloor() {
    return floor;
  }

  public String getClassroomNumber() {
    return classroomNumber;
  }

  public Classroom() {
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getClassroomname() {
    return classroomname;
  }

  public void setClassroomname(String classroomname) {
    this.classroomname = classroomname;
  }

}
