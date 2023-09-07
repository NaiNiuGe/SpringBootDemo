package com.example.test.Application.service.Impl;


import com.example.test.Application.service.ScoreService;

import com.example.test.Domain.Entity.Score;
import com.example.test.Infrastructure.mapper.ScoreMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Score)表服务实现类
 *
 * @author makejava
 * @since 2023-09-07 17:23:46
 */
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreMapper scoreMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param sno 主键
     * @return 实例对象
     */
    @Override
    public Score queryById(String sno) {
        return this.scoreMapper.selectByPrimaryKey(sno);
    }


    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score insert(Score score) {
        this.scoreMapper.insert(score);
        return score;
    }

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score update(Score score) {
        this.scoreMapper.updateByPrimaryKey(score);
        return this.queryById(score.getSno());
    }

    /**
     * 通过主键删除数据
     *
     * @param sno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String sno) {
        return this.scoreMapper.deleteByPrimaryKey(sno) > 0;
    }
}
