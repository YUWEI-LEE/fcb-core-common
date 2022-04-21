package tw.com.fcb.dolala.core.common.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "FPM")
@Data
public class Fpm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FPM_CRCY")
    private String fpmCurrency;

    @Column(name = "FPM_BAL")
    private BigDecimal fpmBalance;

}
