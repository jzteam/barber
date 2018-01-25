package cn.jzteam.barber.dao;

import cn.jzteam.swift.dao.BaseDao;
import cn.jzteam.barber.dao.entity.UserEntity;
import cn.jzteam.barber.dao.query.UserBaseQuery;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseDao<UserEntity, UserBaseQuery, Integer>{

}