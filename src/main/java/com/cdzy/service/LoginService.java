package com.cdzy.service;

import com.cdzy.pojo.Classroom;
import com.cdzy.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;


public interface LoginService {
    //登录
    public Student login(int id, String password);

   //注册
    public int registered(@Param("name") String name, @Param("password") String password,@Param("picture") String picture);

    //修改个人信息
    public int modifyStudent(@Param("id") int id, @Param("name") String name, @Param("password") String password,@Param("picture") String picture);

    //预约教室
    public int orderClassroom(@Param("id") int id,@Param("classRoomName") String classRoomName);

    //查询全部教室
    public ArrayList<Classroom> allClassRoom();

    //学生信息
    public Student studentInfo(@Param("id") int id);

    //修改教室
    public int modifyClassroom(@Param("id") int id, @Param("classRoomName") String classRoomName);

    //新增教室
    public int addClassroom(@Param("classRoomName") String classRoomName);

    //用户名密码查询用户
    public Student userQuery(@Param("name") String name, @Param("password") String password);

}
