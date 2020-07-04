package com.service;

import com.bean.Product;
import com.bean.ProductExample;
import com.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    public ProductMapper productMapper;

    @Override
    public List<Product> selectAll() {
        return productMapper.selectByExample(new ProductExample());
    }

    @Override
    public List<Product> selectByTypeName(String type) {
        ProductExample productExample=new ProductExample();
        ProductExample.Criteria criteria=productExample.createCriteria();
        criteria.andTypenameEqualTo(type);
        return productMapper.selectByExample(productExample);

    }

    @Override
    public List<Product> selectByProductName(String name) {
        ProductExample productExample=new ProductExample();
        ProductExample.Criteria criteria=productExample.createCriteria();
        criteria.andNameLike("%"+name+"%");
        return productMapper.selectByExample(productExample);
    }

    @Override
    public List<Product> selectByProductTag(String tag) {
        ProductExample productExample=new ProductExample();
        ProductExample.Criteria criteria=productExample.createCriteria();
        criteria.andTagEqualTo(tag);
        return productMapper.selectByExample(productExample);
    }


    @Override
    public List<Product> selectByProductIdToOrder(Integer id) {
        ProductExample productExample=new ProductExample();
        ProductExample.Criteria criteria=productExample.createCriteria();
        criteria.andIdEqualTo(id);
        Product product=new Product();
        product.setPaynum(1);
        if(productMapper.updateByExampleSelective(product,productExample)!=0){
            return productMapper.selectByExample(productExample);
        }else{
            return null;
        }
    }


    @Override
    public List<Product> updateOrderNum(Integer id, String msg) {
        ProductExample productExample=new ProductExample();
        ProductExample.Criteria criteria=productExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<Product> list=productMapper.selectByExample(productExample);
        Product product=new Product();
        if("add".equals(msg)&&list.get(0).getPaynum()<list.get(0).getInventory()){
            product.setPaynum(list.get(0).getPaynum()+1);
        }else if("subtract".equals(msg)&&list.get(0).getPaynum()>1){
            product.setPaynum(list.get(0).getPaynum()-1);
        }else{
            product.setPaynum(list.get(0).getPaynum());
        }
        if(productMapper.updateByExampleSelective(product,productExample)!=0){
            return productMapper.selectByExample(productExample);
        }else{
            return null;
        }
    }

    public ProductMapper getProductMapper() {
        return productMapper;
    }

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
}
