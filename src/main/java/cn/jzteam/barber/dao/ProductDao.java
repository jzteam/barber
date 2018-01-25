package cn.jzteam.barber.dao;

import cn.jzteam.swift.dao.BaseDao;
import cn.jzteam.barber.dao.entity.ProductEntity;
import cn.jzteam.barber.dao.query.ProductBaseQuery;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends BaseDao<ProductEntity, ProductBaseQuery, Integer>{

}