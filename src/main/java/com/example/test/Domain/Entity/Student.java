package com.example.test.Domain.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName student
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    /**
     * 
     */
    private String stuno;

    /**
     * 
     */
    private String stuname;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    private Integer age;

    private static final long serialVersionUID = 1L;
}