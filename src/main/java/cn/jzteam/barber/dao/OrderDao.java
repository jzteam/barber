package cn.jzteam.barber.dao;

import cn.jzteam.swift.dao.BaseDao;
import cn.jzteam.barber.dao.entity.OrderEntity;
import cn.jzteam.barber.dao.query.OrderBaseQuery;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends BaseDao<OrderEntity, OrderBaseQuery, Integer>{

}