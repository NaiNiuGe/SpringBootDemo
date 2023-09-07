package com.example.test.Interface.Controller;


import com.example.test.Application.service.StudentService;
import com.example.test.Domain.Entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2023-09-07 19:08:11
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

//    /**
//     * 分页查询
//     *
//     * @param student 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<Student>> queryByPage(Student student, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.studentService.queryByPage(student, pageRequest));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Student> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.studentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param student 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Student> add(Student student) {
        return ResponseEntity.ok(this.studentService.insert(student));
    }

    /**
     * 编辑数据
     *
     * @param student 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Student> edit(Student student) {
        return ResponseEntity.ok(this.studentService.update(student));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.studentService.deleteById(id));
    }

}

