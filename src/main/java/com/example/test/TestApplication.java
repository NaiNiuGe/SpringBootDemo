package com.example.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.test.Infrastructure.mapper"})
public class TestApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(TestApplication.class, args);
//		while(true){
//			System.out.println(System.currentTimeMillis());
//			Thread.sleep(1_000);
//		}
	}



}
