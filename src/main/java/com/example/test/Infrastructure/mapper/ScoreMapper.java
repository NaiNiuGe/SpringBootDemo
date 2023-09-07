package com.example.test.Infrastructure.mapper;


import com.example.test.Domain.Entity.Score;

/**
* @author 34376
* @description 针对表【score】的数据库操作Mapper
* @createDate 2023-09-07 18:50:01
* @Entity com.example.test.Domain.Entity.Score
*/
public interface ScoreMapper {

    int deleteByPrimaryKey(String id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

}
