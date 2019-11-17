package com.njusoft.ssm.service;

import com.njusoft.ssm.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    List<Product> findAll() throws Exception;
}