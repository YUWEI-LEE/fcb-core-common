package tw.com.fcb.dolala.core.common.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "Fpm")
@Data
public class FpmDto {

    @Schema(description = "id")
    private Long id;

    @Schema(description = "幣別")
    private String fpmCurrency;

    @Schema(description = "餘額")
    private BigDecimal fpmBalance;

}
