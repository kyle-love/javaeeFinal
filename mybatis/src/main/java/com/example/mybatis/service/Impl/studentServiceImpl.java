package com.example.mybatis.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.mybatis.entity.*;
import com.example.mybatis.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Service
public class studentServiceImpl implements studentService {


    @Autowired
    private com.example.mybatis.mapper.s_studentMapper studentMapper;

    @Override
    public int insertStudent(s_student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int studentLogIn(s_student student) {
        s_studentExample example = new s_studentExample();
        s_studentExample.Criteria criteria = example.createCriteria().andStudentidEqualTo(student.getStudentid()).andStudentpasswordEqualTo(student.getStudentpassword());

        List<s_student> list_0 = studentMapper.selectByExample(example);

        if(null == list_0 || list_0.size() <= 0){
            return 0;
        }else{
            return 1;
        }
    }

    @Autowired
    private com.example.mybatis.mapper.s_homeworkMapper homeworkMapper;
    @Override
    public List<s_homework> getAllHomework() {
        s_homeworkExample example = new s_homeworkExample();
        s_homeworkExample.Criteria criteria = example.createCriteria();
        return homeworkMapper.selectByExample(example);
    }


    @Override
    public List<s_homework> selectHomework(JSONObject jsonObject) {
        s_homeworkExample example = new s_homeworkExample();
        StringBuffer buffer = new StringBuffer();
        buffer.append("%");
        String string = new String();
        string = jsonObject.getString("homeworkTitle");
        buffer.append(string);
        buffer.append("%");
        String sqlString = buffer.toString();
        s_homeworkExample.Criteria criteria = example.createCriteria().andHomeworktitleLike(sqlString);
        return homeworkMapper.selectByExample(example);
    }

    @Autowired
    private com.example.mybatis.mapper.s_student_homeworkMapper student_homeworkMapper;
    @Override
    public int submitHomework(JSONObject jsonObject) throws ParseException {
        s_student_homework sh = new s_student_homework();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        sh.setShid(Long.parseLong(jsonObject.getString("shId")));
        sh.setStudentid(Long.parseLong(jsonObject.getString("studentId")));
        sh.setHomeworktitle(jsonObject.getString("homeworkTitle"));
        sh.setHomeworkcontent(jsonObject.getString("homeworkContent"));
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        sh.setCreateTime(date);
        sh.setUpdateTime(date);
        return student_homeworkMapper.insert(sh);
    }

    @Override
    public int insertStudentHomework(s_student_homework student_homework) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        student_homework.setCreateTime(date);
        student_homework.setUpdateTime(date);
        return student_homeworkMapper.insert(student_homework);
    }

    @Override
    public int updateHomework(JSONObject jsonObject) throws ParseException {
        s_student_homework sh = new s_student_homework();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        s_student_homeworkExample example = new s_student_homeworkExample();
        s_student_homeworkExample.Criteria criteria = example.createCriteria().andShidEqualTo(Long.parseLong(jsonObject.getString("shId")));

        sh.setHomeworkcontent(jsonObject.getString("homeworkContent"));
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        sh.setUpdateTime(date);
        return student_homeworkMapper.updateByExampleSelective(sh,example);
    }


    //需要ID 和 content 只改content和updatetime
    @Override
    public int updateHomework(s_student_homework student_homework) {
        s_student_homework sh = new s_student_homework();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        s_student_homeworkExample example = new s_student_homeworkExample();
        s_student_homeworkExample.Criteria criteria = example.createCriteria().andShidEqualTo((student_homework.getShid()));

        sh.setHomeworkcontent(student_homework.getHomeworkcontent());
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        sh.setUpdateTime(date);
        return student_homeworkMapper.updateByExampleSelective(sh,example);
    }

    @Override
    public List<s_student_homework> reviewHomework(Long stuId) {
        s_student_homeworkExample example = new s_student_homeworkExample();
        s_student_homeworkExample.Criteria criteria = example.createCriteria().andStudentidEqualTo(stuId);
        return student_homeworkMapper.selectByExample(example);
    }


}
