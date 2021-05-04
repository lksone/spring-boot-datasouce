package com.lks.demo.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    private Integer id;

    private Long userId;

    private Long orderId;

    private String userName;
}
