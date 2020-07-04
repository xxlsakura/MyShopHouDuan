package com.service;

import com.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> selectAll();
    List<Product> selectByTypeName(String type);
    List<Product> selectByProductName(String name);
    List<Product> selectByProductTag(String tag);
    List<Product> selectByProductIdToOrder(Integer id);
    List<Product> updateOrderNum(Integer id,String msg);
 }
