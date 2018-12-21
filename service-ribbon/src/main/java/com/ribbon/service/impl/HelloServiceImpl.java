package com.ribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: sc-f-chapter1
 * @description:
 * @author: lou wei
 * @create: 2018-12-19 15:46
 **/
@Service
public class HelloServiceImpl
{
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") //该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串，字符串为"hi,"+name+",sorry,error!"
    public String hiService(String name)
    {
        return restTemplate.getForObject("http://service-hi/hi?name="+name, String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
