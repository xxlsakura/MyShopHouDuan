package com.service;

import com.bean.Cart;

import java.util.List;

public interface CartService {
  int insertToCart(String userid,Integer pid);
  List<Cart> selectCartByUserid(String userid);
  int updatePaynum(String userid,Integer pid,String msg);
  int updateselectedstatus(String userid,Integer pid,String msg);
  int updateAllSelectedStatus(String userid, Boolean msg);
  int deleteCart(String userid);
  int deleteAllCart(String userid);
  List<Cart> selectOrderFromCart(String userid);
  int updateOrderPayNum(String userid,Integer pid,String msg);
}
