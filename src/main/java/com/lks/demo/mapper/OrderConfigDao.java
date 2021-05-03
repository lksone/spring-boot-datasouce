package com.lks.demo.mapper;


import com.lks.demo.entity.OrderConfig;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderConfigDao {

    List<OrderConfig> getOrderConfig();
}
