package com.example.mybatis.service;

import com.alibaba.fastjson.JSONObject;
import com.example.mybatis.entity.*;
import java.text.ParseException;
import java.util.List;

public interface teacherService {

    int teacherRegister(JSONObject jsonObject);
    int teacherLogin(s_teacher teacher);
    int setHomework(JSONObject jsonObject) throws ParseException;//insert Homework
    int insertHomework(s_homework homework);
    List<s_student_homework> reviewHomework();//select * from homework where homeworkId == *
    int insertTeacher(s_teacher teacher);
    int updateHomework(s_homework homework);

}
