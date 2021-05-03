package com.lks.demo.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Order {

    private Integer id;

    private Long userId;

    private Long orderId;

    private String userName;
}
