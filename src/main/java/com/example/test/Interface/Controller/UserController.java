package com.example.test.Interface.Controller;

import com.example.test.Application.DTO.UserDTO;
import com.example.test.Domain.Entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("test")
public class UserController {

    @GetMapping("/{id}")
    public Long testGet(@PathVariable String id){
        try{
            Objects.requireNonNull(id);
            return Long.parseLong(id)*100;
        }catch (Exception e){
            return 0l;
        }
    }

    @PostMapping()
    public String testPost(@RequestBody User user){
        return user.toString();
    }

    @PutMapping()
    public User testPut(@RequestBody User user){
        UserDTO userDTO=new UserDTO(user);
        return userDTO;
    }

    @DeleteMapping
    public String testDelete(@RequestBody User user){
        if(user!=null) return (user.getName()==null?"":user.getName())+"信息已删除";
        return "DELETE FAILED";
    }
}
