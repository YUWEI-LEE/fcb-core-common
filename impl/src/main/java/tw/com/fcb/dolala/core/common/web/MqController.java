package tw.com.fcb.dolala.core.common.web;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import tw.com.fcb.dolala.core.config.IRConfig;

@Slf4j
@RestController
@RequestMapping("/mq")
public class MqController  implements MqApi {
	@Autowired
    IRConfig irConfig;
	
	//央行額度查詢
    @Override
    public void qryCdcQuotaCheck() {
        
        log.info("呼叫讀取央行額度查詢API");
    }
    
    //央媒申報格式檢核
    @Override
    public void checkCdcMedia() {
        
        log.info("呼叫檢核央行媒體申報資料API");
    }
    
    //檢核部位資料
    @Override
    public void checkPosition() {
        
        log.info("呼叫檢核部位資料API");
    }
    
    //聯行往來處理
    @Override
    public void callInterbankExchanges() {
        
        log.info("呼叫處理聯行往來API");
    }
    
    //SWIFT GPI狀態處理
    @Override
    public void callSwiftGpi() {
        
        log.info("呼叫處理SWIFT GPI狀態API");
    }
}