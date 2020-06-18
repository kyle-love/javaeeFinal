package com.example.mybatis.entity;

import java.util.Date;

public class s_student_homework {
    private Long shid;

    private Long studentid;

    private String homeworktitle;

    private Date createTime;

    private Date updateTime;

    private String homeworkcontent;

    public Long getShid() {
        return shid;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getHomeworktitle() {
        return homeworktitle;
    }

    public void setHomeworktitle(String homeworktitle) {
        this.homeworktitle = homeworktitle == null ? null : homeworktitle.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHomeworkcontent() {
        return homeworkcontent;
    }

    public void setHomeworkcontent(String homeworkcontent) {
        this.homeworkcontent = homeworkcontent == null ? null : homeworkcontent.trim();
    }
}