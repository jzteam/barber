package cn.jzteam.barber.dao;

import cn.jzteam.swift.dao.BaseDao;
import cn.jzteam.barber.dao.entity.FinanceEntity;
import cn.jzteam.barber.dao.query.FinanceBaseQuery;

import org.springframework.stereotype.Repository;

@Repository
public interface FinanceDao extends BaseDao<FinanceEntity, FinanceBaseQuery, Integer>{

}