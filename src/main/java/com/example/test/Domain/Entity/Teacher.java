package com.example.test.Domain.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName teacher
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Serializable {
    /**
     * 
     */
    private String tno;

    /**
     * 
     */
    private String tname;

    private static final long serialVersionUID = 1L;
}