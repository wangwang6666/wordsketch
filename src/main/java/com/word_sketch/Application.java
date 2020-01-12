package com.word_sketch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动程序
 * @author aotian
 *
 */
@SpringBootApplication
//mapper 接口类包扫描
@MapperScan(basePackages = "com.word_sketch.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

