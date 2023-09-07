package com.example.test.Application.service.Impl;

import com.example.test.Application.service.TeacherService;
import com.example.test.Domain.Entity.Teacher;
import com.example.test.Infrastructure.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2023-09-07 17:24:00
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param tno 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(String tno) {
        return this.teacherMapper.selectByPrimaryKey(tno);
    }


    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        this.teacherMapper.insert(teacher);
        return teacher;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherMapper.updateByPrimaryKey(teacher);
        return this.queryById(teacher.getTno());
    }

    /**
     * 通过主键删除数据
     *
     * @param tno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tno) {
        return this.teacherMapper.deleteByPrimaryKey(tno) > 0;
    }
}
