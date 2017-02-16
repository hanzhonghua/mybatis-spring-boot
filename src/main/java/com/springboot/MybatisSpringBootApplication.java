package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.util.MyMapper;

@SpringBootApplication
//扫描mapper接口，父级MyMapper不能和普通mapper在同一个包下
@MapperScan(basePackages = "com.springboot.mapper", markerInterface = MyMapper.class)
public class MybatisSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringBootApplication.class, args);
	}
}
