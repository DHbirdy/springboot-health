package com.ceair.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvpeng
 * @description
 * @date 2020/10/15-13:47
 */
@RestController
@CrossOrigin
public class TestController {
    @RequestMapping("test")
    public String test(){
        return "health";
    }
}
