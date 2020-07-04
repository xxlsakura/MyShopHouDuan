package com.controller;

import com.bean.User;
import com.service.CartService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService userService;
    @Autowired
    public CartService cartService;

    @RequestMapping(value="/queryuser")
    public List<User> queryUser(String username, String password){
        return userService.selectUser(username,password);
    }
    @RequestMapping(value="/adduser")
    public String addUser(String username, String password,String phone){
        if(userService.updateUser(username,password,phone)!=0){
            return "success";
        }else{return "fail";}
    }

    @RequestMapping(value="/logout")
    public  String logout(String userid){
        if(userService.logout(userid)!=0){
            return "success";
        }else{
            return "fail";
        }
    }

    @RequestMapping(value="/deleteuser")
    public  String deleteUser(String userid){
        if(userService.deleteUser(userid)!=0&&cartService.deleteAllCart(userid)!=0){
            return "success";
        }else{
            return "fail";
        }
    }

    @RequestMapping(value="/queryuserbyname")
    public List<User> queryUserByName(String username){
        return userService.selectUserByName(username);
    }

    @RequestMapping(value="/queryuserbypassword")
    public List<User> queryUserByPassword(String userid,String password){
        return userService.selectUserByPassword(userid,password);
    }

    @RequestMapping(value="/queryuserbyonline")
    public List<User> queryUserByOnline(String username){
        return userService.selectUserByOnline(username);
    }

    @RequestMapping(value="/updatepassword")
    public String updatePassword(String userid, String password){
       if(userService.updatePassword(userid,password)!=0){
           return "success";
       }else{
           return "fail";
       }
    }


    @RequestMapping(value="/perfectuser")
    public List<User> perfectUser(String userid, String username, Integer age, String gender, String address, String phone, String email){
        if(userService.perfectUser(userid,username, age, gender, address, phone, email)!=0){
            return userService.selectUserByOnline(username);
        }else{
            return null;
        }
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public CartService getCartService() {
        return cartService;
    }

    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }
}
