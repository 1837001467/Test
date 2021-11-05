package com.xielingwei.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xielingwei.model.dao.InformationDao;
import com.xielingwei.model.mapper.InformationMapper;
import com.xielingwei.pojo.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServices {
    @Autowired
    InformationDao   dao;
    @Autowired
    InformationMapper mapper;

    public Integer doUpdate(Information u){
        u=dao.save(u);
        return u.getId();
    }

    public List<Information>  selectBygaoji(  String iname){
        List<Information> list = mapper.selectLikes(iname);/*调用mapper的查询方法*/
        return  list;
    }
}
