package com.caps.consumer.service;

import com.caps.consumer.service.fallback.FeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-service-provider", fallback = FeignServiceHystrix.class)
public interface FeignService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);
}