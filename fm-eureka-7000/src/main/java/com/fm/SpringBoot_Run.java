package com.fm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableEurekaServer  //启动Eureka服务.
public class SpringBoot_Run {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBoot_Run.class, args);
	}

}
