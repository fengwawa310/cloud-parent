package cn.com.cintel.eurekaclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement
@ComponentScan(basePackages = "cn.com.cintel.eurekaclient.controller")
@MapperScan("cn.com.cintel.mapper")
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
