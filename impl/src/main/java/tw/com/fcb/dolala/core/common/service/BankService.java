package tw.com.fcb.dolala.core.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.fcb.dolala.core.common.repository.BankRepository;
import tw.com.fcb.dolala.core.common.repository.entity.Bank;
import tw.com.fcb.dolala.core.common.service.mapper.BankMapper;
import tw.com.fcb.dolala.core.common.service.vo.BankVo;

@Transactional
@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;

    @Autowired
    BankMapper bankMapper;

    public BankVo findBySwiftCode(String swiftCode) throws Exception {
//        BankVo bankVo = new BankVo();
        Bank bank =
                bankRepository.findBySwiftCode(swiftCode).orElseThrow(() -> new Exception("D001"));
                                                                //Exception("DZZZ:戶名欄位未輸入")
                                                                //Exception("D001,(帶其他參數值)")
//        BeanUtils.copyProperties(bank, bankVo);
        BankVo bankVo = bankMapper.toVo(bank);
        return bankVo;
    }

}
