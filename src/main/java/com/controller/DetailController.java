package com.controller;

import com.bean.Detail;
import com.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetailController {
    @Autowired
    public DetailService detailService;

    @RequestMapping("/querybyid")
    public List<Detail> queryById(Integer id){

        return detailService.selectById(id);
    }

    public DetailService getDetailService() {
        return detailService;
    }

    public void setDetailService(DetailService detailService) {
        this.detailService = detailService;
    }
}
