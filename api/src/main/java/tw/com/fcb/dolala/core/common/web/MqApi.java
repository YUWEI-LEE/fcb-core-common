package tw.com.fcb.dolala.core.common.web;

import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.Operation;

public interface MqApi {

    //央行額度查詢
    @GetMapping("/getCdcQuota")
    @Operation(description = "讀取央行結匯額度", summary = "讀取央行結匯額度")
    public void qryCdcQuotaCheck() throws Exception;
    
    //檢核央行申報資料
    @GetMapping("/checkCdcMedia")
    @Operation(description = "檢核央行申報資料", summary = "檢核央行申報資料")
    public void checkCdcMedia() throws Exception;
    
    //檢核部位資料
    @GetMapping("/checkPosition")
    @Operation(description = "檢核部位資料", summary = "檢核部位資料")
    public void checkPosition() throws Exception;
    
    //聯行往來處理
    @GetMapping("/callInterbankExchanges")
    @Operation(description = "聯行往來處理", summary = "聯行往來處理")
    public void callInterbankExchanges() throws Exception;
    
    //SWIFT GPI狀態處理
    @GetMapping("/callSwiftGpi")
    @Operation(description = "SWIFT GPI狀態處理", summary = "SWIFT GPI狀態處理")
    public void callSwiftGpi() throws Exception;
}