package tw.com.fcb.dolala.core.common.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FPC")
@Data
public class Fpc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FPC_ACCOUNT")
    private String fpcAccount;

    @Column(name = "FPC_CUSTOMER_ID")
    private String fpcCustomerId;

    @Column(name = "FPC_VALID_CRCY_CNT")
    private Integer validCrcyCnt;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "FPC_LINK_ID",nullable = false)
    List<Fpm> fpm;

}
