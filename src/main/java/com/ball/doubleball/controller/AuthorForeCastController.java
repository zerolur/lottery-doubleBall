package com.ball.doubleball.controller;

import com.ball.doubleball.service.AuthorForeCastService;
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
 * @date 2019/3/510:16
 */
@RestController
@RequestMapping("author-forecast")
public class AuthorForeCastController {
    @Autowired
    AuthorForeCastService authorForeCastService;

    @RequestMapping("insertAuthorForeCast")
    public Map<String,Object> insertDoubleColor(@RequestParam Map<String, Object> params) {
        return authorForeCastService.insertAuthorForeCast(params);
    }
}
