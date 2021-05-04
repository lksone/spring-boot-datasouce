package com.lks.demo.mapper;


import com.lks.demo.entity.OrderConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
@Repository
public interface OrderConfigDao extends BaseMapper<OrderConfig> {

    List<OrderConfig> getOrderConfig();
}
