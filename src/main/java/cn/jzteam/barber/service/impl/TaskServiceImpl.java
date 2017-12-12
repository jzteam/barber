
package cn.jzteam.barber.service.impl;

import cn.jzteam.barber.dao.entity.TaskEntity;
import cn.jzteam.barber.dao.query.TaskBaseQuery;
import cn.jzteam.barber.service.TaskService;
import cn.jzteam.swift.service.impl.AbstractBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl extends AbstractBaseServiceImpl<TaskEntity, TaskBaseQuery, Integer>
	implements TaskService{


}
