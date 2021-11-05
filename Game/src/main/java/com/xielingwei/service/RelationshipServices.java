package com.xielingwei.service;

import com.xielingwei.model.mapper.RelationshipMapper;
import com.xielingwei.pojo.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipServices {
    @Autowired
    RelationshipMapper mapper;
    public List<Relationship> selectAll(){
        return mapper.selectAll();
    }
}
