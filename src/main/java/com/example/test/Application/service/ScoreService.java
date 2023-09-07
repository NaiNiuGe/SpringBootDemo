package com.example.test.Application.service;

import com.example.test.Domain.Entity.Score;

/**
 * (Score)表服务接口
 *
 * @author makejava
 * @since 2023-09-07 17:23:46
 */
public interface ScoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param sno 主键
     * @return 实例对象
     */
    Score queryById(String sno);



    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Score insert(Score score);

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    Score update(Score score);

    /**
     * 通过主键删除数据
     *
     * @param sno 主键
     * @return 是否成功
     */
    boolean deleteById(String sno);

}
