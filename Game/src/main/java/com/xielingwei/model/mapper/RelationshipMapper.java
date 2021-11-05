package com.xielingwei.model.mapper;

import com.xielingwei.pojo.Relationship;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface RelationshipMapper {
    List<Relationship> selectAll();
}
