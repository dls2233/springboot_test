package org.dalaoshi.controller;

import org.dalaoshi.pojo.Student;
import org.dalaoshi.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/user")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping( "/list")
    @ResponseBody
    public List<Student> getUser(){
        List<Student> students = studentService.findList();
        return students;
    }
    @GetMapping("/query")
    public Student getStudentById(@RequestParam("userId") int id){
        return studentService.queryStudentById(id);
    }
}