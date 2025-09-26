package com.zj.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * <a href="http://localhost:8033/test/1">test1</a>
 *
 * @author : jie.zhou
 * @date : 2025/9/12
 */
@SpringBootApplication(scanBasePackages = "com.zj.demo")
@MapperScan("com.zj.demo.mapper")
public class DemoTest1Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoTest1Application.class);
        // 设置环境
        app.setAdditionalProfiles("test1");
        app.run(args);
    }


}
