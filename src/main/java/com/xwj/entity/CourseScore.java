package com.xwj.entity;

import java.math.BigDecimal;

public class CourseScore {
    private Integer id;
    private Integer studentId;
    private Integer courseId;
    private BigDecimal score;
    private String comment;
    private Course course;

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

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "CourseScore{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                ", course=" + course +
                '}';
    }

}
