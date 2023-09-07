package com.example.test.Domain.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private String name;
    private String sex;
    private Integer age;


    public void setAge(Integer age){
        if(age==null || age<0) age=0;
        this.age=age;
    }

    @Override
    public String toString() {
        return (name==null?"佚名":name)+","
                +sex+"性,"
                +(age==null?"未知":age)+"周岁";
    }
}
