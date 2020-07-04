package com.service;

import com.bean.Detail;
import com.bean.DetailExample;
import com.dao.DetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailServiceImpl implements DetailService{
    @Autowired
    public DetailMapper detailMapper;
    @Override
    public List<Detail> selectById(Integer id) {

        DetailExample detailExample=new DetailExample();
        DetailExample.Criteria criteria=detailExample.createCriteria();
        criteria.andIdEqualTo(id);
        return detailMapper.selectByExample(detailExample);

    }

    public DetailMapper getDetailMapper() {
        return detailMapper;
    }

    public void setDetailMapper(DetailMapper detailMapper) {
        this.detailMapper = detailMapper;
    }
}
