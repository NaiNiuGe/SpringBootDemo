package com.example.test.Application.service;

import com.example.test.Domain.Entity.Course;


/**
 * (Course)表服务接口
 *
 * @author makejava
 * @since 2023-09-07 17:17:27
 */
public interface CourseService {

    /**
     * 通过ID查询单条数据
     *
     * @param cno 主键
     * @return 实例对象
     */
    Course queryById(String cno);

    /**
     * 分页查询
     *
     * @param course 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course insert(Course course);

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    Course update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param cno 主键
     * @return 是否成功
     */
    boolean deleteById(String cno);

}
