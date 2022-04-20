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
        Bank bank =
                bankRepository.findBySwiftCode(swiftCode).orElseThrow(() -> new Exception("D001"));
        BankVo bankVo = bankMapper.toVo(bank);
        return bankVo;
    }

}
