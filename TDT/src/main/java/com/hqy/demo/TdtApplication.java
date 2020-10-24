package com.hqy.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hqy.demo.mapper")
@SpringBootApplication
public class TdtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdtApplication.class, args);
	}

}
