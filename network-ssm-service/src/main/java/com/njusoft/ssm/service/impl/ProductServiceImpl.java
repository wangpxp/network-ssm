package com.njusoft.ssm.service.impl;

import com.njusoft.ssm.dao.ProductDao;
import com.njusoft.ssm.model.Product;
import com.njusoft.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
