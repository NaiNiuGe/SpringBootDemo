package com.example.test.Interface.Controller;


import com.example.test.Application.service.TeacherService;
import com.example.test.Domain.Entity.Teacher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Teacher)表控制层
 *
 * @author makejava
 * @since 2023-09-07 18:19:46
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

//    /**
//     * 分页查询
//     *
//     * @param teacher 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<Teacher>> queryByPage(Teacher teacher, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.teacherService.queryByPage(teacher, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Teacher> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.teacherService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param teacher 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Teacher> add(Teacher teacher) {
        return ResponseEntity.ok(this.teacherService.insert(teacher));
    }

    /**
     * 编辑数据
     *
     * @param teacher 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Teacher> edit(Teacher teacher) {
        return ResponseEntity.ok(this.teacherService.update(teacher));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.teacherService.deleteById(id));
    }

}

