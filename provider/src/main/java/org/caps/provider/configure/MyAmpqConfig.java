package org.caps.provider.configure;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * API：BindingBuilder.bind(指定队列).to(交换机).with(路由键);
 */
@Configuration
public class MyAmpqConfig {
    final static String tpm = "topic.message";
    final static String tp1m = "topic1.message";
    final static String tpm1 = "topic.message1";
    final static String tpm2 = "topic.message2";

    @Bean
    public Queue tpm() {
        return new Queue(MyAmpqConfig.tpm);
    }

    @Bean
    public Queue tp1m() {
        return new Queue(MyAmpqConfig.tp1m);
    }

    @Bean
    public Queue tpm1() {
        return new Queue(MyAmpqConfig.tpm1);
    }

    @Bean
    public Queue tpm2() {
        return new Queue(MyAmpqConfig.tpm2);
    }

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("topic.exchange");
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanout.exchange");
    }

    @Bean
    DirectExchange directExchange() {
        return new DirectExchange("direct.exchange");
    }

    /**
     * topic单播，只给topic.message发送
     * @param tpm
     * @param topicExchange
     * @return
     */
    @Bean
    Binding bindingTopicExchangeMessage(Queue tpm, TopicExchange topicExchange) {
        return BindingBuilder.bind(tpm).to(topicExchange).with("topic.message");
    }

    /**
     * Fanout广播，给绑定fanoutExchange的queues全部发送
     * @param tpm
     * @param fanoutExchange
     * @return
     */
    @Bean
    Binding bindingFanoutExchangeMessage(Queue tpm, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(tpm).to(fanoutExchange);
    }

    /**
     * 绑定规则
     * @param tpm
     * @param directExchange
     * @return
     */
    @Bean
    Binding bindingDirectExchangeMessage(Queue tpm,DirectExchange directExchange) {
        return BindingBuilder.bind(tpm).to(directExchange).with("topic.message#");
    }
}
