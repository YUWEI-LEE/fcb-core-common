package tw.com.fcb.dolala.core.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Copyright (C),2022,FirstBank
 * FileName: Receiver
 * Author: Han-Ru
 * Date: 2022/5/1 下午 10:27
 * Description:
 */
@Component
@Slf4j
public class Receiver {
    CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        log.debug("{}", message);
        latch.countDown();
    }


    public CountDownLatch getLatch() {
        return latch;
    }

}
