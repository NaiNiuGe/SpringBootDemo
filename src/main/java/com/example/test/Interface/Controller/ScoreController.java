package com.example.test.Interface.Controller;



import com.example.test.Application.service.ScoreService;
import com.example.test.Domain.Entity.Score;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * (Score)表控制层
 *
 * @author makejava
 * @since 2023-09-07 18:17:13
 */
@RestController
@RequestMapping("score")
public class ScoreController {
    /**
     * 服务对象
     */
    @Resource
    private ScoreService scoreService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Score> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.scoreService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param score 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Score> add(Score score) {
        return ResponseEntity.ok(this.scoreService.insert(score));
    }

    /**
     * 编辑数据
     *
     * @param score 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Score> edit(Score score) {
        return ResponseEntity.ok(this.scoreService.update(score));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.scoreService.deleteById(id));
    }

}

