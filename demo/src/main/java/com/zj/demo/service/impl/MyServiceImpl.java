package com.zj.demo.service.impl;

import com.zj.demo.entity.User;
import com.zj.demo.mapper.UserMapper;
import com.zj.demo.service.MyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author : jie.zhou
 * @date : 2025/9/12
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class MyServiceImpl implements MyService {

    private final UserMapper userMapper;


    @Override
    public String findUserById(Integer id) {
        User user = userMapper.findUserById(id);
        return Objects.isNull(user) ? "no found" : user.toString();
    }
}
