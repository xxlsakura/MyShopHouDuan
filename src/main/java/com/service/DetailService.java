package com.service;

import com.bean.Detail;

import java.util.List;

public interface DetailService {
    List<Detail> selectById(Integer id);
}
