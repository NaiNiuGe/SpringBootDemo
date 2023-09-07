package com.example.test.Application.DTO;

import com.example.test.Domain.Entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User拓展类，封装一些年龄状态信息
 */
@Data
@NoArgsConstructor
public class UserDTO extends User {
    private String Mark;

    public boolean idAdult(){
        return this.getAge()!=null && this.getAge()>=18;
    }

    public UserDTO(User user){
        this.setName(user.getName());
        this.setAge(user.getAge());
        this.setSex(user.getSex());
    }

    public void setAge(Integer age){
//        Objects.requireNonNull(age);
        super.setAge(age);
        if(this.getAge()>=18) this.setMark("已成年");
        else this.setMark("未成年");
    }



}
