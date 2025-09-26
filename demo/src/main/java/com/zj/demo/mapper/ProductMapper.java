package com.zj.demo.mapper;

import com.zj.demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author : jie.zhou
 * @date : 2025/9/12
 */
@Mapper
public interface ProductMapper {
    /**
     * 通过ID查询单个product
     *
     * @param id ID
     * @return {@link Product}
     */
    Product findById(Integer id);


    /**
     * 修改product
     *
     * @param product Product
     */
    void update(Product product);

    /**
     * 通过ID删除单个product
     *
     * @param id ID
     */
    void deleteById(Integer id);
}
