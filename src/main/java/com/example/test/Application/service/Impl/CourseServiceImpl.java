package com.example.test.Application.service.Impl;



import com.example.test.Application.service.CourseService;
import com.example.test.Domain.Entity.Course;
import com.example.test.Infrastructure.mapper.CourseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2023-09-07 17:17:34
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param cno 主键
     * @return 实例对象
     */
    @Override
    public Course queryById(String cno) {
        return this.courseMapper.selectByPrimaryKey(cno);
    }




    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course insert(Course course) {
        this.courseMapper.insert(course);
        return course;
    }

    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 实例对象
     */
    @Override
    public Course update(Course course) {
        this.courseMapper.updateByPrimaryKey(course);
        return this.queryById(course.getCno());
    }

    /**
     * 通过主键删除数据
     *
     * @param cno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String cno) {
        return this.courseMapper.deleteByPrimaryKey(cno) > 0;
    }
}
