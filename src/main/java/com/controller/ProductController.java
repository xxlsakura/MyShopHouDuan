package com.controller;

import com.bean.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ProductController {
    @Autowired
    public ProductService productService;

    @RequestMapping("/queryproduct")
    public List<Product> queryproduct(){
        return productService.selectAll();
    }

    @RequestMapping("/querybyproducttype")
    public List<Product> queryByProductType(String type){
        return productService.selectByTypeName(type);
    }

    @RequestMapping("/querybyproductname")
    public List<Product> queryByProductName(String name){
        return productService.selectByProductName(name);
    }

    @RequestMapping("/querybyproducttag")
    public List<Product> queryByProductTag(String tag){
        return productService.selectByProductTag(tag);
    }

    @RequestMapping("/querybyproductidtoorder")
    public List<Product> queryByProductIdToOrder(Integer id){
        return productService.selectByProductIdToOrder(id);
    }

    @RequestMapping("/updateordernum")
    public List<Product> updateordernum(Integer id, String msg){
        return productService.updateOrderNum(id, msg);
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
