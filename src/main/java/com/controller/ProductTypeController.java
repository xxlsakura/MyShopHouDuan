package com.controller;

import com.bean.Producttype;
import com.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductTypeController {
    @Autowired
    public ProductTypeService productTypeService;

    @RequestMapping("/queryproducttype")
    public List<Producttype> queryAll(){
        return productTypeService.selectAll();
    }

    public ProductTypeService getProductTypeService() {
        return productTypeService;
    }

    public void setProductTypeService(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }
}
