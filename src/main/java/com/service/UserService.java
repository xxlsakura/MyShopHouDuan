package com.service;

import com.bean.User;

import java.util.List;

public interface UserService {
    List<User> selectUser(String username, String password);
    int updateUser(String username, String password,String phone);
    int logout(String userid);
    int deleteUser(String userid);
    int updatePassword(String userid,String password);
    int perfectUser(String userid,String username,Integer age,String gender,String address,String phone,String email);
    List<User> selectUserByName(String username);
    List<User> selectUserByPassword(String userid,String password);
    List<User> selectUserByOnline(String username);
}
