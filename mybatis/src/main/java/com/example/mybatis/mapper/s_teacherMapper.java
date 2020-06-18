package com.example.mybatis.mapper;

import com.example.mybatis.entity.s_teacher;
import com.example.mybatis.entity.s_teacherExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface s_teacherMapper {
    int countByExample(s_teacherExample example);

    int deleteByExample(s_teacherExample example);

    int deleteByPrimaryKey(Long teacherid);

    int insert(s_teacher record);

    int insertSelective(s_teacher record);

    List<s_teacher> selectByExample(s_teacherExample example);

    s_teacher selectByPrimaryKey(Long teacherid);

    int updateByExampleSelective(@Param("record") s_teacher record, @Param("example") s_teacherExample example);

    int updateByExample(@Param("record") s_teacher record, @Param("example") s_teacherExample example);

    int updateByPrimaryKeySelective(s_teacher record);

    int updateByPrimaryKey(s_teacher record);
}