package com.example.test.Infrastructure.mapper;

import com.example.test.Domain.Entity.Student;

/**
* @author 34376
* @description 针对表【student】的数据库操作Mapper
* @createDate 2023-09-07 18:50:01
* @Entity com.example.test.Domain.Entity.Student
*/
public interface StudentMapper {

    int deleteByPrimaryKey(String id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}
