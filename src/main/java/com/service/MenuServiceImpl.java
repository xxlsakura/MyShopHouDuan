package com.service;

import com.bean.Menu;
import com.bean.MenuExample;
import com.dao.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    public MenuMapper menuMapper;
    @Override
    public List<Menu> selectAll() {
        return menuMapper.selectByExample(new MenuExample());
    }

    public MenuMapper getMenuMapper() {
        return menuMapper;
    }

    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }
}
