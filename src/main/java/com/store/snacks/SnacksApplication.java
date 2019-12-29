package com.store.snacks;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.store.snacks.mapper")
@SpringBootApplication
@ComponentScan("com.store")
@EnableSwagger2Doc
public class SnacksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnacksApplication.class, args);
    }

}
