package com.service;

import com.bean.User;
import com.bean.UserExample;
import com.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> selectUser(String username, String password) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        User user=new User();
        user.setOnline("true");
        userMapper.updateByExampleSelective(user,userExample);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public int updateUser(String username, String password, String phone) {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhone(phone);
        return userMapper.insertSelective(user);
    }

    @Override
    public int logout(String userid) {
        User user=new User();
        user.setOnline("false");
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andOnlineEqualTo("true");
        criteria.andUsernameEqualTo(userid);
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    public int deleteUser(String userid) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andOnlineEqualTo("true");
        criteria.andUsernameEqualTo(userid);
        return userMapper.deleteByExample(userExample);
    }

    @Override
    public int updatePassword(String userid,String password) {
        User user=new User();
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andOnlineEqualTo("true");
        criteria.andUsernameEqualTo(userid);
        user.setPassword(password);
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    public int perfectUser(String userid,String username, Integer age, String gender, String address, String phone, String email) {
        User user=new User();
        user.setUsername(username);
        user.setPhone(phone);
        if(age!=null&&!("".equals(age))){
            user.setAge(age);
        }
        if(gender!=null&&!("".equals(gender))){
            user.setGender(gender);
        }
        if(address!=null&&!("".equals(address))){
            user.setAddress(address);
        }
        if(email!=null&&!("".equals(email))){
            user.setEmail(email);
        }
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andOnlineEqualTo("true");
        criteria.andUsernameEqualTo(userid);
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    public List<User> selectUserByName(String username) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> selectUserByPassword(String userid,String password) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andPasswordEqualTo(password);
        criteria.andUsernameEqualTo(userid);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> selectUserByOnline(String username) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andOnlineEqualTo("true");
        criteria.andUsernameEqualTo(username);
        return userMapper.selectByExample(userExample);
    }


    public UserMapper getUserMapper() {
        return userMapper;
    }
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


}
