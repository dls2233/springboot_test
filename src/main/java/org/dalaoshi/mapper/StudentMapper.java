package org.dalaoshi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dalaoshi.pojo.Student;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> queryAll();

    Student queryById(int id);
}