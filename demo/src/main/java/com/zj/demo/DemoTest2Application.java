package com.zj.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * <a href="http://localhost:8044/test/1">test2</a>
 *
 * @author : jie.zhou
 * @date : 2025/9/12
 */
@SpringBootApplication(scanBasePackages = "com.zj.demo")
@MapperScan("com.zj.demo.mapper")
public class DemoTest2Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoTest2Application.class);
        // 设置环境
        app.setAdditionalProfiles("test2");
        app.run(args);
    }


}
