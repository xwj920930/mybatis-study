package com.xwj.entity;

import java.util.Date;

public class IdentityCard {
    private Integer id;
    private Integer studentId;
    private String native_;
    private Date startDate;
    private Date endDate;
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getNative_() {
        return native_;
    }

    public void setNative_(String native_) {
        this.native_ = native_;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", native_='" + native_ + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}
