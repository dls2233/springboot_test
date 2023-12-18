package org.dalaoshi.service.impl;

import org.dalaoshi.mapper.StudentMapper;
import org.dalaoshi.pojo.Student;
import org.dalaoshi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

//实现
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findList(){
        return studentMapper.queryAll();
    }
    @Override
    public Student queryStudentById(int id) {
        return studentMapper.queryById(id);
    }

}