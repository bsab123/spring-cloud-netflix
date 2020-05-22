package org.caps.provider.controller;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * API：amqpTemplate.convertAndSend("交换机名"，“路由键”，“消息内容”)
 */
@RestController
public class RabbitSenderController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "rabbit",method = RequestMethod.GET)
    public String rabbitSender(){
        try {
            for (int i = 0; i < 5; i++) {
                rabbitTemplate.convertAndSend("topic.exchange","tpm","hello"+new Date());
            }
            return "send success";
        } catch (AmqpException e) {
            e.printStackTrace();
            return "send error";
        }
    }

}
