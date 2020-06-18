package com.example.mybatis.entity;

import java.util.Date;

public class s_student {
    private Long studentid;

    private String studentname;

    private Date createTime;

    private Date updateTime;

    private Long studentuserid;

    private String studentpassword;

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
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

    public Long getStudentuserid() {
        return studentuserid;
    }

    public void setStudentuserid(Long studentuserid) {
        this.studentuserid = studentuserid;
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword == null ? null : studentpassword.trim();
    }
}