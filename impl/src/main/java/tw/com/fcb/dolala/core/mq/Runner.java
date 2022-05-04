package tw.com.fcb.dolala.core.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tw.com.fcb.dolala.core.FcbCoreCommonApplication;


import java.util.concurrent.TimeUnit;

/**
 * Copyright (C),2022,FirstBank
 * FileName: Runner
 * Author: Han-Ru
 * Date: 2022/5/1 下午 10:19
 * Description: mq runner
 */
@Component
@Slf4j
public class Runner implements CommandLineRunner {

    RabbitTemplate rabbitTemplate;
    Receiver receiver;

    public Runner(Receiver receiver, RabbitTemplate rabbitTemplate) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("==== sending a message to MQ====");
//        rabbitTemplate.convertAndSend(FcbCoreCommonApplication.topic, "fcb.dolala.sample", "sending message from dolala");
//        receiver.getLatch().await(1000, TimeUnit.SECONDS);
    }

    public void sendMessage(String mqMessage) throws Exception {
//        rabbitTemplate.convertAndSend(FcbCoreCommonApplication.topic, "fcb.dolala.sample", "sending message from dolala");
//        log.debug("sendMessage" + mqMessage);

    }
}
