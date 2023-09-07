package com.example.test.Infrastructure.mapper;


import com.example.test.Domain.Entity.Course;

/**
* @author 34376
* @description 针对表【course】的数据库操作Mapper
* @createDate 2023-09-07 18:50:01
* @Entity com.example.test.Domain.Entity.Course
*/
public interface CourseMapper {

    int deleteByPrimaryKey(String id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

}
