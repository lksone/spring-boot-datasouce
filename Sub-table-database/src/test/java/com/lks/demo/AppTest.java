package com.lks.demo;

import com.lks.demo.entity.Order;
import com.lks.demo.mapper.OrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Unit test for simple App.
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class AppTest {

    @Resource
    private OrderDao orderMapper;

    @Test
    public void shouldAnswerWithTrue() {
        for (int i = 0; i < 100; i++) {
            Order order0_0 = new Order();
            order0_0.setOrderId((long) i);
            order0_0.setId(i);
            order0_0.setUserId((long) i);
            order0_0.setUserName("lks" + i);
            orderMapper.addOrder(order0_0);
        }
    }
}
