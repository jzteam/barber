
package cn.jzteam.barber.service.impl;

import cn.jzteam.barber.dao.entity.FinanceEntity;
import cn.jzteam.barber.dao.query.FinanceBaseQuery;
import cn.jzteam.barber.service.FinanceService;
import cn.jzteam.swift.service.impl.AbstractBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceServiceImpl extends AbstractBaseServiceImpl<FinanceEntity, FinanceBaseQuery, Integer>
	implements FinanceService{


}
