package com.cdzy.pojo;

public class Lecture {
    private String lectureinfo;
    private String classroomname;

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

    public Lecture(String lectureinfo, String classroomname) {
        this.lectureinfo = lectureinfo;
        this.classroomname = classroomname;
    }
}
