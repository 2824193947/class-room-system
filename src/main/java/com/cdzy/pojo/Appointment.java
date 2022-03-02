package com.cdzy.pojo;

public class Appointment {
    private String name;
    private String classroomname;
    private String lectureinfo;
    private String date;
    private String sign;

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLectrueinfo() {
        return lectureinfo;
    }

    public void setLectrueinfo(String lectrueinfo) {
        this.lectureinfo = lectrueinfo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
