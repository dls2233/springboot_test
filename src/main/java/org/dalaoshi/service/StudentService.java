package org.dalaoshi.service;

import org.dalaoshi.pojo.Student;

import java.util.List;

//接口
public interface StudentService {
    List<Student> findList();
    Student queryStudentById(int id);
}