package com.caps.consumer.service.fallback;

import com.caps.consumer.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}