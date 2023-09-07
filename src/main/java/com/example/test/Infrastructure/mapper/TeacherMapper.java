package com.example.test.Infrastructure.mapper;

import com.example.test.Domain.Entity.Teacher;

/**
* @author 34376
* @description 针对表【teacher】的数据库操作Mapper
* @createDate 2023-09-07 18:50:01
* @Entity com.example.test.Domain.Entity.Teacher
*/
public interface TeacherMapper {

    int deleteByPrimaryKey(String id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

}
