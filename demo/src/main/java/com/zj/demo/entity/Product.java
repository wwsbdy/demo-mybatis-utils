package com.zj.demo.entity;

import lombok.Data;

import java.math.BigDecimal;


/**
 * @author : jie.zhou
 * @date : 2025/9/12
 */
@Data
public class Product {
    /**
    * product_id
    */
    private Integer productId;
    /**
    * product_name
    */
    private String productName;
    /**
    * price
    */
    private BigDecimal price;
}