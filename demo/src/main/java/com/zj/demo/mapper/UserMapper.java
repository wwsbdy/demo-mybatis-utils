package com.zj.demo.mapper;

import com.zj.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : jie.zhou
 * @date : 2025/9/12
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> findAllUsers();

    /**
     * <a href="http://localhost:8033/test/1">test1</a><br>
     * <a href="http://localhost:8044/test/1">test2</a>
     *
     * @param id id
     * @return User
     */
    User findUserById(Integer id);

    /**
     * <a href="http://localhost:8033/test/1">test1</a><br>
     * <a href="http://localhost:8044/test/1">test2</a>
     *
     * @param list ids
     * @return User
     */
    List<User> findUserByIds(@Param("list") List<Integer> list);
}
