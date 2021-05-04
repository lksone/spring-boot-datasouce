package com.lks.demo;

import com.lks.demo.entity.Order;
import com.lks.demo.mapper.OrderDao;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class AppTest {

    @Resource
    private OrderDao orderMapper;

    @Test
    public void shouldAnswerWithTrue() {
        for (int i = 100; i < 110; i++) {
            Order order0_0 = new Order();
            order0_0.setOrderId((long) i);
            order0_0.setId(i);
            order0_0.setUserId((long) i);
            order0_0.setUserName("lks" + i);
            orderMapper.addOrder(order0_0);
        }
    }

    @Test
    public void findOrder() {
        Order order = new Order();
        order.setOrderId(1239L);
        order.setUserId(1239L);
        List<Order> orders = orderMapper.getOrders(order);
        log.info("查询数据信息：{}", orders);
    }
}
