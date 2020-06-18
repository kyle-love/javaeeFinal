package com.example.mybatis.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.mybatis.entity.*;
import com.example.mybatis.service.teacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class teacherServiceImpl implements teacherService {

    @Override
    public int teacherRegister(JSONObject jsonObject) {
        return 0;
    }


    @Autowired
    private com.example.mybatis.mapper.s_teacherMapper s_teacherMapper;

    @Override
    public int insertTeacher(s_teacher teacher) {
        return s_teacherMapper.insert(teacher);
    }

    @Override
    public int teacherLogin(s_teacher teacher) {

        s_teacherExample example = new s_teacherExample();
        s_teacherExample.Criteria criteria = example.createCriteria().andTeacheridEqualTo(teacher.getTeacherid()).andTeacherpasswordEqualTo(teacher.getTeacherpassword());

        List<s_teacher> list_0 = s_teacherMapper.selectByExample(example);

        if(null == list_0 || list_0.size() <= 0){
            return 0;
        }else{
            return 1;
        }

    }

    @Autowired
    private com.example.mybatis.mapper.s_homeworkMapper homeworkMapper;
    @Override
    public int setHomework(JSONObject jsonObject) throws ParseException {
        s_homework homework = new s_homework();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        homework.setHomeworkid(Long.parseLong(jsonObject.getString("homeworkId")));
        homework.setHomeworktitle(jsonObject.getString("homeworkTitle"));
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        homework.setCreateTime(date);
        homework.setUpdateTime(date);

        return homeworkMapper.insert(homework);
    }

    @Override
    public int insertHomework(s_homework homework) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        homework.setCreateTime(date);
        homework.setUpdateTime(date);
        return homeworkMapper.insert(homework);
    }



    @Autowired
    private com.example.mybatis.mapper.s_student_homeworkMapper student_homeworkMapper;
    @Override
    public List<s_student_homework> reviewHomework() {
        s_student_homeworkExample example = new  s_student_homeworkExample();
        s_student_homeworkExample.Criteria criteria = example.createCriteria();
        return student_homeworkMapper.selectByExample(example);
    }





    @Override
    public int updateHomework(s_homework homework) {
        s_homework homework_1 = new s_homework();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        s_homeworkExample example = new s_homeworkExample();
        s_homeworkExample.Criteria criteria = example.createCriteria().andHomeworkidEqualTo((homework.getHomeworkid()));

        homework_1.setHomeworktitle(homework.getHomeworktitle());
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        homework_1.setUpdateTime(date);
        return homeworkMapper.updateByExampleSelective(homework_1,example);
    }

}
