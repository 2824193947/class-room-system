package com.cdzy.service;

import com.cdzy.dao.LoginMapper;
import com.cdzy.pojo.Appointment;
import com.cdzy.pojo.Classroom;
import com.cdzy.pojo.Student;
import com.cdzy.pojo.Lecture;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;


    @Override
    public Student login(String name, String password) {
        return loginMapper.login(name,password);
    }

    @Override
    public int registered(String name, String password, String picture) {
        return loginMapper.registered(name,password,picture);
    }

    @Override
    public int deleteUser(String name) {
        return loginMapper.deleteUser(name);
    }

    @Override
    public int modifyStudent(int id, String name, String password, String picture) {
        return loginMapper.modifyStudent(id,name,password,picture);
    }

    @Override
    public int orderClassroom(int id, String classRoomName) {
        return loginMapper.orderClassroom(id,classRoomName);
    }

    @Override
    public ArrayList<Classroom> allClassRoom() {
        return loginMapper.allClassRoom();
    }

    @Override
    public Student studentInfo(int id) {
        return loginMapper.studentInfo(id);
    }

    @Override
    public ArrayList<Student> selectuser() { return  loginMapper.selectuser(); }

    @Override
    public int modifyClassroom(int id, String classRoomName) {
        return loginMapper.modifyClassroom(id,classRoomName);
    }

    @Override
    public int addClassroom(String classRoomName) {
        return loginMapper.addClassroom(classRoomName);
    }

    @Override
    public Student userQuery(String name, String password) {
        return loginMapper.userQuery(name,password);
    }

    @Override
    public int modifyRole(String name, String role) { return loginMapper.modifyRole(name, role); }

    @Override
    public int addleature(String  lectureinfo, String classroomname, String date) { return loginMapper.addleature(lectureinfo, classroomname, date); }

    @Override
    public int updateleature(String  lectureinfo, String classroomname) { return loginMapper.updateleature(lectureinfo, classroomname); }

    @Override
    public int deleteleature(String lectureinfo) { return loginMapper.deleteleature(lectureinfo); }

    @Override
    public ArrayList<Lecture> selectlectureclass(String classroomname) { return loginMapper.selectlectureclass(classroomname); }

    @Override
    public int selectClassRoom(String classroomname) { return loginMapper.selectClassRoom(classroomname); }

    @Override
    public ArrayList<Lecture> selectlecture() { return loginMapper.selectlecture(); }

    @Override
    public int addappointment(String  name, String classroomname, String  lectureinfo, String date, Boolean sign) {
        return loginMapper.addappointment(name, classroomname, lectureinfo, date, sign);
    };

    @Override
    public ArrayList<Appointment> selectappointment(String name) { return loginMapper.selectappointment(name); }

    @Override
    public ArrayList<Appointment> queryappointment(String name,  String  lectureinfo, String classroomname, String  date) {
        return loginMapper.queryappointment(name, lectureinfo, classroomname, date);
    }

    @Override
    public int updateappointment(String  sign, String lectureinfo, String date) { return loginMapper.updateappointment(sign, lectureinfo, date); }

    public int updateappointmentname( String name, String oldname) {return loginMapper.updateappointmentname(name, oldname);}
}
