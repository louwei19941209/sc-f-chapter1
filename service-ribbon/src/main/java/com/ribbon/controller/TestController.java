package com.ribbon.controller;

import com.ribbon.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sc-f-chapter1
 * @description: 测试
 * @author: lou wei
 * @create: 2018-12-19 15:43
 **/
@RestController
public class TestController
{
    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name)
    {
        return helloService.hiService(name);
    }
}
