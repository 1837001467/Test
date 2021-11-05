package com.xielingwei.controller;

import com.xielingwei.pojo.Relationship;
import com.xielingwei.service.RelationshipServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/relationship")
@CrossOrigin
public class RelationshipController {
    @Autowired
    private RelationshipServices rs;

    @GetMapping("all")
    public List<Relationship>  selectAll(){
        return rs.selectAll();
    }
}
