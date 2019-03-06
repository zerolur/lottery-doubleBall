package com.ball.doubleball.controller;

import com.alibaba.fastjson.JSONArray;
import com.ball.doubleball.service.DoubleColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/2/2017:17
 */
@RestController
@RequestMapping("double-color")
public class DoubleColorController {

    @Autowired
    DoubleColorService doubleColorService;

    @RequestMapping("insertDoubleColor")
    public void insertDoubleColor(@RequestParam Map<String, Object> params) {
        JSONArray ssqList = JSONArray.parseArray(params.get("ssqList").toString());
        System.out.println(doubleColorService.insertDoubleColor(ssqList));
    }
}

