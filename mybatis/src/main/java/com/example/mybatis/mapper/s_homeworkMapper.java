package com.example.mybatis.mapper;

import com.example.mybatis.entity.s_homework;
import com.example.mybatis.entity.s_homeworkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface s_homeworkMapper {
    int countByExample(s_homeworkExample example);

    int deleteByExample(s_homeworkExample example);

    int deleteByPrimaryKey(Long homeworkid);

    int insert(s_homework record);

    int insertSelective(s_homework record);

    List<s_homework> selectByExample(s_homeworkExample example);

    s_homework selectByPrimaryKey(Long homeworkid);

    int updateByExampleSelective(@Param("record") s_homework record, @Param("example") s_homeworkExample example);

    int updateByExample(@Param("record") s_homework record, @Param("example") s_homeworkExample example);

    int updateByPrimaryKeySelective(s_homework record);

    int updateByPrimaryKey(s_homework record);
}