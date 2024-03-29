package com.iotknowyou.controller.Topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send_0(){
        String context = "hi , i am message all";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("topicExchange","topic.1",context);
    }

    public void send_1(){
        String context = "hi , i am message 1";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("topicExchange","topic.message",context);
    }


    public void send_2(){
        String context = "hi , i am message 2";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("topicExchange","topic.messages",context);
    }
}
