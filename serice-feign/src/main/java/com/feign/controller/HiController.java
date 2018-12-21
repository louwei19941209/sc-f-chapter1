package com.feign.controller;

import com.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sc-f-chapter1
 * @description:
 * @author: lou wei
 * @create: 2018-12-20 13:39
 **/
@RestController
public class HiController
{
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name)
    {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
