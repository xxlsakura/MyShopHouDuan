package com.service;

import com.bean.Cart;
import com.bean.CartExample;
import com.bean.Product;
import com.bean.ProductExample;
import com.dao.CartMapper;
import com.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{


    @Autowired
    public CartMapper cartMapper;
    @Autowired
    public ProductMapper productMapper;
    @Override
    public int insertToCart(String userid, Integer pid) {
        ProductExample productExample=new ProductExample();
        ProductExample.Criteria criteria=productExample.createCriteria();
        criteria.andIdEqualTo(pid);
        List<Product> list=productMapper.selectByExample(productExample);
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria1=cartExample.createCriteria();
        criteria1.andUseridEqualTo(userid);
        criteria1.andPidEqualTo(pid);
        List<Cart> carts=cartMapper.selectByExample(cartExample);
        Cart cart=new Cart();
        Date date=new Date();
        if(carts.size()<1){
            cart.setPid(list.get(0).getId());
            cart.setSrc(list.get(0).getSrc());
            cart.setName(list.get(0).getName());
            cart.setPrice(list.get(0).getPrice());
            cart.setInventory(list.get(0).getInventory());
            cart.setAddcarttime(date);
            cart.setUserid(userid);
            cart.setSelectedstatus(0);
            cart.setPaynum(1);
            return cartMapper.insertSelective(cart);
        }else{

            cart.setInventory(list.get(0).getInventory());
            cart.setAddcarttime(date);
            if(carts.get(0).getPaynum()<carts.get(0).getInventory()){
                cart.setPaynum(carts.get(0).getPaynum()+1);
            }else{
                cart.setPaynum(carts.get(0).getPaynum());
            }
            return cartMapper.updateByExampleSelective(cart,cartExample);
        }
    }

    @Override
    public List<Cart> selectCartByUserid(String userid) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        cartExample.setOrderByClause("addcarttime asc");
        return cartMapper.selectByExample(cartExample);
    }

    @Override
    public int updatePaynum(String userid, Integer pid, String msg) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        criteria.andPidEqualTo(pid);
        List<Cart> list=cartMapper.selectByExample(cartExample);
        Cart cart=new Cart();
        if("add".equals(msg)){
            if(list.get(0).getPaynum()<list.get(0).getInventory()){
                cart.setPaynum(list.get(0).getPaynum()+1);
            }else{
                cart.setPaynum(list.get(0).getPaynum());
            }
        }else{
            if(list.get(0).getPaynum()>1){
                cart.setPaynum(list.get(0).getPaynum()-1);
            }else{
                cart.setPaynum(list.get(0).getPaynum());
            }
        }
        return cartMapper.updateByExampleSelective(cart,cartExample);
    }

    @Override
    public int updateselectedstatus(String userid, Integer pid, String msg) {
        CartExample cartExample =new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        criteria.andPidEqualTo(pid);
        Cart cart=new Cart();
        if("yes".equals(msg)){
            cart.setSelectedstatus(1);
        }else{
            cart.setSelectedstatus(0);
        }
        return cartMapper.updateByExampleSelective(cart,cartExample);
    }

    @Override
    public int updateAllSelectedStatus(String userid, Boolean msg) {
        CartExample cartExample =new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        Cart cart=new Cart();
        if(msg){
            cart.setSelectedstatus(1);
        }else{
            cart.setSelectedstatus(0);
        }
        return cartMapper.updateByExampleSelective(cart,cartExample);
    }

    @Override
    public int deleteCart(String userid) {
        CartExample cartExample =new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        criteria.andSelectedstatusEqualTo(1);
        return cartMapper.deleteByExample(cartExample);
    }

    @Override
    public List<Cart> selectOrderFromCart(String userid) {
        CartExample cartExample =new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        criteria.andSelectedstatusEqualTo(1);
        return cartMapper.selectByExample(cartExample);
    }

    @Override
    public int updateOrderPayNum(String userid, Integer pid, String msg) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andSelectedstatusEqualTo(1);
        criteria.andPidEqualTo(pid);
        criteria.andUseridEqualTo(userid);
        List<Cart> list=cartMapper.selectByExample(cartExample);
        Cart cart=new Cart();
        if("add".equals(msg)&&list.get(0).getPaynum()<list.get(0).getInventory()){
            cart.setPaynum(list.get(0).getPaynum()+1);
        }
        else if("subtract".equals(msg)&&list.get(0).getPaynum()>1){
            cart.setPaynum(list.get(0).getPaynum()-1);
        }else{
            cart.setPaynum(list.get(0).getPaynum());
        }
        return cartMapper.updateByExampleSelective(cart,cartExample);
    }

    public CartMapper getCartMapper() {
        return cartMapper;
    }

    public void setCartMapper(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    @Override
    public int deleteAllCart(String userid) {
        CartExample cartExample=new CartExample();
        CartExample.Criteria criteria=cartExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        return cartMapper.deleteByExample(cartExample);
    }

    public ProductMapper getProductMapper() {
        return productMapper;
    }

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
}
