package com.xielingwei.model.mapper;

import com.xielingwei.pojo.Information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface InformationMapper {
    List<Information> selectLikes(String iname);
}
