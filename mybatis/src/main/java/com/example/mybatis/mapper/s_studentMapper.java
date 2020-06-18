package com.example.mybatis.mapper;

import com.example.mybatis.entity.s_student;
import com.example.mybatis.entity.s_studentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface s_studentMapper {
    int countByExample(s_studentExample example);

    int deleteByExample(s_studentExample example);

    int deleteByPrimaryKey(Long studentid);

    int insert(s_student record);

    int insertSelective(s_student record);

    List<s_student> selectByExample(s_studentExample example);

    s_student selectByPrimaryKey(Long studentid);

    int updateByExampleSelective(@Param("record") s_student record, @Param("example") s_studentExample example);

    int updateByExample(@Param("record") s_student record, @Param("example") s_studentExample example);

    int updateByPrimaryKeySelective(s_student record);

    int updateByPrimaryKey(s_student record);
}