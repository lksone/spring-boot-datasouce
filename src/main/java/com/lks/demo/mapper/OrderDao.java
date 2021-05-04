package com.lks.demo.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lks.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface OrderDao extends BaseMapper<Order> {


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
