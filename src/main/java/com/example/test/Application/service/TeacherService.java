package com.example.test.Application.service;

import com.example.test.Domain.Entity.Teacher;


/**
 * (Teacher)表服务接口
 *
 * @author makejava
 * @since 2023-09-07 17:24:00
 */
public interface TeacherService {

    /**
     * 通过ID查询单条数据
     *
     * @param tno 主键
     * @return 实例对象
     */
    Teacher queryById(String tno);


    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher insert(Teacher teacher);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param tno 主键
     * @return 是否成功
     */
    boolean deleteById(String tno);

}
