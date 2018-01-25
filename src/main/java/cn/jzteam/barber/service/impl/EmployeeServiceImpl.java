
package cn.jzteam.barber.service.impl;

import cn.jzteam.barber.dao.entity.EmployeeEntity;
import cn.jzteam.barber.dao.query.EmployeeBaseQuery;
import cn.jzteam.barber.service.EmployeeService;
import cn.jzteam.swift.service.impl.AbstractBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends AbstractBaseServiceImpl<EmployeeEntity, EmployeeBaseQuery, Integer>
	implements EmployeeService{


}
