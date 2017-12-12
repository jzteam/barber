package cn.jzteam.barber.dao;

import cn.jzteam.swift.dao.BaseDao;
import cn.jzteam.barber.dao.entity.TaskEntity;
import cn.jzteam.barber.dao.query.TaskBaseQuery;

import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends BaseDao<TaskEntity, TaskBaseQuery, Integer>{

}