package com.fm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.fm.manage.mapper")
@EnableEurekaClient	
public class FM_Manager {
	public static void main(String[] args) {
		SpringApplication.run(FM_Manager.class, args);
	}

}
