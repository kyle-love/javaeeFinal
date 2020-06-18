package com.example.mybatis.entity;

public class s_teacher {
    private Long teacherid;

    private String teachername;

    private Long teacheruserid;

    private String teacherpassword;

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public Long getTeacheruserid() {
        return teacheruserid;
    }

    public void setTeacheruserid(Long teacheruserid) {
        this.teacheruserid = teacheruserid;
    }

    public String getTeacherpassword() {
        return teacherpassword;
    }

    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword == null ? null : teacherpassword.trim();
    }
}