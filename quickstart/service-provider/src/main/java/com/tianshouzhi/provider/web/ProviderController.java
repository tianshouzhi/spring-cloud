package com.tianshouzhi.provider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianshouzhi on 2018/4/21.
 */
@RestController
public class ProviderController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
