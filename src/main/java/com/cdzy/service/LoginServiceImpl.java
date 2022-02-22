package com.cdzy.service;

import com.cdzy.dao.LoginMapper;
import com.cdzy.pojo.Classroom;
import com.cdzy.pojo.Student;
import com.cdzy.pojo.Lecture;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
    public int addleature(String  lectureinfo, String classroomname) { return loginMapper.addleature(lectureinfo, classroomname); }

    @Override
    public int updateleature(String  lectureinfo, String classroomname) { return loginMapper.updateleature(lectureinfo, classroomname); }

    @Override
    public int deleteleature(String lectureinfo) { return loginMapper.deleteleature(lectureinfo); }

    @Override
    public ArrayList<Lecture> selectlecture() { return loginMapper.selectlecture(); }
}
