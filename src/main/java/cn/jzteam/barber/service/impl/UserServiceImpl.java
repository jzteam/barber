
package cn.jzteam.barber.service.impl;

import cn.jzteam.barber.dao.entity.UserEntity;
import cn.jzteam.barber.dao.query.UserBaseQuery;
import cn.jzteam.barber.service.UserService;
import cn.jzteam.swift.service.impl.AbstractBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractBaseServiceImpl<UserEntity, UserBaseQuery, Integer>
	implements UserService{


}
