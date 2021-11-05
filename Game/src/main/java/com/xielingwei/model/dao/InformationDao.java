package com.xielingwei.model.dao;

import com.xielingwei.pojo.Information;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationDao extends CrudRepository<Information,Integer> {
}
