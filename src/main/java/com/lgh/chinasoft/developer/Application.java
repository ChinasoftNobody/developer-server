package com.lgh.chinasoft.developer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 * @date 2017/12/17
 */
@SpringBootApplication()
@MapperScan(basePackages = "com.lgh.chinasoft.developer.dao",annotationClass = Repository.class)
public class Application  {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
