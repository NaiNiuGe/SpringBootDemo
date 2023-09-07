package com.example.test.Interface.Controller;


import com.example.test.Application.service.CourseService;
import com.example.test.Domain.Entity.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * (Course)表控制层
 *
 * @author makejava
 * @since 2023-09-07 18:15:15
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    /**
     * 服务对象
     */
    @Resource
    private CourseService courseService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Course> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.courseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param course 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Course> add(@RequestBody Course course) {
        return ResponseEntity.ok(this.courseService.insert(course));
    }

    /**
     * 编辑数据
     *
     * @param course 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Course> edit(Course course) {
        return ResponseEntity.ok(this.courseService.update(course));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.courseService.deleteById(id));
    }

}

