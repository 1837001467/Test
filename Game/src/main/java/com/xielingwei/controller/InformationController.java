package com.xielingwei.controller;

import com.github.pagehelper.PageInfo;
import com.xielingwei.pojo.Information;
import com.xielingwei.service.InformationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/information")
@CrossOrigin
public class InformationController {
    @Autowired
    private InformationServices is;

    @PostMapping("/add")
    private Integer add(@RequestBody Information i ){
        i.setItime(new Timestamp(System.currentTimeMillis()));
        is.doUpdate(i);
      return 1;
    }

    @RequestMapping("gaoji")
    public List<Information> selectBygaoji(@RequestParam(value = "iname",defaultValue = "1") String iname){
        return is.selectBygaoji(iname);
    }

}
