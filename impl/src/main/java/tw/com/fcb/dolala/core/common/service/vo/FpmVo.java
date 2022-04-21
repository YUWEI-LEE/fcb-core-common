package tw.com.fcb.dolala.core.common.service.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FpmVo {

    private Long id;

    private String fpmCurrency;

    private BigDecimal fpmBalance;

}
