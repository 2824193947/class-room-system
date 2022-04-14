package com.cdzy.dao;

import com.cdzy.pojo.Appointment;
import com.cdzy.pojo.Classroom;
import com.cdzy.pojo.Student;
import com.cdzy.pojo.Lecture;
import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Date;

public interface LoginMapper {


    //登录
    public Student login(@Param("name") String name, @Param("password") String password);

    //注册
    public int registered(@Param("name") String name, @Param("password") String password,@Param("picture") String picture);

    // 注销
    public int deleteUser(@Param("name") String name);

    //修改个人信息
    public int modifyStudent(@Param("id") int id, @Param("name") String name, @Param("password") String password,@Param("picture") String picture);

    // 查询所有人
    public ArrayList<Student> selectuser();

    // 修改权限
    public int modifyRole(@Param("name") String name, @Param("role") String role);

    //预约教室
    public int orderClassroom(@Param("id") int id,@Param("classRoomName") String classRoomName);

    //查询全部教室
    public ArrayList<Classroom> allClassRoom();

    //学生信息
    public Student studentInfo(@Param("id") int id);

    //修改教室
    public int modifyClassroom(@Param("classRoomName") String classRoomName, @Param("floor") String floor, @Param("classroomNumber") String classroomNumber);

    //新增教室
    public int addClassroom(@Param("classRoomName") String classRoomName, @Param("floor") String floor, @Param("classroomNumber") String classroomNumber);

    // 删除教室
    public int deleteClassroom(@Param("classroomname") String classroomname);

    //用户名密码查询用户
    public Student userQuery(@Param("name") String  name, @Param("password") String password);

    //添加讲座
    public int addleature(@Param("lectureinfo") String  lectureinfo, @Param("classroomname") String classroomname, @Param("date") String date);

    //讲座修改
    public int updateleature(@Param("lectureinfo") String  lectureinfo, @Param("classroomname") String classroomname);

    //讲座删除
    public int deleteleature(String lectureinfo);

    // 查找是否有此class
    public ArrayList<Lecture> selectlectureclass(String classroomname);

    // 查询教室
    public int selectClassRoom(String classroomname);

    //讲座查询
    public ArrayList<Lecture> selectlecture();

    // 讲座预约
    public int addappointment(@Param("name") String  name, @Param("classroomname") String classroomname, @Param("lectureinfo") String  lectureinfo, @Param("date") String date, @Param("sign")  Boolean sign);

    // 查询预约讲座
    public ArrayList<Appointment> selectappointment(@Param("name") String  name);

    public ArrayList<Appointment> queryappointment(@Param("name") String  name, @Param("lectureinfo") String  lectureinfo, @Param("classroomname") String classroomname, @Param("date") String  date);

    // 签到
    public int updateappointment(@Param("sign") String  sign, @Param("lectureinfo") String lectureinfo, @Param("date") String date);

    public int updateappointmentname(@Param("name") String name, @Param("oldname") String oldname);
}
