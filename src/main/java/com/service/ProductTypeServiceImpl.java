package com.service;

import com.bean.Producttype;
import com.bean.ProducttypeExample;
import com.dao.ProducttypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceImpl implements ProductTypeService{
    @Autowired
    public ProducttypeMapper producttypeMapper;
    @Override
    public List<Producttype> selectAll() {
        return producttypeMapper.selectByExample(new ProducttypeExample());
    }

    public ProducttypeMapper getProducttypeMapper() {
        return producttypeMapper;
    }

    public void setProducttypeMapper(ProducttypeMapper producttypeMapper) {
        this.producttypeMapper = producttypeMapper;
    }
}
