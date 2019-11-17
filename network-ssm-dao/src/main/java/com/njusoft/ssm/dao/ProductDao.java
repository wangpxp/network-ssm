package com.njusoft.ssm.dao;

import org.springframework.stereotype.Repository;
import com.njusoft.ssm.model.Product;
import java.util.List;

@Repository
public interface ProductDao {

    List<Product> findAll();
}
