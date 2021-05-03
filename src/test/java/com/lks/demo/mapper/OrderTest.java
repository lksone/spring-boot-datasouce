package com.lks.demo.mapper;


import com.lks.demo.DataBaseTableApplication;
import com.lks.demo.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = DataBaseTableApplication.class)
@RunWith(SpringRunner.class)
public class OrderTest {


    @Resource
    private OrderDao orderMapper;

    @Test
    public void testAddOrder() {
        Order order0_0 = new Order();
        order0_0.setOrderId(12312L);
        order0_0.setId(123);
        orderMapper.addOrder(order0_0);
    }
}