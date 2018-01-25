
package cn.jzteam.barber.service.impl;

import cn.jzteam.barber.dao.entity.ProductEntity;
import cn.jzteam.barber.dao.query.ProductBaseQuery;
import cn.jzteam.barber.service.ProductService;
import cn.jzteam.swift.service.impl.AbstractBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends AbstractBaseServiceImpl<ProductEntity, ProductBaseQuery, Integer>
	implements ProductService{


}
