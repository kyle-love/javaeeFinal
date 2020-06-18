package com.example.mybatis.entity;

import java.util.Date;

public class s_homework {
    private Long homeworkid;

    private String homeworktitle;

    private Date createTime;

    private Date updateTime;

    public Long getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(Long homeworkid) {
        this.homeworkid = homeworkid;
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
}