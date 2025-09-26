package com.zj.demo.controller;

import com.zj.demo.service.MyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : jie.zhou
 * @date : 2025/9/12
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    /**
     * <a href="http://localhost:8033/test/1">test1</a><br>
     * <a href="http://localhost:8044/test/1">test2</a>
     *
     * @param id id
     * @return toString()
     */
    @GetMapping("test/{id}")
    public String test(@PathVariable Integer id) {
        return myService.findUserById(id);
    }
}
