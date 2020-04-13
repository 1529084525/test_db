package com.xzx.testddb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuzhixiang
 * @date 2020/4/13 11:48
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "hello world";
    }
}
