package com.example.test.Domain.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName score
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score implements Serializable {
    /**
     * 
     */
    private String sno;

    /**
     * 
     */
    private String cno;

    /**
     * 
     */
    private Integer score;

    private static final long serialVersionUID = 1L;
}