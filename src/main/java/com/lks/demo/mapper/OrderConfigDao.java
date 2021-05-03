package com.lks.demo.mapper;


import com.lks.demo.entity.OrderConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderConfigDao extends JpaRepository<OrderConfig, Integer> {

    List<OrderConfig> getOrderConfig();
}
