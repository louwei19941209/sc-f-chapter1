package com.feign.service.impl;

import com.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @program: sc-f-chapter1
 * @description:
 * @author: lou wei
 * @create: 2018-12-20 15:49
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi
{
    @Override
    public String sayHiFromClientOne(String name)
    {
        return "sorry "+name;
    }
}
