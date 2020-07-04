package com.controller;

import com.bean.Cart;
import com.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    public CartService cartService;

    @RequestMapping("/addtocart")
    String addToCart(String userid,Integer pid){
        System.out.println(userid+"666666"+pid);
        if(cartService.insertToCart(userid, pid)!=0){
            return "success";
        }else{
            return "fail";
        }
    }

    @RequestMapping("/querycartbyuserid")
    List<Cart> queryCartByUserid(String userid){
        return cartService.selectCartByUserid(userid);
    }
    public CartService getCartService() {
        return cartService;
    }

    @RequestMapping("/updatepaynumbyuserid")
    List<Cart> updatePaynumByUserid(String userid, Integer pid, String msg){
        if(cartService.updatePaynum(userid, pid, msg)!=0){
            return cartService.selectCartByUserid(userid);
        }else{
            return null;
        }
    }
    @RequestMapping("/updateselectedstatus")
    List<Cart> updateSelectedStatus(String userid, Integer pid, String msg){
        if(cartService.updateselectedstatus(userid, pid, msg)!=0) {
            return cartService.selectCartByUserid(userid);
        }else {return null;}
    }
    @RequestMapping("/updateallselectedstatus")
    List<Cart> updateAllSelectedStatus(String userid, Boolean msg){
        if(cartService.updateAllSelectedStatus(userid, msg)!=0){
            return cartService.selectCartByUserid(userid);
        }else {return null;}
    }
    @RequestMapping("/deletecart")
    List<Cart> deleteCart(String userid){
        if(cartService.deleteCart(userid)!=0){
            return cartService.selectCartByUserid(userid);
        }else{return null;}
    }

    @RequestMapping("/queryfromcartorder")
    List<Cart> queryfromcartorder(String userid){
        return cartService.selectOrderFromCart(userid);
    }

    @RequestMapping("/updateorderpaynum")
    List<Cart> updateOrderPayNum(String userid, Integer pid, String msg){
        if(cartService.updateOrderPayNum(userid, pid, msg)!=0){
            return cartService.selectOrderFromCart(userid);
        }else {return null;}
    }

    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }
}
