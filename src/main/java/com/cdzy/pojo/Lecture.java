package com.cdzy.pojo;

public class Lecture {
    private String lectureinfo;
    private String classroomname;
    private String date;
    private Boolean sign;

    public Boolean getSign() {
        return sign;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }


    public String getLectureinfo() {
        return lectureinfo;
    }

    public void setLectureinfo(String lectureinfo) {
        this.lectureinfo = lectureinfo;
    }

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname;
    }

    public Lecture(String lectureinfo, String classroomname, String date) {
        this.lectureinfo = lectureinfo;
        this.classroomname = classroomname;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
