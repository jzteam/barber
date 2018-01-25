package cn.jzteam.barber.dao;

import cn.jzteam.swift.dao.BaseDao;
import cn.jzteam.barber.dao.entity.EmployeeEntity;
import cn.jzteam.barber.dao.query.EmployeeBaseQuery;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends BaseDao<EmployeeEntity, EmployeeBaseQuery, Integer>{

}