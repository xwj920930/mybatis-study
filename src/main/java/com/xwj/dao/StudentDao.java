package com.xwj.dao;


import com.xwj.entity.Student;

import java.util.List;

public interface StudentDao {
    Student getStudentById(int id);

    List<Student> getStudent(int id);
}
