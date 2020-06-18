package com.example.mybatis.mapper;

import com.example.mybatis.entity.s_student_homework;
import com.example.mybatis.entity.s_student_homeworkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface s_student_homeworkMapper {
    int countByExample(s_student_homeworkExample example);

    int deleteByExample(s_student_homeworkExample example);

    int deleteByPrimaryKey(Long shid);

    int insert(s_student_homework record);

    int insertSelective(s_student_homework record);

    List<s_student_homework> selectByExampleWithBLOBs(s_student_homeworkExample example);

    List<s_student_homework> selectByExample(s_student_homeworkExample example);

    s_student_homework selectByPrimaryKey(Long shid);

    int updateByExampleSelective(@Param("record") s_student_homework record, @Param("example") s_student_homeworkExample example);

    int updateByExampleWithBLOBs(@Param("record") s_student_homework record, @Param("example") s_student_homeworkExample example);

    int updateByExample(@Param("record") s_student_homework record, @Param("example") s_student_homeworkExample example);

    int updateByPrimaryKeySelective(s_student_homework record);

    int updateByPrimaryKeyWithBLOBs(s_student_homework record);

    int updateByPrimaryKey(s_student_homework record);
}