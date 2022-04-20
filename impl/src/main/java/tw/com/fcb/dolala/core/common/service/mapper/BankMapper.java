package tw.com.fcb.dolala.core.common.service.mapper;

import org.mapstruct.Mapper;
import tw.com.fcb.dolala.core.common.repository.entity.Bank;
import tw.com.fcb.dolala.core.common.service.vo.BankVo;

/**
 * Copyright (C),2022,FirstBank
 * FileName: BankMapper
 * Author: Han-Ru
 * Date: 2022/4/17 下午 03:04
 * Description: BankMapper
 */
@Mapper
public interface BankMapper {

    BankVo toVo(Bank bank);
}
