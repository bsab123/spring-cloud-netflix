package com.caps.consumer.controller;

import com.caps.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return feignService.sayHi(message);
    }
}