package com.huaiyi.auth;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.huaiyi")
@MapperScan("com.huaiyi.*.mapper")

public class ServiceAuthApplication {
    private static  final Logger logger = LoggerFactory.getLogger(ServiceAuthApplication.class);
    public static void main(String[] args) {
        try{
            SpringApplication.run(ServiceAuthApplication.class, args);
        }catch (Exception e){
            logger.error("Application startup failed",e);
            System.exit(1);
        }
    }

}
