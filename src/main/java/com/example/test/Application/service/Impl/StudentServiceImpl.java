package com.example.test.Application.service.Impl;


import com.example.test.Application.service.StudentService;
import com.example.test.Domain.Entity.Student;
import com.example.test.Infrastructure.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2023-09-07 18:11:09
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param stuno 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(String stuno) {
        return this.studentMapper.selectByPrimaryKey(stuno);
    }




    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentMapper.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentMapper.updateByPrimaryKey(student);
        return this.queryById(student.getStuno());
    }

    /**
     * 通过主键删除数据
     *
     * @param stuno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String stuno) {
        return this.studentMapper.deleteByPrimaryKey(stuno) > 0;
    }
}
