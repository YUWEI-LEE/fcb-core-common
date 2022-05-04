package tw.com.fcb.dolala.core.common.web;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import tw.com.fcb.dolala.core.config.IRConfig;
import tw.com.fcb.dolala.core.mq.Runner;

@Slf4j
@RestController
@RequestMapping("/mq")
public class MqController implements MqApi {
    @Autowired
    IRConfig irConfig;
    @Autowired
    Runner runner;

    //央行額度查詢
    @Override
    public void qryCdcQuotaCheck() throws Exception {

        log.info("呼叫讀取央行額度查詢API");
//        runner.sendMessage("send to mq CDC_Quota_Check)");
        log.info("傳送MQ資料 CDC_Quota_Check:");
    }

    //央媒申報格式檢核
    @Override
    public void checkCdcMedia() throws Exception {

        log.info("呼叫檢核央行媒體申報資料API");
//        runner.sendMessage("send to mq CDC_Media)");
        log.info("傳送MQ資料 CDC_Media:");
    }

    //檢核部位資料
    @Override
    public void checkPosition() throws Exception {

        log.info("呼叫檢核部位資料API");
//        runner.sendMessage("send to mq Position)");
        log.info("傳送MQ資料 Position:");
    }

    //聯行往來處理
    @Override
    public void callInterbankExchanges() throws Exception {

        log.info("呼叫處理聯行往來API");
//        runner.sendMessage("send to mq InterbankExchanges)");
        log.info("傳送MQ資料 InterbankExchanges:");
    }

    //SWIFT GPI狀態處理
    @Override
    public void callSwiftGpi() throws Exception {

        log.info("呼叫處理SWIFT GPI狀態API");
//        runner.sendMessage("send to mq SWIFT_GPI)");
        log.info("傳送MQ資料 SWIFT_GPI  :");

    }
}