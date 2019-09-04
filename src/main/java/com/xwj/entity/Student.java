package com.xwj.entity;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private Integer sex;
    private Integer identityId;
    private String comment;
    private IdentityCard identityCard;
    private List<CourseScore> courseScores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    public List<CourseScore> getCourseScores() {
        return courseScores;
    }

    public void setCourseScores(List<CourseScore> courseScores) {
        this.courseScores = courseScores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", identityId=" + identityId +
                ", comment='" + comment + '\'' +
                ", identityCard=" + identityCard +
                ", courseScores=" + courseScores +
                '}';
    }
}
