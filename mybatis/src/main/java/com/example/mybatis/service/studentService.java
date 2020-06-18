package com.example.mybatis.service;

import com.alibaba.fastjson.JSONObject;
import com.example.mybatis.entity.*;
import java.text.ParseException;
import java.util.List;

public interface studentService {


    int studentLogIn(s_student student);
    List<s_homework> getAllHomework();              //(select *)
    List<s_homework> selectHomework(JSONObject jsonObject);              //(select where *****)
    int submitHomework(JSONObject jsonObject) throws ParseException;      //addNewHomework (insert)
    int insertStudentHomework(s_student_homework student_homework);
    int updateHomework(JSONObject jsonObject) throws ParseException;      //updateHomework (update)
    int updateHomework(s_student_homework student_homework);
    List<s_student_homework> reviewHomework(Long stuId );//select * from homework where homeworkId == *
    int insertStudent(s_student student);
}
