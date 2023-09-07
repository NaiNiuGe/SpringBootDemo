package com.example.test.Domain.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName course
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable {
    /**
     * 
     */
    private String cno;

    /**
     * 
     */
    private String cname;

    /**
     * 
     */
    private String tno;

    private static final long serialVersionUID = 1L;
}