package com.lks.demo.mapper;


import com.lks.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@Repository
public interface OrderDao extends JpaRepository<Order, Integer>{


    /**
     * 查询某个用户订单列表
     *
     * @param order
     * @return
     */
    List<Order> getOrders(Order order);

    /**
     * 插入订单信息
     *
     * @param orderInfo
     * @return
     */
    int addOrder(Order orderInfo);
}
