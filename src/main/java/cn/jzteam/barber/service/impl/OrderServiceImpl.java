
package cn.jzteam.barber.service.impl;

import cn.jzteam.barber.dao.entity.OrderEntity;
import cn.jzteam.barber.dao.query.OrderBaseQuery;
import cn.jzteam.barber.service.OrderService;
import cn.jzteam.swift.service.impl.AbstractBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends AbstractBaseServiceImpl<OrderEntity, OrderBaseQuery, Integer>
	implements OrderService{


}
