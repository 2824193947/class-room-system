package com.cdzy.service;

import com.cdzy.pojo.Classroom;
import com.cdzy.pojo.Student;
import com.cdzy.pojo.Lecture;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;


public interface LoginService {
    //登录
    public Student login(String name, String password);

    //注册
    public int registered(@Param("name") String name, @Param("password") String password,@Param("picture") String picture);

    //注销
    public int deleteUser(@Param("name") String name);

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

    //添加讲座
    public int addleature(@Param("lectureinfo") String  lectureinfo, @Param("classroomname") String classroomname);

    //讲座修改
    public int updateleature(@Param("lectureinfo") String  lectureinfo, @Param("classroomname") String classroomname);

    //讲座删除
    public int deleteleature(@Param("lectureinfo") String lectureinfo);

    //讲座查询
    public ArrayList<Lecture> selectlecture();
}
