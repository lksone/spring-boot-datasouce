package com.lks.demo.mapper;


import com.lks.demo.DataBaseTableApplication;
import com.lks.demo.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {DataBaseTableApplication.class})
@RunWith(SpringRunner.class)
public class OrderTest {


    @Autowired
    private OrderDao orderMapper;

    @Test
    public void testAddOrder() {

        Order order0_0 = new Order();
        order0_0.setOrderId(1000L);
        order0_0.setId(1000);
        order0_0.setUserId(1000L);
        order0_0.setUserName("lks" + 10000);
        orderMapper.addOrder(order0_0);
        /*for (int i = 0; i < 100; i++) {
            Order order0_0 = new Order();
            order0_0.setOrderId((long) i);
            order0_0.setId(i);
            order0_0.setUserId((long) i);
            order0_0.setUserName("lks" + i);
            orderMapper.addOrder(order0_0);
        }*/
    }
}