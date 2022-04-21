package tw.com.fcb.dolala.core.common.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.fcb.dolala.core.common.repository.FpcRepository;
import tw.com.fcb.dolala.core.common.repository.FpmRepository;
import tw.com.fcb.dolala.core.common.repository.entity.Fpc;
import tw.com.fcb.dolala.core.common.repository.entity.Fpm;
import tw.com.fcb.dolala.core.common.service.vo.FpmVo;

import java.math.BigDecimal;
import java.util.List;

@Transactional
@Service
public class FpService {

    @Autowired
    FpcRepository fpcRepository;

    @Autowired
    FpmRepository fpmRepository;

    public FpmVo getByFpmCurrency(String account, String crcy) throws Exception {
        FpmVo fpmVo = new FpmVo();
        Fpc fpc = fpcRepository.findByFpcAccount(account).orElseThrow(() -> new Exception("D001"));
        List<Fpm> fpmList = fpc.getFpm();
        for (Fpm fpm : fpmList) {
            if (fpm.getFpmCurrency().equals(crcy)) {
                BeanUtils.copyProperties(fpm, fpmVo);
            }
        }
        return fpmVo;
    }

    public Integer updateFpmBalance(String account, String crcy, BigDecimal amt) throws Exception {
        Fpm fpm = null;
        Fpc fpc = fpcRepository.findByFpcAccount(account).orElseThrow(() -> new Exception("D001"));
        List<Fpm> fpmList = fpc.getFpm();
        for (Fpm idx : fpmList) {
            if (idx.getFpmCurrency().equals(crcy)) {
                fpm = idx;
                BigDecimal bal = idx.getFpmBalance().add(amt);
                fpm.setFpmBalance(bal);
                fpmRepository.save(fpm);
            }
        }
        return 0;
    }


}
